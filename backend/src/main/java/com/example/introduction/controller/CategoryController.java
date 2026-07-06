package com.example.introduction.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.introduction.model.Category;
import com.example.introduction.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

    CategoryService categoryService;
    CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategories(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    
    @PostMapping("/category")
    public ResponseEntity<Object> addCategory(@RequestBody Category category){
        categoryService.saveNewCategory(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
        
    }
    
    @GetMapping("/category/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){
        Category cat = categoryService.findById(id);
        return cat.equals(new Category())?new ResponseEntity<>(HttpStatus.NOT_FOUND): new ResponseEntity<>(cat,HttpStatus.FOUND);
         
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<Object> deleteCategory(@PathVariable Long id){
        categoryService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/category/{id}")
    public ResponseEntity<Object> updateCategory(@PathVariable Long id){
        categoryService.updateCategory(categoryService.findById(id));
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
