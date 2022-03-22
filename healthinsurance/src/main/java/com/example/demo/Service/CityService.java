package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.City;
import com.example.demo.Repository.CityRepository;
@Validated
@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getCitys() {
        return  (List<City>) cityRepository.findAll();
	}

	public Optional<City> getCityByid(int id) {
		
		return cityRepository.findById(id);
	}

	public City saveCity(@Valid City city) {
		return cityRepository.save(city);	
		}

	public String deleteCity(int id) {
		cityRepository.deleteById(id);
        return "Deleted!";
	}

	
	
	

}
