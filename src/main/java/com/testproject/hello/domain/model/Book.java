package com.testproject.hello.domain.model;

public class Book {
    private BookId id;
    private String title;
    private String author;

    public Book(BookId id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public BookId getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id.getValue() +   // ✅ This line
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}