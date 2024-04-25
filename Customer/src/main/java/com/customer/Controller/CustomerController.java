package com.customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Dto.CustomerDto;
import com.customer.Entity.Customer;
import com.customer.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody CustomerDto customerdto) {
		return customerService.dtoToCustomer(customerdto);
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomer(){
		return customerService.getAllCustomer();
	}
}
