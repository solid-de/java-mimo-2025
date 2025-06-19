package edu.mimo.books.model;

import java.util.List;

public class Origine {
    
    private List<String> pays;
    private Climat climat;
    
    public Origine(List<String> pays, Climat climat) {
        this.climat = climat;
        this.pays = pays;
    }
    public List<String> getPays() {
        return pays;
    }
    public void setPays(List<String> pays) {
        this.pays = pays;
    }
    public Climat getClimat() {
        return climat;
    }
    public void setClimat(Climat climat) {
        this.climat = climat;
    }

    
}
