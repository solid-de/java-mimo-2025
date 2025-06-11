package edu.mimo.books.model;

public class Pen implements Product{

    private int id;
    private String color;
    private String brand;
    private int price;

    public Pen() {}

    public Pen(int id, String color, String brand, int price) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String code() {
        return id + "";
    }

    @Override
    public String label() {
        return color + " Pen.";
    }

    @Override
    public String description() {
        return label() + ". Brand: " + getBrand();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return Category.PEN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}
