package com.jpa.employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="Company_name")
	private String company;
	
	@Column(name="joinning_date")
	private String joinning_date;
	
	@Column(name="post")
	private String post;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileNo")
	private long mobno;
}
