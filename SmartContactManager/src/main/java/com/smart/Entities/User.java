package com.smart.Entities;

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
import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="email")
    private String email;
    
    @Column(name="about" , length=500)
    private String about;
    
    @Column(name="role")
    private String role;
    
    @Column(name="password")
    private String password;
    
    @Column(name="img_url")
    private String img;
    
    @Column(name="enabled")
    private boolean enabled;
    
    @JsonManagedReference
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL)
    List<Contact> contact;
   
}
