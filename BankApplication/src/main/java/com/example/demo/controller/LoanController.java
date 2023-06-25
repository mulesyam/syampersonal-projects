package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@GetMapping("/Loandetails")
	public String getloandetails(){
		return "Hello Girish get loan details";
		
	}

}
