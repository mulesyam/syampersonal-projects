package com.example.demo.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.crypto.SecretKey;

import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokenGeneratorfilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		         if (null != authentication) {
	            SecretKey key = Keys.hmacShaKeyFor(SecurityConstants.JWT_KEY.getBytes(StandardCharsets.UTF_8));
	            String jwt = Jwts.builder().setIssuer("BankApplication").setSubject("JWT Token")
	                    .claim("username", authentication.getName())
	                    .claim("authorities", populateAuthorities(authentication.getAuthorities()))
	                    .setIssuedAt(new Date())// jwt token issue date
	                    .setExpiration(new Date((new Date()).getTime() + 3000000))// expired time
	                    .signWith(key).compact();
	            response.setHeader(SecurityConstraint.ROLE_ALL_ROLES, jwt);
	        }

	        filterChain.doFilter(request, response);
	}
	@Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        return !request.getServletPath().equals("/user");
    }

    private String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
        Set<String> authoritiesSet = new HashSet<>();
        for (GrantedAuthority authority : collection) {
            authoritiesSet.add(authority.getAuthority());
        }
        return String.join(",", authoritiesSet);
    }
	
}
