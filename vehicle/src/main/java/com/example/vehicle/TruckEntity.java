package com.example.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer truckid;
	private String truckname;
	private Integer nooftyres;
	public Integer getTruckid() {
		return truckid;
	}
	public void setTruckid(Integer truckid) {
		this.truckid = truckid;
	}
	public String getTruckname() {
		return truckname;
	}
	public void setTruckname(String truckname) {
		this.truckname = truckname;
	}
	public Integer getNooftyres() {
		return nooftyres;
	}
	public void setNooftyres(Integer nooftyres) {
		this.nooftyres = nooftyres;
	}

}
