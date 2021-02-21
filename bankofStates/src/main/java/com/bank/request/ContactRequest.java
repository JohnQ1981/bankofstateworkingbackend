package com.bank.request;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactRequest {
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String comment;


}
