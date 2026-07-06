package com.example.introduction.service;

import java.util.List;

import com.example.introduction.model.Category;

public interface CategoryService {
    Category findCategoryByName(String categoryName);
    List<Category> findAll();
    Category findById(Long id);
    void delete(Long id);
    void updateCategory(Category category);
    void saveNewCategory(Category category);
}
