package com.jpa.book.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.ToString;


@Entity
@Table(name="Book_Details")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


	@Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="author_id")
    @JsonBackReference
    private Author author;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

	public Book() {
		super();
		
	}
	
	


   }
