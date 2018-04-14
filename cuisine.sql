-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2018 at 12:35 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cuisine`
--

-- --------------------------------------------------------

--
-- Table structure for table `composer`
--

CREATE TABLE `composer` (
  `id_Recette` int(11) NOT NULL,
  `id_Ingredient` int(11) NOT NULL,
  `quantite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `composer`
--

INSERT INTO `composer` (`id_Recette`, `id_Ingredient`, `quantite`) VALUES
(1, 5, 3),
(1, 7, 1),
(1, 9, 100),
(2, 2, 300),
(2, 3, 100),
(2, 4, 100),
(2, 10, 4),
(3, 2, 300),
(3, 10, 4),
(3, 11, 250),
(3, 12, 125);

-- --------------------------------------------------------

--
-- Table structure for table `etape`
--

CREATE TABLE `etape` (
  `id_Recette` int(11) NOT NULL,
  `num_Ordre` tinyint(4) NOT NULL,
  `libelle` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `etape`
--

INSERT INTO `etape` (`id_Recette`, `num_Ordre`, `libelle`) VALUES
(1, 1, 'Etaler la tarte sur un plat'),
(2, 1, 'Verser la farine dans un saladier'),
(3, 1, 'Verser la farine dans un saladier'),
(3, 2, 'Casser les œufs dans le saladier');

-- --------------------------------------------------------

--
-- Table structure for table `ingredient`
--

CREATE TABLE `ingredient` (
  `id` tinyint(4) NOT NULL,
  `libelle` varchar(25) NOT NULL,
  `unite` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ingredient`
--

INSERT INTO `ingredient` (`id`, `libelle`, `unite`) VALUES
(1, 'lait', 'centilitre'),
(2, 'farine', 'gramme'),
(3, 'chocolat', 'gramme'),
(4, 'sucre', 'gramme'),
(5, 'pomme', 'unite'),
(6, 'beurre', 'gramme'),
(7, 'pate brisee', 'unite'),
(8, 'pate feuilletee', 'unite'),
(9, 'Nutella', 'gramme'),
(10, 'Oeuf', 'unite'),
(11, 'lardons', 'gramme'),
(12, 'Fromage rape', 'gramme');

-- --------------------------------------------------------

--
-- Table structure for table `recette`
--

CREATE TABLE `recette` (
  `id` tinyint(4) NOT NULL,
  `libelle` varchar(30) NOT NULL,
  `url_image` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `recette`
--

INSERT INTO `recette` (`id`, `libelle`, `url_image`) VALUES
(1, 'Tarte au chocolat', 'http://static.750g.com/images/1200-630/339030461f5f653459da58eb5b7b2028/tarte-au-chocolat.jpg'),
(2, 'Cookies', 'https://cldup.com/_d6DG7yyR8.png'),
(3, 'Quiche lorraine', 'https://files.meilleurduchef.com/mdc/photo/recette/quiche-lorraine/quiche-lorraine-2-640.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `composer`
--
ALTER TABLE `composer`
  ADD PRIMARY KEY (`id_Recette`,`id_Ingredient`);

--
-- Indexes for table `etape`
--
ALTER TABLE `etape`
  ADD PRIMARY KEY (`id_Recette`,`num_Ordre`);

--
-- Indexes for table `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `recette`
--
ALTER TABLE `recette`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `id` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `recette`
--
ALTER TABLE `recette`
  MODIFY `id` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
