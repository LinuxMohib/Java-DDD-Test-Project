package com.testproject.hello.infrastracture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name = "book_entity")
public class BookEntity {

    @Id
    private String id; // Should be UUID (String) and not auto-increment if you're generating manually

    private String title;
    private String author;

    // Default constructor for JPA
    public BookEntity() {}

    public BookEntity(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}