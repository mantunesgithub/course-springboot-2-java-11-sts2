package br.com.udemy.curso4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso4.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
	

}
