package br.com.udemy.curso4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.udemy.curso4.entities.Category;
import br.com.udemy.curso4.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;
	
	public	List<Category> findAll() {
		return repository.findAll();
	}
	public	Category findById (Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
