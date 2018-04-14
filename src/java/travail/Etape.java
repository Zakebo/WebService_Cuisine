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
public class Etape {
    int noOrdre;
    String libelle;

    public Etape() {
    }

    public Etape(int noOrdre, String libelle) {
        this.noOrdre = noOrdre;
        this.libelle = libelle;
    }

    public void setNoOrdre(int noOrdre) {
        this.noOrdre = noOrdre;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNoOrdre() {
        return noOrdre;
    }

    public String getLibelle() {
        return libelle;
    }
    
}
