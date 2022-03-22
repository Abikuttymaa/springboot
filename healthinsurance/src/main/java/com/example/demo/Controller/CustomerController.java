
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

import com.example.demo.Model.Health;
import com.example.demo.Service.CustomerService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;


@RestController
@RequestMapping("/api")
@Validated
@Transactional
public class CustomerController {
	
	@Autowired
	private CustomerService Service;
	
	 @GetMapping("/personal")
	    public ResponseEntity<Object> GetHealths(){
	            List<Health> result = (List<Health>) Service.getHealths();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	 
	 @PostMapping("/personal/")
	    public ResponseEntity<Object> saveHealth(@Valid @RequestBody Health health ){
		 
	        try{	           
	        	Health result = Service.saveHealth(health);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }

	@PutMapping("/personal/{Policyid}")
   public ResponseEntity<Object> UpdateHealth(@RequestBody Health health){
       try{
           Health result = Service.saveHealth(health);
          if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
           }
           
           return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
       }catch (Exception e){
           return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
       }
   }
	 
	 
   @DeleteMapping("/personal/{Policyid}")
   public ResponseEntity<Object> DeleteHealth(@PathVariable String Policyid){
       try{
           String result = Service.deleteHealth(Policyid);
           if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
          }
          return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
       }catch (Exception e){
           return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

       }
   }
}
