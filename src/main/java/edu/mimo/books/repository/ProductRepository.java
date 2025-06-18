package edu.mimo.books.repository;

import java.util.List;

import edu.mimo.books.model.Book;
import edu.mimo.books.model.Displayable;

public interface ProductRepository {
    
    List<Displayable> allProductsForDisplay();

    Book getBook(String isbn);

}
