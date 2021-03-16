package com.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.model.CustomerUserDetails;
import com.jwt.model.User;
import com.jwt.repo.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
//		if(userName.equals("varsha")) {
//			return new User("varsha","varsha2000",new ArrayList<>());
//		}
//		else {
//			throw new UsernameNotFoundException("user not found");
//		}
		final User user=this.userRepository.findByusername(userName);
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found");
		}else {
			return new CustomerUserDetails(user);
		}
		
	}

}
