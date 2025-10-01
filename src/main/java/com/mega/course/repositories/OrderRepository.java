package com.mega.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mega.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
