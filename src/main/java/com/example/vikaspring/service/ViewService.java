package com.example.vikaspring.service;

import com.example.vikaspring.model.Product;
import com.example.vikaspring.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ViewService {
    private final ProductRepository productRepository;

    public List<Product> getAllMovies(){
        return productRepository.findAll();
    }
}
