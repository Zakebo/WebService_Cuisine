/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Philippe
 */
public class GestionCuisine
{
    private static ArrayList<Ingredient> lesResultats = new ArrayList<Ingredient>();
    private static ArrayList<Etape> lesEtapes = new ArrayList<Etape>();
    private static ArrayList<Recette> lesRecettes;
    private static Recette uneRecette;
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static String pilote = "org.gjt.mm.mysql.Driver";
    private static String url = new String("jdbc:mysql://localhost/cuisine");
    public static ArrayList<Recette> ListeRecettes()
    {
        try
        {
            lesRecettes = new ArrayList<Recette>();
            Class.forName(pilote);
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();			            
            rs = stmt.executeQuery("select * from recette");
            while (rs.next())
            {
                uneRecette = new Recette(rs.getInt("id") ,rs.getString("libelle"), rs.getString("url_image"));
                lesRecettes.add(uneRecette);
            }
            rs.close();
            stmt.close();
            conn.close();
            return lesRecettes;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static ArrayList<Ingredient> ingredientsRecette(int id)
    {
        try
        {
            Ingredient unIngredient;
            lesResultats = new ArrayList<Ingredient>();
            Class.forName(pilote);
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();			            
            rs = stmt.executeQuery("select * "
                    + "from composer s,ingredient i "
                    + "where id_Recette = '" + id + "' "                    
                    + "and id_ingredient = i.id "
                    + "order by i.id ");
            while (rs.next())
            {
                unIngredient = new Ingredient(rs.getInt("id"), rs.getString("libelle"),rs.getString("unite"),rs.getDouble("quantite"));
                lesResultats.add(unIngredient);
            }
            rs.close();
            stmt.close();
            conn.close();
            return lesResultats;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static ArrayList<Etape> EtapesRecette(int id)
    {
        try
        {
            Etape uneEtape;
            lesEtapes = new ArrayList<Etape>();
            Class.forName(pilote);
            conn = DriverManager.getConnection(url,"root","");
            stmt = conn.createStatement();			            
            rs = stmt.executeQuery("select * "
                    + "from etape "
                    + "where id_Recette = " + id + " "                     
                    + "order by num_Ordre ");
            while (rs.next())
            {
                uneEtape = new Etape(rs.getInt("num_Ordre"),rs.getString("libelle"));
                lesEtapes.add(uneEtape);
            }
            rs.close();
            stmt.close();
            conn.close();
            return lesEtapes;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
