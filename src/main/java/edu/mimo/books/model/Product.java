package edu.mimo.books.model;

public interface Product {

    String code();
    String label();
    String description();
    int price();
    Category category();
}
