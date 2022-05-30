package com.lab2ecommerce.product.repository;

import com.lab2ecommerce.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
