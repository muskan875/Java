package com.jpa.shop.Entity;

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
@Table(name="Item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="total")
	private float total;
	
	@ManyToOne
	@JoinColumn(name="shop_id")
	@JsonBackReference
	private Shop shop;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	@JsonBackReference
	private Brand brand;
	
}
