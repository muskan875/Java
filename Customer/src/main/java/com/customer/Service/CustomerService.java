package com.customer.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.Dto.CustomerDto;
import com.customer.Entity.Customer;
import com.customer.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public Customer dtoToCustomer(CustomerDto customerdto) {
		Customer customer = this.modelMapper.map(customerdto, Customer.class);
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomer(){
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}
}
