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

import com.example.introduction.model.Expense;
import com.example.introduction.service.ExpenseService;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> getAllExpenses(){
        List<Expense> expenses = expenseService.findAll();
        if (expenses.isEmpty()){
            return new ResponseEntity<>(expenses,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(expenses,HttpStatus.OK);
    }

    @GetMapping("/expense/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id){
        Expense expense = expenseService.findExpenseById(id);
        if(expense.equals(new Expense())){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(expense,HttpStatus.FOUND);
    }

    @PostMapping("/expense")
    public ResponseEntity<Void> addExpense(@RequestBody Expense expense){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/expense/{id}")
    public ResponseEntity<Void> updateExpense(@RequestBody Expense exp, @PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.FOUND);
    }

    @DeleteMapping("/expense/{id}")
    public ResponseEntity<Boolean> deleteExpense(@PathVariable Long id){
        return new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT);
    }

}
