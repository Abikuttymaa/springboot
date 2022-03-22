package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Citybin;
import com.example.demo.Repository.CitybinRepository;
@Validated
@Service
public class CitybinService {
	@Autowired
	private CitybinRepository citybinRepository;
	
	public List<Citybin> getCitybins() {
		return (List<Citybin>) citybinRepository.findAll();
	}

public Optional<Citybin> getCitybinByid(int id) {
		
		return citybinRepository.findById(id);
	}

public Citybin saveCitybin(@Valid Citybin citybin) {
	return citybinRepository.save(citybin);	
	}

public String deleteCitybin(int id) {
	citybinRepository.deleteById(id);
    return "Deleted!";
}



}
