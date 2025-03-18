package com.example.book_restapi.service.Impl;

import com.example.book_restapi.model.Book;
import com.example.book_restapi.repository.BookRepository;
import com.example.book_restapi.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    @Override
    public List<Book> findAllBook() {
        return repository.findAll();
    }

    @Override
    public Book updateBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Book findByBook(Long id) {
        return repository.findBookById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }
}
