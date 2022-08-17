package com.example.library.controllers;

import com.example.library.entities.Book;
import com.example.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }


    @GetMapping("getbooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("sayhello")
    public String sayHello() {
        return "hello";
    }
}
