package com.example.introduction.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "income")
public class Income{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String name;
    @ManyToOne
    private Category incomeCategory;
    private Date incomeDate;

    public Income(){}

    public Income(Long id, Double amount, String name, Category incomeCategory, Date incomeDate) {
        super();
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.incomeCategory = incomeCategory;
        this.incomeDate = incomeDate;
    }

    public Long getId(){
        return this.id;
    }

    public Double getAmount() {
        return this.amount;
    }
    public void setAmount(Double amount) {
       this.amount = amount;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((incomeCategory == null) ? 0 : incomeCategory.hashCode());
        result = prime * result + ((incomeDate == null) ? 0 : incomeDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Income other = (Income) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (incomeCategory == null) {
            if (other.incomeCategory != null)
                return false;
        } else if (!incomeCategory.equals(other.incomeCategory))
            return false;
        if (incomeDate == null) {
            if (other.incomeDate != null)
                return false;
        } else if (!incomeDate.equals(other.incomeDate))
            return false;
        return true;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Category getIncomeCategory() {
        return this.incomeCategory;
    }
    public void setIncomeCategory(Category incomeCategory) {
        this.incomeCategory = incomeCategory;
    }
    public Date getIncomeDate(){
        return this.incomeDate;
    }
    public void setIncomeDate(Date incomeDate){
        this.incomeDate = incomeDate;
    }
    
}