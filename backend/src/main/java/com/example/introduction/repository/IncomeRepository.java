package com.example.introduction.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.introduction.model.Income;

@Repository
public interface IncomeRepository extends ListCrudRepository<Income, Long>{}
