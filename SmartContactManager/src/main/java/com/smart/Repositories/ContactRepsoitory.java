package com.smart.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.Entities.Contact;

public interface ContactRepsoitory extends JpaRepository<Contact, Integer>{

}
