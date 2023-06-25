package com.example.demo.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.sql.DataSource;

import org.aspectj.weaver.ast.And;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.AuthorizeHttpRequestsDsl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.example.demo.filter.CsrfCookieFilter;
import com.example.demo.filter.JWTTokenValidatorFilter;
import com.example.demo.filter.JwtTokenGeneratorfilter;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class Config {
	 @Bean
	    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
	        CsrfTokenRequestAttributeHandler requestHandler = new CsrfTokenRequestAttributeHandler();
	        requestHandler.setCsrfRequestAttributeName("_csrf");
	        http.securityContext().requireExplicitSave(false)
	                .and().sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS))
	                .cors().configurationSource(new CorsConfigurationSource() {
	            @Override
	            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
	                CorsConfiguration config = new CorsConfiguration();
	                config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
	                config.setAllowedMethods(Collections.singletonList("*"));
	                config.setAllowCredentials(true);
	                config.setAllowedHeaders(Collections.singletonList("*"));
	                config.setMaxAge(3600L);
	                return config;
	            }
	        })
	               
	              .and().csrf((csrf) -> csrf.csrfTokenRequestHandler(requestHandler).ignoringRequestMatchers("/contact","/register")
	                 .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
	               .addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class)
	                .addFilterAfter(new JwtTokenGeneratorfilter(),BasicAuthenticationFilter.class)
	                .addFilterAfter(new JWTTokenValidatorFilter(),BasicAuthenticationFilter.class)
	                .authorizeHttpRequests()
	              
	            .requestMatchers("/Balancedetails","/Bankdetails","/Accountdetails","/Loandetails","/Carddetails").authenticated()
                .requestMatchers("/Noticedetails","/Contactdetails","/register").permitAll()
//                .requestMatchers("/Accountdetails").hasAuthority("VIEWACCOUNTDETAILS")
//                .requestMatchers("/Balancedetails").hasAnyAuthority("VIEWACCOUNTDETAILS","VIEWBALANCEDETAILS")
               .requestMatchers("/Loandetails").hasAnyAuthority("VIEWLOANDETAILS")
//                .requestMatchers("/Carddetails").hasAnyAuthority("VIEWCARDDETAIS")
        //.requestMatchers("/Bankdetails").hasRole("USER")
       // .requestMatchers("/Balancedetails").hasAnyRole("USER","ADMIN")
        .requestMatchers("/Loansdetails").hasRole("USER")
      //  .requestMatchers("/Cardsdetails").hasRole("USER")
        .requestMatchers("/user").authenticated()
                .requestMatchers("/Noticedetails","/Contactdetails").permitAll()
                     
	            .and().formLogin()
                
                .and().httpBasic();
              return http.build();
	  
	  }
	
	 
	       
//	      http.authorizeHttpRequests().anyRequest().denyAll()
//	                .and().formLogin()
//	                .and().httpBasic();
//	        return http.build();

//}


	        /**
	         *  Configuration to permit all the requests
	         */
//	        http.authorizeHttpRequests().anyRequest().permitAll()
//	                .and().formLogin()
//	                .and().httpBasic();
//	        return http.build();
//	  }
//}
//@Bean
//public InMemoryUserDetailsManager userDetailsService() {
//	UserDetails admin = User.withUsername("admin")
//            .password("12345")
//            .authorities("admin")
//            .build();
//    UserDetails user = User.withUsername("user")
//            .password("12345")
//            .authorities("read")
//            .build();
//    return new InMemoryUserDetailsManager(admin, user);
//}
 
////   UserDetails admin = User.withDefaultPasswordEncoder()
////            .username("admin")
////            .password("12345")
////            .authorities("admin")
////            .build();
////    UserDetails user = User.withDefaultPasswordEncoder()
////            .username("user")
////            .password("12345")
////            .authorities("read")
////            .build();
////    return new InMemoryUserDetailsManager(admin, user);
////
////}
       
			@Bean
			public UserDetailsService userDetailsService(DataSource dataSource) {
				return new JdbcUserDetailsManager(dataSource);
			}
 
			@Bean
			public PasswordEncoder passwordEncoder() {
				return NoOpPasswordEncoder.getInstance();
			}

			@Bean
			public PasswordEncoder passwordEncoder1() {
				return new BCryptPasswordEncoder();
			}

         }

	
	
	

