//package com.example.demo.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.example.demo.entity.CustomerDao;
//import com.example.demo.repositry.CustomerRepositry;
//
//public class Userdetails implements UserDetailsService {
//	@Autowired
//	CustomerRepositry customerRepositry;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		String userName = null,
//				password=null;
//		List<GrantedAuthority> authorities=null;
//		List<CustomerDao>customer =customerRepositry.findByEmail(userName);
//	
//		if(customer.size()==0) {
//			throw new UsernameNotFoundException("User details not fount for the user:"+userName);
//		}
//		else {
//			userName=customer.get(0).getEmail();
//			password=customer.get(0).getPwd();
//			authorities=new ArrayList<>();
//			
//			authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
//			
//		}
//		return new User(userName, password, authorities);
//	}
//
//}
