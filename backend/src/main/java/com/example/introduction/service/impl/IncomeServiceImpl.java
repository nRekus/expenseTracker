package com.example.introduction.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.introduction.model.Income;

import com.example.introduction.repository.IncomeRepository;
import com.example.introduction.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService{
    
    @Autowired
    IncomeRepository incomeRepo;

    @Override
    public List<Income> findAll() {
        return incomeRepo.findAll();
    }

    @Override
    public Income findById(Long id){
        Optional<Income> searchedIncome = incomeRepo.findById(id);
        if (searchedIncome.isPresent()){
            return searchedIncome.get();
        }
        return new Income();
    }

    @Override
    public void save(Income income){
        incomeRepo.save(income);
    }

    @Override
    public void deleteById(Long id) {
        incomeRepo.deleteById(id);
    }

    @Override
    public void updateIncomeById(Income inc) {
        Optional<Income> oldIncome = incomeRepo.findById(inc.getId());
        oldIncome.ifPresent(x -> updateIncome(x,inc));
        incomeRepo.save(oldIncome.get());
        
    }

    private void updateIncome(Income o,Income n){
        o.setAmount(n.getAmount());
        o.setName(n.getName());
        o.setIncomeCategory(n.getIncomeCategory());
        o.setIncomeDate(n.getIncomeDate());
    }

    
}