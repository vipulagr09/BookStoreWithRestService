package com.vipul.test.bookstore.service.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.vipul.test.bookstore.service.UserAccountService;
import com.vipul.test.bookstore.service.model.UserAccount;

@Configuration
public class BookStoreAuthorization {

	
	@Autowired
	private UserAccountService userAccountService;
	
	public void init(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService());
	}
	
	@Bean
	UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
			Optional<UserAccount> dbUser = 	userAccountService.findByUsername(username);
			if(dbUser.isPresent()) {
				
			}
				userAccountService.validateUser(username);
				return null;
			}
	};
	}
}
