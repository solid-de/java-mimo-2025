package edu.mimo.books.model;

public class Book implements Displayable, HavingPrice {

    private String isbn;
    private String title;
    private int price;
    private int pages;
    private String author;

    /** LLM assisted data:
     Book book1 = new Book("978-0-374-52797-9", "The Brothers Karamazov", 1899, 824, "Fyodor Dostoevsky");
     Book book2 = new Book("978-0-14-303943-3", "The Grapes of Wrath", 1699, 464, "John Steinbeck");
     Book book3 = new Book("978-0-14-044912-9", "Madame Bovary", 1549, 368, "Gustave Flaubert");
     Book book4 = new Book("978-0-14-143974-8", "Mansfield Park", 1449, 560, "Jane Austen");
     Book book5 = new Book("978-0-385-47454-2", "Things Fall Apart", 1399, 209, "Chinua Achebe");

     Book book6 = new Book("978-0-14-044568-8", "Das Kapital", 2299, 1152, "Karl Marx");
     Book book7 = new Book("978-0-226-77662-8", "The Wealth of Nations", 1999, 976, "Adam Smith");
     Book book8 = new Book("978-0-14-043205-3", "The Origin of Species", 1799, 703, "Charles Darwin");

     Book book9 = new Book("978-0-201-83595-3", "The Mythical Man-Month", 4599, 336, "Frederick P. Brooks Jr.");
     Book book10 = new Book("978-0-262-03384-8", "Introduction to Algorithms", 12999, 1312, "Thomas H. Cormen");
     Book book11 = new Book("978-0-201-89683-1", "The Art of Computer Programming Volume 1", 8999, 672, "Donald E. Knuth");

     */
    public Book(String isbn, String title, int price, int pages, String author) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.author = author;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String display() {
        return this.isbn + " - " + this.title;
    }
}
