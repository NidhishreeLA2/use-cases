package com.example.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/details/{id}")
	public Optional<ClientdetailsEntity> getdetails3(@PathVariable(value = "id") int id){
		return cd.findById(id);
		
	}
	
	@GetMapping("/details/c4")
	public Optional<ClientdetailsEntity> getdetails4(){
		return cd.findById(4);
		
	}
	
	@GetMapping("/details/c5")
	public Optional<ClientdetailsEntity> getdetails5(){
		return cd.findById(5);
		
	}
	@GetMapping("/equalto5")
	public List<ClientdetailsEntity> equalto(){
		return cd.findallequalto5();
		
	}
	@GetMapping("/lessthan5")
	public List<ClientdetailsEntity> lessthan(){
		return cd.findalllessthan5();
		
	}
	@GetMapping("/greaterthan5")
	public List<ClientdetailsEntity> greaterthan(){
		return cd.findallgreaterthan5();
		
	}
	
	@GetMapping("/{term}/{amount}")
	public double premium(@PathVariable String term,@PathVariable int amount) {
		
		if (term.equals("equaltofive")) {
			return (amount - (0.1*(amount)));
		}
		
		if (term.equals("lessthanfive")) {
			return amount;
			}
		
		return (amount - (0.12*(amount)));
		
		}
	
	
	
	
	

}
