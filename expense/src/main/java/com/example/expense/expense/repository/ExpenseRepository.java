package com.example.expense.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
