package com.example.demo2;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DepartmentController {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/department") 
	public List<String> getSample(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		String name;
    		name = emt.getDepartment();
    		transformedvalues.add(name);
    	}
    	return transformedvalues;
	}

}
