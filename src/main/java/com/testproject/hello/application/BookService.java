package com.testproject.hello.application;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.testproject.hello.domain.model.Book;
import com.testproject.hello.domain.model.BookId;
import com.testproject.hello.domain.model.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public List<Book> listBooks() {
        return repository.findAll();
    }

    public void addBook(String title, String author){
        Book book = new Book(new BookId(UUID.randomUUID().toString()), title, author);
        repository.save(book);
    }
}
