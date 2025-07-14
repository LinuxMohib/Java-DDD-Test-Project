package com.testproject.hello.web;

import com.testproject.hello.application.BookService;
import com.testproject.hello.domain.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class BookPageController {

    private final BookService bookService;
    private static final Logger logger = LoggerFactory.getLogger(BookPageController.class);

    public BookPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/page")
    public String viewBooks(Model model) {
        List<Book> books = bookService.listBooks();
        logger.info("Fetched books: {}", books);
        model.addAttribute("books", books);
        model.addAttribute("content", "booksContent.jsp");        
        return "layout";
    }

    @GetMapping("/books/add")
    public String showForm(Model model) {
        model.addAttribute("content", "addBookContent.jsp");
        return "layout";
    }

    
    @PostMapping("/books/add")
    public String addBook(
                        @RequestParam String title,
                        @RequestParam String author,
                        Model model) {
        // Basic validation example:
        if (title == null || title.trim().isEmpty() ||
            author == null || author.trim().isEmpty()) {

            model.addAttribute("error", "All fields are required.");
            model.addAttribute("title", title);
            model.addAttribute("author", author);
            return "addBook"; // return to form with error message and previous inputs
        }

        bookService.addBook(title, author);
        return "redirect:/books/page";
    }
}