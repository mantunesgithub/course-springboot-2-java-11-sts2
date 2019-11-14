package br.com.udemy.curso4.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.udemy.curso4.entities.User;

@RestController
@RequestMapping (value="/users")
public class UserResource {
	
	@GetMapping
	public	ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "Marcia@gmail.com", "99899877", "12345");
		return	ResponseEntity.ok().body(u);
	}

}
