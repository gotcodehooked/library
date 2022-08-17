package com.example.library.services;

import com.example.library.entities.Book;

import com.example.library.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    LibraryRepository libraryRepository;

    public BookService() {
    }

    public List<Book> getBooks() {
        return libraryRepository.findAll();
    }
}
