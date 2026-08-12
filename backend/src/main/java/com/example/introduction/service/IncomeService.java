package com.example.introduction.service;

import java.util.List;

import com.example.introduction.model.Income;

public interface IncomeService {
    List<Income> findAll();
    void save(Income income);
    Income findById(Long id);
    void deleteById(Long id);
    void updateIncome(Income inc);
    void updateIncomeById(Income inc);
}
