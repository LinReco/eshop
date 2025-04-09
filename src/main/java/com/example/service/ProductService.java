package com.example.service;


import java.util.List;

import com.example.pojo.entity.Product;

public interface ProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(int categoryId);
}