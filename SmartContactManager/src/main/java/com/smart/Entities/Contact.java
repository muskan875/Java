package com.smart.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Contact")
public class Contact {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="nikName")
	private String nikName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileNo")
	private long mobno;
	
	@Column(name="work")
	private String work;
	
	@Column(name="img_url")
	private String img;
	
	@Column(name="description", length=1000)
	private String description;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
