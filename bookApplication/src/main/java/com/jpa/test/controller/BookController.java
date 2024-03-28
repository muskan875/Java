package com.jpa.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.Book;
import com.jpa.test.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bookServices;
	

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		return this.bookServices.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Optional<Book>> getBook(@PathVariable int id) {
		 return bookServices.getBookById(id);
		 }
	

 
	@PostMapping("/books")
	public ResponseEntity<Book>addBook(@RequestBody Book book) {
		return this.bookServices.addBook(book);
	}

	 
	 @PutMapping("/books/{id}")
	    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable int id) {
	        return bookServices.updateBook(id, book);
	    }
	 
	  
	 @DeleteMapping("/books/{id}")
	 public ResponseEntity<Integer> deleteBook(@PathVariable int id) {
		 return bookServices.deleteById(id);
		 }
	
	  
}
