package com.narai.SecurityHardcodedUsers.product;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class ProductRepository {
    private final Random random = new Random();
    private final List<Product> products = IntStream
            .rangeClosed(1, 100)
            .mapToObj(
                    itr ->Product.builder()
                            .id(itr)
                            .name("name-"+itr)
                            .quantity(itr * random.nextInt(100))
                            .build()
            )
            .toList();

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(int id) {
        return products
                .stream()
                .filter( x -> x.getId() == id)
                .findFirst();
    }
}
