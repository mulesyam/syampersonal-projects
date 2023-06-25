package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BalanceController {
	
	@GetMapping("/Balancedetails")
	public String getbalancedetails(){
		return "Hello Girish get balance details";
		
		
	}
	@GetMapping("/girish")
	public String say() {
		return "Hello Girish";
	}
}
