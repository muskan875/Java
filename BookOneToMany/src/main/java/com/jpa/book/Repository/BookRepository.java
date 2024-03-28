package com.jpa.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.book.Entities.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

	

}

