package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contact_id;
	private String firstName;
	private String lastName;
	private String comment;
	public Contact(String firstName, String lastName, String comment) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.comment = comment;
	}
	public Contact() {
		
	}
	

}
