package edu.mimo.books.repository;

import edu.mimo.books.model.Book;
import edu.mimo.books.model.Pen;
import edu.mimo.books.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products;

    public InMemoryProductRepository() {
        products = new ArrayList<>();
        products.addAll(List.of(
                new Book(1, "978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008, 45),
                new Book(2, "978-0-321-35668-0", "Effective Java", "Joshua Bloch", 2017, 50),
                new Book(3, "978-0-596-52068-7", "Head First Design Patterns", "Eric Freeman", 2004, 55),
                new Book(4, "978-0-134-68599-8", "Java: The Complete Reference", "Herbert Schildt", 2020, 60),
                new Book(5, "978-1-491-95039-8", "Learning React", "Alex Banks", 2020, 42),
                new Book(6, "978-0-321-12742-6", "Introduction to Algorithms", "Thomas H. Cormen", 2009, 85),
                new Book(7, "978-0-13-595705-9", "Spring in Action", "Craig Walls", 2018, 48),
                new Book(8, "978-1-449-37019-6", "Python Crash Course", "Eric Matthes", 2019, 35)
        ));

        products.addAll(List.of(
                new Pen(101, "Blue", "BIC", 2),
                new Pen(102, "Black", "Pilot", 15),
                new Pen(103, "Red", "Montblanc", 450),
                new Pen(104, "Green", "Parker", 75),
                new Pen(105, "Purple", "Zebra", 8),
                new Pen(106, "Orange", "Sharpie", 3),
                new Pen(107, "Pink", "Faber-Castell", 12),
                new Pen(108, "Black", "Cross", 125),
                new Pen(109, "Blue", "Waterman", 200),
                new Pen(110, "Silver", "Lamy", 35)
        ));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Optional<Product> findByCode(String code) {
        for (Product product : products) {
            if(product.code().equals(code)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
