package com.springboot.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.registration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
