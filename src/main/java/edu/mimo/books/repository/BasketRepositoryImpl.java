package edu.mimo.books.repository;

import java.util.ArrayList;
import java.util.List;

import edu.mimo.books.model.Book;
import edu.mimo.books.model.HavingPrice;

public class BasketRepositoryImpl implements BasketRepository {
    
    private ProductRepository productRepository;

    public BasketRepositoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<HavingPrice> getBasket() {
        List<HavingPrice> basketProducts = new ArrayList<>();
        Book book797 = productRepository.getBook("978-0-374-52797-9");
        if(book797 != null) {
            basketProducts.add(book797);
        }

        return basketProducts;
    }
}
