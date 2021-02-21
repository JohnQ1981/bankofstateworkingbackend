package com.bank.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.request.ContactRequest;
import com.bank.response.Response;

public class ContactController {
	
	@PostMapping(path="/register")
	public ResponseEntity<Response> getContact(@Valid @RequestBody ContactRequest request ) {
		
		Response response = new Response();
		response.setMessage("Thank you for contacting us\n, we will get back to you ASAP");
		response.setSuccess(true);
		
			return new ResponseEntity<>(response, HttpStatus.OK);
		
		
		
	}
	

}
