package com.example.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class ClientdetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String plan_name;
	private Integer term;
	private Integer payable_premium;
	private Integer total_amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public Integer getTerm() {
		return term;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Integer getPayable_premium() {
		return payable_premium;
	}
	public void setPayable_premium(Integer payable_premium) {
		this.payable_premium = payable_premium;
	}
	public Integer getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

}
