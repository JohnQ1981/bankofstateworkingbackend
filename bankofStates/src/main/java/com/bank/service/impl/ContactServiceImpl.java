package com.bank.service.impl;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.model.Account;
import com.bank.model.Contact;
import com.bank.repository.ContactRepo;
import com.bank.service.ContactService;

public class ContactServiceImpl implements ContactService {

	
	@Autowired
	ContactRepo contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}
	
	//@Override
//	public Contact createContact() {
//		Contact contact  = new Contact();
//		contact.setContact_id(contact.setContact_id(getcontact_id());
//		contact.save(contact);
//		return contact.getContact_id();
//	}
	
	
	private Integer getcontact_id() {
		int smallest = 10;
		int biggest = 9999;
		int random = ThreadLocalRandom.current().nextInt(smallest, biggest);
		return random;
	}

}
