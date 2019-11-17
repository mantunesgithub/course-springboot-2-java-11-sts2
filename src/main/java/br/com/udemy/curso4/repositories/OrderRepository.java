package br.com.udemy.curso4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso4.entities.Order;
import br.com.udemy.curso4.entities.User;

public interface OrderRepository extends JpaRepository <Order, Long> {
	

}
