package com.example.dao;


import java.util.List;

import com.example.pojo.entity.Category;

public interface CategoryDAO {
    Category findById(int id);
    List<Category> findAll();
}