package com.testproject.hello.infrastracture.repository;

import com.testproject.hello.infrastracture.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookRepository extends JpaRepository<BookEntity, String> {
}