package com.bank.repository;

import org.springframework.data.repository.CrudRepository;

import com.bank.model.Contact;

public interface ContactRepo extends CrudRepository<Contact, Integer> {

}
