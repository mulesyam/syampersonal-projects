package com.example.demo.controller;

import java.util.List;

import org.hibernate.metamodel.mapping.internal.InFlightEntityMappingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarddetialsDao;
import com.example.demo.repositry.CardRepositry;
@RestController
public class CardController {
	
	@Autowired
	private CardRepositry cardrepo;
	@GetMapping("/Carddetails")
	public String getcarddetails(){
		return "Hello Girish get card details";
		
	}
	
}
