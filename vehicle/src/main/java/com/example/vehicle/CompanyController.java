package com.example.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	private EmployeeRepo e;
	@Autowired
	private ManagerRepo m;
	@GetMapping("/employee")
	public List<EmployeeEntity> getsample(){
		return e.findlocation();
		
	}
	@GetMapping("/manager")
	public List<ManagerEntity> getsample2(){
		return m.findlocation();
	}

}
