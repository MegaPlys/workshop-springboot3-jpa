package com.mega.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mega.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
