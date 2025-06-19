package edu.mimo.books.model;

public class Animal extends EtreVivant {
    
    private boolean vertebre;
    private int nbrPattes;

    public boolean isVertebre() {
        return vertebre;
    }
    public void setVertebre(boolean vertebre) {
        this.vertebre = vertebre;
    }
    public int getNbrPattes() {
        return nbrPattes;
    }
    public void setNbrPattes(int nbrPattes) {
        this.nbrPattes = nbrPattes;
    }

    
}
