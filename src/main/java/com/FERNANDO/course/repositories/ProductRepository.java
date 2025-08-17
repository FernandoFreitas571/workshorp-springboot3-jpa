package com.FERNANDO.course.repositories;

import com.FERNANDO.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
