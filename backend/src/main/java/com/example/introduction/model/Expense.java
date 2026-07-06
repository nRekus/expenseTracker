package com.example.introduction.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    @ManyToOne
    private Category expenseCategory;
    private String expenseName;
    private Date spendingDate;

    public Expense(){}

    public Expense(Long id, Double amount, Category expenseCategory, String expenseName, Date spendingDate) {
        this.id = id;
        this.amount = amount;
        this.expenseCategory = expenseCategory;
        this.expenseName = expenseName;
        this.spendingDate = spendingDate;
    }
    public Long getId(){
        return this.id;
    }

    public double getAmount() {
        return this.amount.doubleValue();
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Category getExpenseCategory() {
        return this.expenseCategory;
    }
    public void setExpenseCategory(Category expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
    public String getExpenseName() {
        return this.expenseName;
    }
    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
    public Date getSpendingDate(){
        return this.spendingDate;
    }
    public void setSpendingDate(Date spendingDate){
        this.spendingDate = spendingDate;
    }

}