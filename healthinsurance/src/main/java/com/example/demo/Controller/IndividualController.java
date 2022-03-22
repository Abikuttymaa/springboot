package com.example.demo.Controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Individual;
import com.example.demo.Service.IndividualService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;
@RestController
@RequestMapping("/api")
@Validated
@Transactional
public class IndividualController {

	@Autowired
	private IndividualService Service;
	
	 @GetMapping("/individual")
	    public ResponseEntity<Object> GetIndividuals(){
	            List<Individual> result = (List<Individual>) Service.getIndividuals();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	 
	 @PostMapping("/Individual/")
	    public ResponseEntity<Object> saveIndividual(@Valid @RequestBody Individual individual ){
		 
	        try{	           
	        	Individual result = Service.saveIndividual(individual);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }
	 
	

	@PutMapping("/individual/{policyid}")
   public ResponseEntity<Object> UpdateIndividual(@RequestBody Individual individual){
       try{
    	   Individual result = Service.saveIndividual(individual);
          if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
           }
           
           return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
       }catch (Exception e){
           return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
       }
   }
	 
	 
   @DeleteMapping("/individual/{policyid}")
   public ResponseEntity<Object> DeleteIndividual(@PathVariable String policyid){
       try{
           String result = Service.deleteIndividual(policyid);
           if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
          }
          return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
       }catch (Exception e){
           return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

       }
   }
}
