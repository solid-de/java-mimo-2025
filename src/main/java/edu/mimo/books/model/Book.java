package edu.mimo.books.model;

public class Book implements Product{

    private int id;
    private String isbn;
    private String title;
    private String author;
    private int pubYear;
    private int price;

    public Book() {}

    public Book(int id, String isbn, String title, String author, int pubYear, int price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.price = price;
    }

    @Override
    public String code() {
        return isbn;
    }

    @Override
    public String label() {
        return title;
    }

    @Override
    public String description() {
        return "Book: " + title +
                ", Author: " + author +
                ", Year: " + pubYear;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return Category.BOOK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
