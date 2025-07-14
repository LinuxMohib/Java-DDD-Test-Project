package com.testproject.hello.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testproject.hello.user.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username); // <- Make sure return type is User, not Object
}
