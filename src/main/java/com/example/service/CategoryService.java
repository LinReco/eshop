package com.example.service;


import java.util.List;

import com.example.pojo.entity.Category;

public interface CategoryService {
    Category getCategoryById(int id);
    List<Category> getAllCategories();
}