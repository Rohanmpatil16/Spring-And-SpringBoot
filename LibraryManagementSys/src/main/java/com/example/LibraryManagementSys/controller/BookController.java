package com.example.LibraryManagementSys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagementSys.entity.Book;
import com.example.LibraryManagementSys.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book)
	{
		return service.addBook(book);
	}
	
	@GetMapping
	public List<Book> getAllBooks()
	{
		return service.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book getBook(@PathVariable int id)
	{
		return service.getBook(id);
	}
	
	@PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        return service.deleteBook(id);
    }

    @GetMapping("/author/{author}")
    public List<Book> getByAuthor(@PathVariable String author) {
        return service.searchByAuthor(author);
    }

    @GetMapping("/category/{category}")
    public List<Book> getByCategory(@PathVariable String category) {
        return service.searchByCategory(category);
    }

    @GetMapping("/title/{title}")
    public List<Book> getByTitle(@PathVariable String title) {
        return service.searchByTitle(title);
    }
	
	
}
