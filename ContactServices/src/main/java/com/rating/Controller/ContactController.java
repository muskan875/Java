package com.rating.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.Dto.ContactDto;
import com.rating.Entity.Contact;
import com.rating.Services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public Contact addContact(@RequestBody ContactDto contactdto) {
		return contactService.saveContact(contactdto);
	}
	
	@GetMapping("/user")
	public List<Contact> getAllContact(){
		return contactService.getContact();
	}

}
