package com.testproject.hello.domain.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BookId implements Serializable {
    private String id;

    public BookId() {}

    public BookId(String id) {
        this.id = id;
    }

    public String getValue() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof BookId) && ((BookId) o).id.equals(this.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}