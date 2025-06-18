package edu.mimo.books;

import java.util.List;

import edu.mimo.books.model.Displayable;
import edu.mimo.books.repository.ProductRepository;
import edu.mimo.books.repository.ProductRepositoryImpl;

public class App {

    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepositoryImpl();

        List<Displayable> products = productRepository.allProductsForDisplay();
        
        for (Displayable product : products) {
            System.out.println(product.display());
        }





    }


}
