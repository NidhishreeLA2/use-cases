package com.example.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bikeid;
	private String bikename;
	private Integer nooftyres;
	public Integer getBikeid() {
		return bikeid;
	}
	public void setBikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public Integer getNooftyres() {
		return nooftyres;
	}
	public void setNooftyres(Integer nooftyres) {
		this.nooftyres = nooftyres;
	}
}
