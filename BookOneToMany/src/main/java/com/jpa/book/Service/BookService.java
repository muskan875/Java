package com.jpa.book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jpa.book.Entities.Book;
import com.jpa.book.Repository.BookRepository;
import com.jpa.book.dto.BookDto;

@Service
public class BookService {
	
  @Autowired
  private BookRepository bookRepository;
  

  public BookDto addBook(BookDto bookdto) {
	  
	  return bookdto;
	  
  }

	  
  public List<Book> getAllBooks() throws Exception {
      List<Book> list = (List<Book>) bookRepository.findAll();
      if (list.isEmpty()) {
         
          throw new Exception("No books found");
      }
      return list;
  } }







