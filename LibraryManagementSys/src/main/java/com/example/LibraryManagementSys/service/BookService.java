package com.example.LibraryManagementSys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagementSys.entity.Book;
import com.example.LibraryManagementSys.repoitory.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repo;
	
	public Book addBook(Book book) {
		return repo.save(book);
		
	}
	
	public List<Book> getAllBooks()
	{
		return repo.findAll();
	}
	
	public Book getBook(int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public Book updateBook(Book book)
	{
		return repo.save(book);
	}
	
	public String deleteBook(int id)
	{
		repo.deleteById(id);
		return "Book Deleted Successfully";
	}
	
	public List<Book> searchByAuthor(String author) {
        return repo.findbyAuthor(author);
    }

    public List<Book> searchByCategory(String category) {
        return repo.findbyCategory(category);
    }

    public List<Book> searchByTitle(String title) {
        return repo.findByTitleContaining(title);
    }
}
