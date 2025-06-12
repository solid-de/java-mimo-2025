package edu.mimo.books.model;

public class Notebook {

    private String sku;
    private String label;
    private String brand;
    private int price;
    private String cover;
    private int pages;

    /** LLM generated data
     // School/Office notebooks
     Notebook notebook1 = new Notebook("MOL-CLS-001", "Classic Notebook Large", "Moleskine", 2199, "Hardcover", 240);
     Notebook notebook2 = new Notebook("RHO-DOT-A5", "Rhodia Dot Pad", "Rhodia", 1599, "Softcover", 160);
     Notebook notebook3 = new Notebook("LEU-A5-LIN", "Leuchtturm1917 Medium", "Leuchtturm1917", 2299, "Hardcover", 249);

     // Budget notebooks
     Notebook notebook4 = new Notebook("CVS-COMP-70", "Composition Book", "CVS", 299, "Softcover", 70);
     Notebook notebook5 = new Notebook("MED-SPR-100", "Spiral Notebook", "Mead", 399, "Softcover", 100);
     Notebook notebook6 = new Notebook("FVE-STR-80", "Five Star Spiral", "Five Star", 549, "Softcover", 80);

     // Specialty notebooks
     Notebook notebook7 = new Notebook("FLD-WP-48", "Waterproof Notepad", "Rite in the Rain", 899, "Softcover", 48);
     Notebook notebook8 = new Notebook("ROK-DOT-192", "Dot Grid Notebook", "Rocketbook", 3199, "Hardcover", 192);
     Notebook notebook9 = new Notebook("BAR-SQ-200", "Baron Fig Squire", "Baron Fig", 2499, "Softcover", 200);
     */
    public Notebook(String sku, String label, String brand, int price, String cover, int pages) {
        this.sku = sku;
        this.label = label;
        this.brand = brand;
        this.price = price;
        this.cover = cover;
        this.pages = pages;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
