package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Personaldetailhospital;
import com.example.demo.Service.PersonaldetailhospitalService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;

@RestController
@RequestMapping("/api")
@Validated
@Transactional
public class PersonaldetailhospitalController {
	
	@Autowired
	private PersonaldetailhospitalService Service;
	
	 @GetMapping("/hospital")
	    public ResponseEntity<Object> GetPersonaldetailhospitals(){
	            List<Personaldetailhospital> result = (List<Personaldetailhospital>) Service.getPersonaldetailhospitals();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	 
	 @PostMapping("/hospital/")
	    public ResponseEntity<Object> savePersonaldetailhospital(@Valid @RequestBody Personaldetailhospital personaldetailhospital ){
		 
	        try{	           
	        	Personaldetailhospital result = Service.savePersonaldetailhospital(personaldetailhospital);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }
	 
	

	@PutMapping("/hospital/{HospitalName}")
   public ResponseEntity<Object> UpdatePersonaldetailhospital(@RequestBody Personaldetailhospital personaldetailhospital){
       try{
    	   Personaldetailhospital result = Service.savePersonaldetailhospital(personaldetailhospital);
          if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
           }
           
           return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
       }catch (Exception e){
           return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
       }
   }
	 
	 
   @DeleteMapping("/personal/{HospitalName}")
   public ResponseEntity<Object> DeletePersonaldetailhospital(@PathVariable String hospitalName){
       try{
           String result = Service.deletePersonaldetailhospital(hospitalName);
           if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
          }
          return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
       }catch (Exception e){
           return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

       }
   }
	

}
