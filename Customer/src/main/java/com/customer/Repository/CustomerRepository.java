package com.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
