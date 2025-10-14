package com.mega.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mega.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
