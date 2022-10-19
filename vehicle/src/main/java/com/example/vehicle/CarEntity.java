package com.example.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car1")

public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carid;
	private String carname;
	
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public Integer getNooftyres() {
		return nooftyres;
	}
	public void setNooftyres(Integer nooftyres) {
		this.nooftyres = nooftyres;
	}
	private Integer nooftyres;

}
