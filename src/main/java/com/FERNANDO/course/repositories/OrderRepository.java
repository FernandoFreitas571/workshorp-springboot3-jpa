package com.FERNANDO.course.repositories;

import com.FERNANDO.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
