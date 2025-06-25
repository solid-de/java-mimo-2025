package edu.mimo.books.model;

public enum Country {
    FRANCE("République Française");

    private final String label;

    Country(String label) {
        this.label = label;
    }


    public String getLabel() {
        return label;
    }
    
}
