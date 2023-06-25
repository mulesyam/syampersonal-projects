package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.entity.AuthorityDao;
import com.example.demo.entity.CustomerDao;
import com.example.demo.repositry.CustomerRepositry;



@Component
       public class PwdAuthenticationprovider implements AuthenticationProvider {
    	  @Autowired
    	    private CustomerRepositry customerRepository;

    	    @Autowired
    	    private PasswordEncoder passwordEncoder;

    	    @Override
    	    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    	        String username = authentication.getName();
    	        String pwd = authentication.getCredentials().toString();
    	        List<CustomerDao> customer = customerRepository.findByEmail(username);
    	        if (customer.size() > 0)
    	        {
    	            if (passwordEncoder.matches(pwd, customer.get(0).getPwd())) {
    	              List<GrantedAuthority> authorities = new ArrayList<>();
    	            authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
    	                return new UsernamePasswordAuthenticationToken(username, pwd,authorities);
    	            }
    	            else 
    	            {
    	                throw new BadCredentialsException("Invalid password!");
    	            }
    	        }
    	        
    	        else 
    	        {
    	            throw new BadCredentialsException("No user registered with this details!");
    	        }
    	        }

    	    private List<GrantedAuthority> getGrantedAuthorities(Set<AuthorityDao> authorities) {
    	        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
    	        for (AuthorityDao authority : authorities) {
    	            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
    	        }
    	        return grantedAuthorities;
    	    }


		
		
			@Override
			public boolean supports(Class<?> authentication) {

				return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
			}
			
			

}
