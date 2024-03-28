package com.jpa.book.dto;

import java.util.List;

public class AuthorDto {
       private String name; 
       private String address;
       private String city;
       private String state;
       private List<BookDto> books;
      
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
	public List<BookDto> getBooks() {
		return books;
	}
	public void setBooks(List<BookDto> books) {
		this.books = books;
	}
	
	
}
