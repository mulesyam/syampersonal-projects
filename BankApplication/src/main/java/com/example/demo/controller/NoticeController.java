package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
	@GetMapping("/Noticedetails")
	public String getnoticedetails(){
		return "Hello Girish get notice details";
		
	}

}
