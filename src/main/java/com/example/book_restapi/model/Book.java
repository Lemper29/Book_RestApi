package com.example.book_restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String date;
}
