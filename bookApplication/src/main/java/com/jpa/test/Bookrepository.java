package com.jpa.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.Book;
@Repository
public interface Bookrepository extends CrudRepository<Book, Integer>{

	

}
