package com.example.demo.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Individual;
import com.example.demo.Repository.IndividualRepository;
@Service
public class IndividualService {
	@Autowired
	private IndividualRepository individualRepository;

	

	public Individual saveIndividual(Individual individual) {
		 return individualRepository.save(individual);
	}

	

	public Optional<Individual> findById(String policyid) {
		
		return individualRepository.findById(policyid);
	}

	public List<Individual> getIndividuals() {
		return (List<Individual>) individualRepository.findAll();
	}

	public String deleteIndividual(String policyid) {
		individualRepository.deleteById(policyid);
        return "Deleted!";
	}



}
