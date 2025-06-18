package edu.mimo.books.model;

public class Pen implements Displayable, HavingPrice {

    private String sku;
    private String label;
    private String brand;
    private String color;
    private int price;

    /** LLM generated data:
     // Ballpoint pens
     Pen pen1 = new Pen("BIC-001-BLK", "Cristal Original", "BIC", "Black", 149);
     Pen pen2 = new Pen("PIR-205-BLU", "FriXion Ball", "Pilot", "Blue", 299);
     Pen pen3 = new Pen("UNI-150-RED", "Jetstream RT", "Uni-ball", "Red", 349);

     // Gel pens
     Pen pen4 = new Pen("ZEB-301-GRN", "F-301 Gel", "Zebra", "Green", 399);
     Pen pen5 = new Pen("PIR-G2-PRP", "G2 Premium Gel", "Pilot", "Purple", 449);
     Pen pen6 = new Pen("PEN-RSVP-BLK", "R.S.V.P.", "Pentel", "Black", 199);

     // Premium pens
     Pen pen7 = new Pen("PAR-IM-SLV", "IM Premium", "Parker", "Silver", 2999);
     Pen pen8 = new Pen("CRS-ATX-GLD", "ATX Gold", "Cross", "Gold", 7599);
     */

    public Pen(String sku, String label, String brand, String color, int price) {
        this.sku = sku;
        this.label = label;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getLabel() {
        return "Pen: " + label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String display() {
        return this.getSku() + " - " + this.getLabel();
    }
}
