package com.blautech.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.blautech.crud.model.Products;


public interface ProductRepository extends MongoRepository<Products, String> {
}
