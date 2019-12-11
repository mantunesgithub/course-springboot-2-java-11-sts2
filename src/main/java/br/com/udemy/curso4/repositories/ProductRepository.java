package br.com.udemy.curso4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso4.entities.Category;
import br.com.udemy.curso4.entities.Product;

	public interface ProductRepository extends JpaRepository<Product, Long> {
		

	}

