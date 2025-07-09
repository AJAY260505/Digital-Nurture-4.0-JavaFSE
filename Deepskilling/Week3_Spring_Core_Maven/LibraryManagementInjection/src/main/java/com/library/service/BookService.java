package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String bookName;

    // Constructor injection
    public BookService(String bookName) {
        this.bookName = bookName;
        System.out.println("📘 Constructor injected with book: " + bookName);
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void processBook() {
        System.out.println("📘 BookService: Processing -> " + bookName);
        bookRepository.save(bookName);
    }
}
