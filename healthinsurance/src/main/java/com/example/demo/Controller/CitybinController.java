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

import com.example.demo.Model.Citybin;
import com.example.demo.Service.CitybinService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;

@RestController
@RequestMapping("/api")
@Transactional
public class CitybinController {
	@Autowired
	private CitybinService Service;
	
	@GetMapping("/citybin")
    public ResponseEntity<Object> GetCitybin(){
            List<Citybin> result = (List<Citybin>) Service.getCitybins();
        try {
            if(result==null){
           throw new ResourceNotFoundException("Record_Not_Found");
            }
         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
       }catch(Exception e){

            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
        }

    }
	@GetMapping("/citybin/{id}")
    public ResponseEntity<Object> GetCitybin(@PathVariable int id) {
	 
    	try{
    		Optional<Citybin> result =  this.Service.getCitybinByid(id);
    		
    		if(result==null){
    			throw new ResourceNotFoundException("Record_Not_Found");
    		}
    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
    	
    	}catch(Exception e){
    		
    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
    	}
 }
	 @PostMapping("/citybin/")
	    public ResponseEntity<Object> saveCitybin(@Valid @RequestBody Citybin citybin ){
		 
	        try{	           
	        	Citybin result = Service.saveCitybin(citybin);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
    }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }

	 
	@PutMapping("/citybin/{id}")
public ResponseEntity<Object> UpdateCitybin(@RequestBody Citybin citybin){
try{
	   Citybin result = Service.saveCitybin(citybin);
   if(result==null){
        throw new ResourceNotFoundException("Record_Not_Found");
    }
    
    return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
}catch (Exception e){
    return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
}
}
	 
	 
@DeleteMapping("/citybin/{id}")
public ResponseEntity<Object> DeleteCitybin(@PathVariable int id){
try{
    String result = Service.deleteCitybin(id);
    if(result==null){
        throw new ResourceNotFoundException("Record_Not_Found");
   }
   return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
}catch (Exception e){
    return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

}
}	

	

}
