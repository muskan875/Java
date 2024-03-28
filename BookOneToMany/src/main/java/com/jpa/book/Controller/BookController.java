package com.jpa.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.book.Entities.Book;
import com.jpa.book.Service.BookService;
import com.jpa.book.dto.BookDto;

@RestController
@RequestMapping("/api/books")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> getBooks() throws Exception {
		return this.bookService.getAllBooks();
	}
	
	@PostMapping
	public BookDto saveBook(@RequestBody BookDto bookdto) {
		return this.bookService.addBook(bookdto);
		
	}
}
