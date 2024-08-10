package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
