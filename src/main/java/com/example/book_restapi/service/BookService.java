package com.example.book_restapi.service;

import com.example.book_restapi.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBook();

    Book updateBook(Book book);
    void deleteBook(Long id);
    Book findByBook(Long id);
    Book saveBook(Book book);
}
