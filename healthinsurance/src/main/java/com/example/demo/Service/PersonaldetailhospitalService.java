package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Personaldetailhospital;
import com.example.demo.Repository.PersonaldetailhospitalRepository;
@Validated
@Service
public class PersonaldetailhospitalService {

	@Autowired
	private PersonaldetailhospitalRepository personaldetailhospitalRepository;

	public List<Personaldetailhospital> getPersonaldetailhospitals() {
		return (List<Personaldetailhospital>) personaldetailhospitalRepository.findAll();
	}


	public String deletePersonaldetailhospital(String hospitalName) {
		
		personaldetailhospitalRepository.deleteById(hospitalName);
        return "Deleted!";
	}

	public Object findById(String hospitalName) {
		
		return personaldetailhospitalRepository.findById(hospitalName);
	}

	public Personaldetailhospital savePersonaldetailhospital(Personaldetailhospital personaldetailhospital) {
		 return personaldetailhospitalRepository.save(personaldetailhospital);

	}


	

}
