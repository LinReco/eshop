package com.example.dao;


import java.util.List;

import com.example.pojo.entity.Product;

public interface ProductDAO {
    Product findById(int id);
    List<Product> findAll();
    List<Product> findByCategory(int categoryId);
    void save(Product product);
    void update(Product product);
    void delete(int id);
}