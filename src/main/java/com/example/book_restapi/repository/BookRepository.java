package com.example.book_restapi.repository;

import com.example.book_restapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    void deleteById(Long id);
    Book findBookById(Long id);
}
