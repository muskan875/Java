package com.rating.Services;

import java.util.List;

import com.rating.Dto.ContactDto;
import com.rating.Entity.Contact;

public interface ContactService {
	
	public Contact saveContact(ContactDto contactdto);
	
	 List<Contact> getContact();

}
