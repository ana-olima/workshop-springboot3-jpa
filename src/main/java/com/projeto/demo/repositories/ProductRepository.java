package com.projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.demo.entities.Product;
import com.projeto.demo.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
