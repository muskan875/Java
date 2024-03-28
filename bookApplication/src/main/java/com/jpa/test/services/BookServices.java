package com.jpa.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.jpa.test.Bookrepository;
import com.jpa.test.entities.Book;

@Service
public class BookServices {
	
	@Autowired
	Bookrepository bookrepository;
	
 
	 public ResponseEntity<List<Book>> getAllBooks() {
		     List<Book> list = (List<Book>) bookrepository.findAll();
		    
		    if (list.size() <= 0) {
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		    }

		    return ResponseEntity.ok(list);
		}


	    public ResponseEntity<Optional<Book>> getBookById(int id) {
	    	
			Optional<Book> book = bookrepository.findById(id);
	    	if(book==null) {
	    	 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    	}
			return ResponseEntity.ok(book);
	    	
	    }

   
	    public ResponseEntity<Book> addBook(Book add) {
	    	
			
			if ( add.getTitle().isEmpty() ||  isNumeric(add.getTitle()) ||
	            add.getAuthor().isEmpty() || isNumeric(add.getAuthor())) {
	            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
	        }

	        Book savedBook = bookrepository.save(add);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
	    }

   


	    private boolean isNumeric(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }


public ResponseEntity<Book> updateBook(int id, Book bookDetails) {
       Book updateBook = bookrepository.findById(id).orElse(null);
       
       if (updateBook == null) {
           return ResponseEntity.notFound().build();
       }
       updateBook.setId(bookDetails.getId());
       updateBook.setTitle(bookDetails.getTitle());
       updateBook.setAuthor(bookDetails.getAuthor());
       
       bookrepository.save(updateBook);
       
       return ResponseEntity.ok(updateBook);
   }
   
   

   public ResponseEntity<Integer> deleteById( int id) {
	    Optional<Book> optionalBook = bookrepository.findById(id);
	    if (optionalBook.isEmpty()) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
	    bookrepository.deleteById(id);
	    return ResponseEntity.status(HttpStatus.OK).build();
	}

}
