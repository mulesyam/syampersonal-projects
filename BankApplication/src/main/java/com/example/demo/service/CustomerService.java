package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerDao;
import com.example.demo.repositry.CustomerRepositry;

import ch.qos.logback.core.joran.conditional.IfAction;

   @Service
           public class CustomerService {
     @Autowired 
   CustomerRepositry customerRepositry;
     public  UserDetails loadUserByUserDetails(String username)throws UsernameNotFoundException {
		
	
     String userName,password=null;
     List<GrantedAuthority>authorities=null;
     
     List<CustomerDao>customer=customerRepositry.findByEmail(username);
     if(customer.size()==0) {
    	 throw new UsernameNotFoundException("User details Not found for the user:"+username);
     }
     else {
    	 userName=customer.get(0).getEmail();
    	 password=customer.get(0).getPwd();
    	authorities=new ArrayList<>() ;
    	authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
    	}
     return new User(userName, password, authorities);
     }
   }
  
     

