package com.testproject.hello.web;

import com.testproject.hello.application.BookService;
import com.testproject.hello.domain.model.Book;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/books")

public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

   
    @PostMapping
    public void addBook(@RequestBody Map<String, String> request) {
        service.addBook(request.get("title"), request.get("author"));
    }

    @GetMapping
    public List<Book> listBooks() {
        return service.listBooks();
    }

}
