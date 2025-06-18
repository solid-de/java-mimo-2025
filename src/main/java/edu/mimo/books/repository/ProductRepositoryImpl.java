package edu.mimo.books.repository;

import java.util.ArrayList;
import java.util.List;

import edu.mimo.books.model.Book;
import edu.mimo.books.model.Displayable;
import edu.mimo.books.model.Notebook;
import edu.mimo.books.model.Pen;

public class ProductRepositoryImpl implements ProductRepository {

    
    @Override
    public List<Displayable> allProductsForDisplay() {
        List<Displayable> result = new ArrayList<>();
        
        List<Book> allBooks = allBooks();
        for (Book book : allBooks) {
            result.add(book);
        }

        List<Pen> pens = allPens();
        for (Pen pen : pens) {
            result.add(pen);
        }

        List<Notebook> notebooks = allNotebooks();
        for (Notebook notebook : notebooks) {
            result.add(notebook);
        }

        return result;
    }

    @Override
    public Book getBook(String isbn) {
        List<Book> allBooks = allBooks();
        for (Book book : allBooks) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private List<Book> allBooks() {
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

        return List.of(
            book1,
            book2,
            book3
        );
    }

    private List<Pen> allPens() {
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
        return List.of(
            pen1,
            pen2,
            pen3,
            pen4
        );
    }

    private List<Notebook> allNotebooks() {
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

        return List.of(
            notebook1,
            notebook2,
            notebook3,
            notebook4
        );


    }

}
