package com.blautech.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blautech.crud.model.Products;
import com.blautech.crud.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Products> getProductById(String id) {
        return Optional.ofNullable(repository.findById(id).orElse(null));
    }

    public Products saveProduct(Products product) {
        return repository.save(product);
    }

    public boolean deleteProduct(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
