package com.jpa.test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="Id")
     private int id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Author")
     private String author;
     
     public Book(int id, String title, String author) {
 		super();
 		this.id = id;
 		this.title = title;
 		this.author = author;
 	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

	public Book() {
		
	}
     
     
}
