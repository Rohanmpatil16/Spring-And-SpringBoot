package com.example.LibraryManagementSys;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.LibraryManagementSys.entity.Book;
import com.example.LibraryManagementSys.service.BookService;

@SpringBootTest
class LibraryManagementSysApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	void testAddBook() {
		Book book = new Book();
		book.setTitle("Java");
		book.setAuthor("James Gosling");
		book.setCategory("Programming");
		book.setPrice(599);
		book.setQuantity(10);
		bookService.addBook(book);
	}

}
