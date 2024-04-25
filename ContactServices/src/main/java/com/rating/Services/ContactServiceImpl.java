package com.rating.Services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.Dto.ContactDto;
import com.rating.Entity.Contact;
import com.rating.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Contact saveContact(ContactDto contactdto) {
		Contact contact = modelMapper.map(contactdto, Contact.class);
		return contactRepository.save(contact);
	}

	@Override
	public List<Contact> getContact() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}

}
