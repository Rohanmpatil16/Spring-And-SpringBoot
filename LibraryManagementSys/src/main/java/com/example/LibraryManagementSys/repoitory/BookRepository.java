package com.example.LibraryManagementSys.repoitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSys.entity.Book;


public interface BookRepository extends JpaRepository<Book,Integer> {
	
	List<Book> findbyCategory(String category);
	
	List<Book> findbyAuthor(String author);
	
	List<Book> findbyTitle(String Title);
	

	
}
