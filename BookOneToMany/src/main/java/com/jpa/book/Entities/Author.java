package com.jpa.book.Entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Author_Details")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="address")
    private String address;
    
    @Column(name="city")
    private String city;
    
    @Column(name="state")
    private String state;
    
    
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Book> books;
    
    public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public Author(int id, String name, String address, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
