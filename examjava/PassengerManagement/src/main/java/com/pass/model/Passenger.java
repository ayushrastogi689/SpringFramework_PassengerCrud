package com.pass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private String country;
	private String aboutyou;
	private String mailinglist;
	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Passenger(int id, String name, String gender, String country, String aboutyou, String mailinglist) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.aboutyou = aboutyou;
		this.mailinglist = mailinglist;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAboutyou() {
		return aboutyou;
	}
	
	
	
	public void setAboutyou(String aboutyou) {
		this.aboutyou = aboutyou;
	}
	public String getMailinglist() {
		return mailinglist;
	}
	public void setMailinglist(String mailinglist) {
		this.mailinglist = mailinglist;
	}
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + ", aboutyou="
				+ aboutyou + ", mailinglist=" + mailinglist + "]";
	}
	
	
	
	

}
