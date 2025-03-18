package com.example.book_restapi.controller;

import com.example.book_restapi.model.Book;
import com.example.book_restapi.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/book")
public class BookContoller {
    private final BookService service;

    @GetMapping("all_student")
    public List<Book> findAllBook() {
        return service.findAllBook();
    }

    @DeleteMapping("delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }

    @PutMapping("update_Book")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @GetMapping("{id}")
    public Book findByBook(@PathVariable Long id) {
        return service.findByBook(id);
    }

    @PostMapping("save_book")
    public Book saveBook(@RequestBody Book book) {
        return service.saveBook(book);
    }
}
