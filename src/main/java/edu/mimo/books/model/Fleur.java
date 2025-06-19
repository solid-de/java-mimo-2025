package edu.mimo.books.model;

public class Fleur extends EtreVivant {
    
    private Couleur couleur;
    private int nbrPetales;

    public Couleur getCouleur() {
        return couleur;
    }
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    public int getNbrPetales() {
        return nbrPetales;
    }
    public void setNbrPetales(int nbrPetales) {
        this.nbrPetales = nbrPetales;
    }
    
}
