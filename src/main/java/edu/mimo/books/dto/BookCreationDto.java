package edu.mimo.books.dto;

public class BookCreationDto {
    
    private String isbn;
    private String title;
    private String authorName;
    private String country;
    private String originalLanguage;
    private Integer year;

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

    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
} 