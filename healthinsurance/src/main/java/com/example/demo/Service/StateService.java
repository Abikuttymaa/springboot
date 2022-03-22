package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.State;
import com.example.demo.Repository.StateRepository;
@Validated
@Service
public class StateService {
    @Autowired
	private StateRepository stateRepository;

	public List<State> getStates() {
        return  (List<State>) stateRepository.findAll();
	}

	public Optional<State> getStateByid(int id) {
		
		return stateRepository.findById(id);
	}


	public String deleteState(int id) {
		stateRepository.deleteById(id);
        return "Deleted!";	
        }

	public State saveState(@Valid State state) {
		 return stateRepository.save(state);	
		 }
	
	

}
