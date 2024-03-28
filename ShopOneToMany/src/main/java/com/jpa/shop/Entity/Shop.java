package com.jpa.shop.Entity;

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
@Table(name="Shop_Details")
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	 private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="Mobile_No")
	private long mobno;
	
	@OneToMany(mappedBy="shop", cascade = CascadeType.ALL)
	@JsonManagedReference
	List<Brand> brands;
	
//    @OneToMany(mappedBy="shop", cascade = CascadeType.ALL)
//    @JsonManagedReference
//	List<Item> items;
//	

}
