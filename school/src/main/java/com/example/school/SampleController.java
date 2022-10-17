package com.example.school;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class SampleController {
	@Autowired
	private SchoolRepo er;
	
	@GetMapping("/school") 
	public char getSample(){
		ArrayList<Character> list = new ArrayList<Character>();
		char first = 0;
		for(SchoolEntity emt:er.findAll()) {
			first = emt.getSchool_name().charAt(0);
			list.add(first);
		
		}
		return list.get(0);
		
}
}