package com.example.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Autowired
	private ClientdetailsRepo cd;
	
	@GetMapping("/details/c1")
	public List<ClientdetailsEntity> getdetails(){
		return cd.findalldetails();
		
	}
	@GetMapping("/details/c2")
	public List<ClientdetailsEntity> getdetails2(){
		return cd.findalldetails2();
		
	}
	@GetMapping("/details/c3")
	public Optional<ClientdetailsEntity> getdetails3(){
		return cd.findById(3);
		
	}
	
	@GetMapping("/details/c4")
	public Optional<ClientdetailsEntity> getdetails4(){
		return cd.findById(4);
		
	}
	
	@GetMapping("/details/c5")
	public Optional<ClientdetailsEntity> getdetails5(){
		return cd.findById(5);
		
	}

}
