package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.City;
import com.example.demo.Service.CityService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;

@RestController
@RequestMapping("/api")
@Transactional
public class CityController {
	@Autowired
	private CityService Service;
	
	@GetMapping("/city")
    public ResponseEntity<Object> GetCitys(){
            List<City> result = (List<City>) Service.getCitys();
        try {
            if(result==null){
           throw new ResourceNotFoundException("Record_Not_Found");
            }
         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
       }catch(Exception e){

            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
        }

    }
	@GetMapping("/city/{id}")
    public ResponseEntity<Object> GetCity(@PathVariable int id) {
	 
    	try{
    		Optional<City> result =  this.Service.getCityByid(id);
    		
    		if(result==null){
    			throw new ResourceNotFoundException("Record_Not_Found");
    		}
    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
    	
    	}catch(Exception e){
    		
    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
    	}
 }
	

	 @PostMapping("/city/")
	    public ResponseEntity<Object> saveCity(@Valid @RequestBody City city ){
		 
	        try{	           
	        	City result = Service.saveCity(city);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
       }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }

	 
	@PutMapping("/city/{id}")
public ResponseEntity<Object> UpdateCity(@RequestBody City city){
   try{
	   City result = Service.saveCity(city);
      if(result==null){
           throw new ResourceNotFoundException("Record_Not_Found");
       }
       
       return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
   }catch (Exception e){
       return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
   }
}
	 
	 
@DeleteMapping("/city/{id}")
public ResponseEntity<Object> DeleteCity(@PathVariable int id){
   try{
       String result = Service.deleteCity(id);
       if(result==null){
           throw new ResourceNotFoundException("Record_Not_Found");
      }
      return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
   }catch (Exception e){
       return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

   }
}	

}
