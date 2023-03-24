package com.example.demo.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Entity.Filefound;
import com.example.demo.Entity.SendDao;

import com.example.demo.repositry.SendmailRepositry;
import com.fasterxml.jackson.annotation.JsonCreator;

import jakarta.annotation.Resource;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
		@Autowired
		private JavaMailSender javaMailSender;
		 
	    @Value("${spring.mail.username}") 
	    private String sender;
	 
	    public String sendSimpleMail(SendDao details)
	    {
	 
	        try {
	
	            SimpleMailMessage mailMessage  = new SimpleMailMessage();
	           
	            mailMessage.setFrom(sender);
	            mailMessage.setTo(details.getRecipient());
	            mailMessage.setText(details.getMsgBody());
	            mailMessage.setSubject(details.getSubject());
	 
	            javaMailSender.send(mailMessage);
	            return "Mail Sent Successfully...";
	        }
	 
	        
	        catch (Exception e) {
	            return "Error while Sending Mail";
	        }
	    
	}
	    public String sendMailWithAttachment(SendDao details)
	    {
	        // Creating a mime message
	        MimeMessage mimeMessage   = javaMailSender.createMimeMessage();
	        MimeMessageHelper mimeMessageHelper;
	 
	        try {
	 
	            
	            mimeMessageHelper    = new MimeMessageHelper(mimeMessage, true);
	            mimeMessageHelper.setFrom(sender);
	            mimeMessageHelper.setTo(details.getRecipient());
	            mimeMessageHelper.setText(details.getMsgBody());
	            mimeMessageHelper.setSubject(
	                details.getSubject());
	 
	            // Adding the attachment
	            FileSystemResource file
	                = new FileSystemResource(
	                    new File(details.getAttachment()));
	 
	            mimeMessageHelper.addAttachment(
	                file.getFilename(), file);
	 
	           
	            javaMailSender.send(mimeMessage);
	            return "Mail sent Successfully";
	        }
	 
	        
	        catch (MessagingException e) {
	 
	            // Display message when exception occurred
	            return "Error while sending mail!!!";
	        }
	    }
	    
	    
	      public String findString(Filefound file) throws IOException {
	    	  file.getFilename();
	    	 File f = new File("C:\\Users\\prasanna_mule\\Desktop\\New folder\\"+ file.getFilename());
	    	 if (f.exists()) {
	             System.out.println("Exists");
	    	    BufferedWriter writer = new BufferedWriter( new FileWriter(f,true));  
	    	    writer.write("Task file sucussfully");  
	    	    writer.close();  
	    	    System.out.println("Sucuss");
	    	 }
	    	    else
	    	    {
	    	 	 
	    	    	SimpleMailMessage mailMessage  = new SimpleMailMessage();
	 	           
		            mailMessage.setFrom(sender);
		            mailMessage.setTo("vtu14705@veltech.edu.in");
		            mailMessage.setSubject("Daily Task Updates");
		            mailMessage.setText("Good morning123 ");
		            javaMailSender.send(mailMessage);
	    	    	System.out.println("message sent successfully....");  
	    	    	  
	    	    }
			return sender;
	    	 
	    	    	
	    	    }
	      
	      
	      
			
				public String createfile(Filefound filefound) throws IOException {
					filefound.getOrderdata();
					filefound .getStatus();
					filefound.getFilename();
					filefound.getVinno();
					File f = new File("C:\\Users\\prasanna_mule\\Desktop\\files\\" + filefound.getFilename());
					if (f.exists()) {
						System.out.println("Exists");
					}
					else {
						f.createNewFile();
				        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\prasanna_mule\\Desktop\\files\\"+filefound.getVinno()));
				        bufferedReader.close();
				        
				        String str=filefound.getOrderdata();
					    BufferedWriter writer = new BufferedWriter( new FileWriter(f,true)); 
					    String str1=bufferedReader+str;
					    System.out.println(bufferedReader);
					    
					    writer.write(str1);  
			    	    writer.close(); 
					}
						
					    
					return sender;

				}
			
				}



    
	   
	      
	   

 

	