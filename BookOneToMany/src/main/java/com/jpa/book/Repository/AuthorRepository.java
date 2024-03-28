package com.jpa.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jpa.book.Entities.Author;


@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>{

	

}
