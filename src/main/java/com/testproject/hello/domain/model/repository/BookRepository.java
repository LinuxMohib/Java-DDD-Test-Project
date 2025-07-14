package com.testproject.hello.domain.model.repository;

import com.testproject.hello.domain.model.Book;
import com.testproject.hello.domain.model.BookId;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    void save(Book book);
    List<Book> findAll();

    Optional<Book> findById(BookId id);
}
