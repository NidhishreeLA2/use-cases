package com.example.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
@Autowired
	private CarRepo cr;
@Autowired
private TruckRepo tr;
@Autowired
private BikeRepo br;
@GetMapping("/car") 
public List<CarEntity> getSample(){
	return cr.findallsamenooftyres();
		}
@GetMapping("/truck")
public List<TruckEntity> getsampl(){
	return tr.findallsamenooftyres();
}
@GetMapping("/Bike")
public List<BikeEntity> getsamp2(){
	return br.findallsamenooftyres();
}

}
