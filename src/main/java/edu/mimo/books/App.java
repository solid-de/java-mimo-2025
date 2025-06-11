package edu.mimo.books;

import edu.mimo.books.model.Book;
import edu.mimo.books.model.Category;
import edu.mimo.books.model.Product;
import edu.mimo.books.repository.InMemoryProductRepository;
import edu.mimo.books.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    private static final ProductRepository productRepository = new InMemoryProductRepository();

    public static void main(String[] args) {



        int totalProducts = productRepository.findAll().size();

        System.out.println("We have a total of " + totalProducts + " products");

        String invalidCode = "invalid code";
        displayProduct(invalidCode);

        String validCode = "978-0-13-468599-1";
        displayProduct(validCode);

        System.out.println("-------------------");
        System.out.println("Listing all books");
        System.out.println("-------------------");

        //Java old imperative way:
        System.out.println("IMPERATIVE WAY:");
        List<Product> allProducts = productRepository.findAll();
        List<Book> allBooksOldWay = new ArrayList<>();
        for (Product product : allProducts) {
            if(product.category() == Category.BOOK) {
                allBooksOldWay.add((Book) product);
            }
        }
        for(Book book : allBooksOldWay) {
            System.out.println(book.getTitle());
        }

        System.out.println("-------------------");
        System.out.println("FUNCTIONAL WAY:");
        List<Book> allBooks = productRepository.findAll().stream()
                .filter(product -> product.category() == Category.BOOK)
                .map(book -> (Book) book)
                .toList();

        allBooks.forEach(book -> {
            System.out.println(book.getTitle());
        });


    }

    private static void displayProduct(String productCode) {
        Optional<Product> fromRepository = productRepository.findByCode(productCode);
        if (fromRepository.isPresent()) {//Avoid this pattern
            System.out.println("Found Product for code: " + productCode);
            Product product = fromRepository.get();
            System.out.println(product.label());
        } else {
            System.out.println("Could not find product for code: " + productCode);
        }

        fromRepository.ifPresentOrElse(
                product -> {
                    System.out.println("Found Product for code: " + productCode);
                    System.out.println(product.label());
                },
                () -> System.out.println("Could not find product for code: " + productCode)
        );
    }
}
