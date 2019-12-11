package br.com.udemy.curso4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso4.entities.Category;

	public interface CategoryRepository extends JpaRepository<Category, Long> {
		

	}

