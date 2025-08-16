package com.FERNANDO.course.repositories;

import com.FERNANDO.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
