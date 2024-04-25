package com.rating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
