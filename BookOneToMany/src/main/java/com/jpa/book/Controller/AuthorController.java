package com.jpa.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.book.Entities.Author;
import com.jpa.book.Service.AuthorService;
import com.jpa.book.dto.AuthorDto;

@RestController
@RequestMapping("/api")
public class AuthorController {
  
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping
	public List<Author> getAuthors() throws Exception {
		return this.authorService.getAllAuthors();
	}
	
	@PostMapping("/authors")
	public Author saveAuthor(@RequestBody AuthorDto author) {
		return this.authorService.addAuthor(author);
		
	}
}
