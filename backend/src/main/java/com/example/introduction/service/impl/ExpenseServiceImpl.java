package com.example.introduction.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.introduction.model.Expense;
import com.example.introduction.repository.ExpenseRepository;
import com.example.introduction.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    ExpenseRepository expenseRepository;

    ExpenseServiceImpl(ExpenseRepository repo){
        this.expenseRepository = repo;
    }

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense findExpenseById(Long id) {
        Optional<Expense> found = expenseRepository.findById(id);
        if (found.isPresent()){
            return found.get();
        }
        return new Expense();
    }
}
