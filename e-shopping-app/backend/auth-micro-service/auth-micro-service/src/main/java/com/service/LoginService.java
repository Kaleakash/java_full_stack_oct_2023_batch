package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		
		if(op.isPresent()) {
				Login l = op.get();
				
				if(l.getPassword().equals(login.getPassword())) {
						if(l.getTypeofuser().equals("admin")) {
							return "Admin login successfully";
						}else {
							return "Customer login successfully";
						}
				}else {
					return "Password is wrong";
				}
		}else {
			return "EmailId is wrong";
		}
	}
	
	public String signUp(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		
		if(op.isPresent()) {
			return "Account already exists";
		}else {
			if(login.getTypeofuser().equals("admin")) {
				return "You can't create admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}	
		}
	}
}
