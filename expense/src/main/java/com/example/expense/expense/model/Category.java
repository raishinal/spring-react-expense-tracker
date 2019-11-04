package com.example.expense.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name="category")
public class Category {

	@Id
	private Long id;
	
	@NotNull
	private String name;

		
}
