package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Health;
import com.example.demo.Repository.CustomerRepository;
@Validated
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Health> getHealths() {
		return (List<Health>) customerRepository.findAll();
	}

	public Health saveHealth(Health health) {
		 return customerRepository.save(health);
	}

	public String deleteHealth(String Policyid) {
		
		customerRepository.deleteById(Policyid);
        return "Deleted!";
	}

	public Optional<Health> findById(String policyid) {
		
		return customerRepository.findById(policyid);
	}

	
	
}
