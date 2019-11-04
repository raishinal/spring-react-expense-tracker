package com.example.expense.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String name);
	
}
