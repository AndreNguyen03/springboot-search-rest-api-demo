package net.javaguides.springboot.service.Impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import net.javaguides.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


}
