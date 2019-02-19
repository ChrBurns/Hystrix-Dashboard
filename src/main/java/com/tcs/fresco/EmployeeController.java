package com.tcs.fresco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class EmployeeController {

	    @RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
	    public Employee getEmpDetails(@PathVariable("id") int id){
	    	
	    }
	

}
