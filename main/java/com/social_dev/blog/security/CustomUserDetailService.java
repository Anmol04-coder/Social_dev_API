package com.social_dev.blog.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.social_dev.blog.entities.User;
import com.social_dev.blog.exception.ResourceNotFoundException;
import com.social_dev.blog.repositories.UserRepo;

@Service 
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//loading user form database by username
		User orElseThrow = this.userRepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User", "email", username));
		return orElseThrow;
	}

}
