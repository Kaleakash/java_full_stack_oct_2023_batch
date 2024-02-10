package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	public String createAccount(Gpay gpay) {
		Optional<Gpay> op  = gpayRepository.findById(gpay.getGpayid());
		if(op.isPresent()) {
			return "Gpay account already exists";
		}else {
			gpayRepository.save(gpay);
			return "Account created successfully";
		}
	}
	
	public List<Gpay> findAllGpay() {
		return gpayRepository.findAll();
	}
}
