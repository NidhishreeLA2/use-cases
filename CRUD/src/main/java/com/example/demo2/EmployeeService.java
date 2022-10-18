package com.example.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepojpa er;
	
	@GetMapping("/sample2")
	public List<EmployeeEntity> getSample(){
		return er.findAll();
	
	}
}
