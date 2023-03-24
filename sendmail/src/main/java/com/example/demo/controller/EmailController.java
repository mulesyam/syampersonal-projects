package com.example.demo.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.Filefound;
import com.example.demo.Entity.SendDao;
import com.example.demo.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody SendDao details) {
		String status = emailService.sendSimpleMail(details);

		return status;
	}

	// Sending email with attachment
	@PostMapping("/sendfile")
	public String sendMailWithAttachment(@RequestBody SendDao details) {
		String status = emailService.sendMailWithAttachment(details);

		return status;

	}

	@GetMapping("/foundfile")
	public String getString (@RequestBody Filefound file) throws IOException {
		return emailService.findString(file);
	}

	

	@GetMapping("/searchfile")
	public String file ( @RequestBody Filefound file1) throws IOException {
		return emailService.createfile(file1);
	}
}
