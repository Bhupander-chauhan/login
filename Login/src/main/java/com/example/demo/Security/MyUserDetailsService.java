package com.example.demo.Security;

import org.apache.tomcat.jni.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService{
	
	@Override 
	public UserDetails loadUserByUsername(String userName)throws UsernameNotFoundException{
		return new User("foo","foo", new)
	}

}
