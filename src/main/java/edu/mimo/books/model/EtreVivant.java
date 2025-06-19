package edu.mimo.books.model;

public class EtreVivant {
    
    private String id;
    private String espece;
    private String variete;
    private int esperanceDeVie;
    private int taille;
    private Origine origine;

    public String getEspece() {
        return espece;
    }
    public void setEspece(String espece) {
        this.espece = espece;
    }
    public String getVariete() {
        return variete;
    }
    public void setVariete(String variete) {
        this.variete = variete;
    }
    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }
    public void setEsperanceDeVie(int esperanceDeVie) {
        this.esperanceDeVie = esperanceDeVie;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public Origine getOrigine() {
        return origine;
    }
    public void setOrigine(Origine origine) {
        this.origine = origine;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
}
