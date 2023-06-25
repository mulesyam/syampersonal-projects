package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/Contactdetails")
	public String getcontactdetails(){
		return "Hello Girish get contact details";
		
	}

}
