package com.FERNANDO.course.repositories;

import com.FERNANDO.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
