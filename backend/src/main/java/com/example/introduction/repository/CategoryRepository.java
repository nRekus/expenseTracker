package com.example.introduction.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.introduction.model.Category;


@Repository
public interface CategoryRepository extends ListCrudRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
}
