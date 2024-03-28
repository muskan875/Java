package com.jpa.test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	@Column(name="Id")
     private int id;
	
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Mobile No")
	private long mobno;
	
	@Column(name="Product")
	private String product;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="Price")
	private int price;
	
	@Column(name="Total Amount")
	private int total;
	
	@Column(name="Shipping")
	private int shipping;
	
	@Column(name="Packaging")
	private int packaging;
	
	@Column(name="Tax")
	private int tax;
	
	@Column(name="Tax_percentage")
	private int taxPercentage;
	
	@Column(name="After Tax")
	private int afterTax;

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

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(int taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public int getShipping() {
		return shipping;
	}

	public void setShipping(int shipping) {
		this.shipping = shipping;
	}

	public int getPackaging() {
		return packaging;
	}

	public void setPackaging(int packaging) {
		this.packaging = packaging;
	}

    public int getAfterTax() {
		return afterTax;
	}

	public void setAfterTax(int afterTax) {
		this.afterTax = afterTax;
	}

	public Invoice(int id, String name, long mobno, String product, int quantity, int price, int total,int shipping , int packaging, int tax, int afterTax,int taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
		this.shipping = shipping;
		this.packaging = packaging;
		this.tax = tax;
		this.afterTax = afterTax;
	    this.taxPercentage = taxPercentage;
		
	}

	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", name=" + name + ", mobno=" + mobno + ", product=" + product + ", quantity="
				+ quantity + ", price=" + price + ", total=" + total + ", shipping=" + shipping + ", packaging="
				+ packaging + ", tax=" + tax + ", taxPercentage=" + taxPercentage + ", afterTax=" + afterTax + "]";
	}

	public Invoice() {
		super();
		
	}
	
	

}
