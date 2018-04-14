/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail;

/**
 *
 * @author C103-image
 */
public class Ingredient {
    int id;
    String libelle;
    String unite;
    double quantite;

    public Ingredient() {
    }

    public Ingredient(int id, String libelle, String unite, double quantite) {
        this.id = id;
        this.libelle = libelle;
        this.unite = unite;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getUnite() {
        return unite;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
}
