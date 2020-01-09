package br.com.udemy.curso4.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.udemy.curso4.entities.User;
import br.com.udemy.curso4.repositories.UserRepository;
import br.com.udemy.curso4.services.exceptions.DataBaseException;
import br.com.udemy.curso4.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public	List<User> findAll() {
		return repository.findAll();
	}
	public	User findById (Long id) {
		Optional<User> 	 obj = repository.findById(id);
		return			 obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	public	User insert (User obj) {
		return	repository.save(obj);
	}
	public	void	delete(long id) {
		try {
			repository.deleteById(id);
			
//		} catch (RuntimeException e) {              Executa primeiro com Runtimeexception para captar excecao e saber qual excecao tratar 
//			e.printStackTrace();					no caso DataIntegrityViolationException
		} catch (DataIntegrityViolationException e) {
			throw	new DataBaseException(e.getMessage()) ;
		}
	}	
	public	User update (Long id, User obj) {
		try {
			User entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
			
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}	
	private void updateData(User entity, User obj) {
		entity.setName (obj.getName());
		entity.setEmail (obj.getEmail());
		entity.setPhone (obj.getPhone());
	}
}
