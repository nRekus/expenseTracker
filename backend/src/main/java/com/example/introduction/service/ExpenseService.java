package com.example.introduction.service;

import java.util.List;

import com.example.introduction.model.Expense;

public interface ExpenseService {
    List<Expense> findAll();

    Expense findExpenseById(Long id);
}
