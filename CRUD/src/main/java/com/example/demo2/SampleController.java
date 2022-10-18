package com.example.demo2;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/employeename") 
	public List<String> getSample(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		String name;
    		name = emt.getEmployee_name();
    		transformedvalues.add(name);
    	}
    	return transformedvalues;
	}
	
	@GetMapping("/id") 
	public List<Integer> getSample2(){
		ArrayList<Integer> transformedvalues=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {
    		int id;
    		id = emt.getId();
    		transformedvalues.add(id);
    	}
    	return transformedvalues;
	}
	
	@GetMapping("/A") 
	public List<String> getSample3(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
		
    	for(EmployeeEntity emt:er.findAll()) {
    		
    		if(emt.getEmployee_name().startsWith("a")) {
    			String name2;
    			name2 = emt.getEmployee_name();
    			transformedvalues.add(name2);
    		}
    	}
    	return transformedvalues;
	}
	
	
    		
    		
    	
	}
    	
	
	


