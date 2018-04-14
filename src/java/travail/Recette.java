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
public class Recette {

    int id;
    String libelle;
    String img;
    
    public Recette(){
        
    }

    public Recette(int id, String libelle, String img) {
        this.id = id;
        this.libelle = libelle;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getImg() {
        return img;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setImg(String img) {
        this.img = img;
    }
    
}
