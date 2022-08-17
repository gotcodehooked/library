package com.example.library.repositories;

import com.example.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LibraryRepository extends JpaRepository<Book,Long> {
}