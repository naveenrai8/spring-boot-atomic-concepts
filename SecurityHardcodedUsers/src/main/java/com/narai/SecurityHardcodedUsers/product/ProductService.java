package com.narai.SecurityHardcodedUsers.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return this.productRepository.getAllProducts();
    }

    public Product getProductById(int id) throws ProductNotFoundException {
        Optional<Product> product  = this.productRepository.getProductById(id);
        return product.orElseThrow(ProductNotFoundException::new);
    }
}
