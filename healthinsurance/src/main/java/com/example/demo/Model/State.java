package com.example.demo.Model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
@Data

@Entity
@Table(name="sta")
public class State {
	
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="state_name")
	private String Statename;
	
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "city_id")
	   private List<City> items = new ArrayList<>();
	
	 public void addCity(City city){
	        items.add(city);
	    }

	    public void removeCity(City city){
	        items.remove(city);
	    }
	
	    public static State from(StateDto stateDto){
	        State state = new State();
	        state.setName(stateDto.getStateName());
	        return state;
	    }

		private void setName(Object stateName) {
			
		}

			
		}
    
	
		
