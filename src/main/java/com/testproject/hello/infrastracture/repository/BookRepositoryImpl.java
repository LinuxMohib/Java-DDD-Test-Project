package com.testproject.hello.infrastracture.repository;

import com.testproject.hello.domain.model.Book;
import com.testproject.hello.domain.model.BookId;
import com.testproject.hello.domain.model.repository.BookRepository;
import com.testproject.hello.infrastracture.entity.BookEntity;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private final JpaBookRepository jpaRepo;

    public BookRepositoryImpl(JpaBookRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public Optional<Book> findById(BookId id) {
        return jpaRepo.findById(id.getValue())
                      .map(this::toDomain);
    }

    @Override
    public List<Book> findAll() {
        return jpaRepo.findAll().stream()
                      .map(this::toDomain)
                      .collect(Collectors.toList());
    }

    @Override
    public void save(Book book) {
        BookEntity entity = new BookEntity(
            book.getId().getValue(),
            book.getTitle(),
            book.getAuthor()
        );
        jpaRepo.save(entity);
    }

    private Book toDomain(BookEntity entity) {
        return new Book(
            new BookId(entity.getId()),
            entity.getTitle(),
            entity.getAuthor()
        );
    }
}