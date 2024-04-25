package com.rating.MicroServices;

import org.springframework.cloud.openfeign.FeignClient;

import com.rating.Entities.Contact;

@FeignClient(name="CONTACT_SERVICE")
public interface ContactService {

	Contact addContact();
	
	
}
