package br.com.udemy.curso4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso4.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
	

}
