package com.db.Database.dao;

import com.db.Database.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> findOne(String isbn);

    List<Book> find();

    void update(Book boook, String isbn);

    void delete(String id);
}
