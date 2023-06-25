package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class BankController {
	
	@GetMapping("/Accountdetails")
	public String getaccountdetails(){
		return "Hello Girish get account details";
		
	}

 	 
	  
}
