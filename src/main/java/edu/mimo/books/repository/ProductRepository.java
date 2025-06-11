package edu.mimo.books.repository;

import edu.mimo.books.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> findAll();

    Optional<Product> findByCode(String code);

}
