package com.example.introduction.controller;


import com.example.introduction.model.Income;
import com.example.introduction.service.IncomeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/api")
public class IncomeController {
    
    @Autowired
    private IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // @GetMapping("/")
    // public String index(){
    //     return "Hello World, from Spring Boot !";
    // }

    @GetMapping("/income")
    public ResponseEntity<List<Income>> getAllIncomes(){
        return new ResponseEntity<>(incomeService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/income/{id}")
    public ResponseEntity<Income> getIncomeById(@PathVariable Long id){
        return new ResponseEntity<>(incomeService.findById(id),HttpStatus.OK);        
    }

    @PutMapping("/income/{id}")
    public ResponseEntity<Income> updateIncomeById(@RequestBody Income inc){
        incomeService.updateIncomeById(inc);
        return new ResponseEntity<Income>(HttpStatus.OK);
    }

    @DeleteMapping("/income/{id}")
    public ResponseEntity<Boolean> deleteIncomeById(@PathVariable Long id){
        incomeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/income")
    public ResponseEntity<Income> addIncome(@RequestBody Income newIncome){
        incomeService.save(newIncome);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/total_income")
    public ResponseEntity<Double> getTotalIncome(){
        double sum = incomeService.findAll()
                    .stream()
                    .map(x -> x.getAmount())
                    .mapToDouble(Double::doubleValue)
                    .sum();
        return new ResponseEntity<Double>(Double.valueOf(sum),HttpStatus.OK);
    }
}