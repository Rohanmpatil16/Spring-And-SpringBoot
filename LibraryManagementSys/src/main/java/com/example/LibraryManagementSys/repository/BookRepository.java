package com.example.LibraryManagementSys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSys.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByCategory(String category);

    List<Book> findByAuthor(String author);

    List<Book> findByTitleContaining(String title);

}