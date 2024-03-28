package com.jpa.book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.book.Entities.Author;
import com.jpa.book.Entities.Book;
import com.jpa.book.Repository.AuthorRepository;
import com.jpa.book.Repository.BookRepository;
import com.jpa.book.dto.AuthorDto;
import com.jpa.book.dto.BookDto;


@Service
public class AuthorService {
	
	@Autowired
	private  AuthorRepository authorRepository;
	
	
	public Author addAuthor(AuthorDto authordto) {
		Author author = new Author();
		
		author.setName(authordto.getName());
		author.setAddress(authordto.getAddress());
		author.setCity(authordto.getCity());
		author.setState(authordto.getState());
		
		
		List<Book> bookList = new ArrayList<Book>();
		for(BookDto bk: authordto.getBooks()) {
			Book book = new Book();
			
			book.setTitle(bk.getTitle());
			book.setAuthor(author);
			bookList.add(book);
		}
		
		author.setBooks(bookList);
		authorRepository.save(author);
	
		return author;
    }

	 
	 
	 public List<Author> getAllAuthors() throws Exception {
	        List<Author> list = (List<Author>) authorRepository.findAll();
	        if (list.isEmpty()) {
	           
	            throw new Exception("No authors found");
	        }
	        return list;
	    }
}
