package com.example.introduction.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.introduction.model.Category;
import com.example.introduction.repository.CategoryRepository;
import com.example.introduction.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
    
    final CategoryRepository categoryRepo;
    
    public CategoryServiceImpl(CategoryRepository repo){
        this.categoryRepo = repo;
    }

    @Override
    public Category findCategoryByName(String categoryName) {
        return categoryRepo.findByCategoryName(categoryName);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
    
    @Override
    public Category findById(Long id){
        Optional<Category> result = categoryRepo.findById(id);
        return !result.isEmpty()? result.get(): new Category();
    }

    @Override
    public void delete(Long id){
        categoryRepo.deleteById(id);
    }

    @Override
    public void updateCategory(Category category){
        Category cat = findById(category.getId());
        if (cat != null){
            categoryRepo.save(catMapper(cat,category));
        }
    }

    private Category catMapper(Category oldCategory, Category newCategory) {
        oldCategory.setCategoryName(newCategory.getCategoryName());
        oldCategory.setColor(newCategory.getColor());
        return oldCategory;       
    }

    @Override
    public void saveNewCategory(Category category){
        if (findCategoryByName(category.getCategoryName()) == null){
            categoryRepo.save(category);
        }
    }
    
    // @Override
    // public void updateCategoryColor(Category category, String categoryColor) {
    //     Optional<Category> oldCategory = categoryRepo.findById(category.getId());   
    //     if (!oldCategory.isEmpty()){
    //         Category tmp = oldCategory.get();
    //         tmp.setColor(categoryColor);
    //         categoryRepo.save(tmp);
    //     }
    // }

}
