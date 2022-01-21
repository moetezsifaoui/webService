package com.webService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fisrtname;
	
	private String lastname;
	
	private String email;
	
	private String adresse;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFisrtname() {
		return fisrtname;
	}

	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Customer(int id, String fisrtname, String lastname, String email, String adresse) {
		super();
		this.id = id;
		this.fisrtname = fisrtname;
		this.lastname = lastname;
		this.email = email;
		this.adresse = adresse;
	}

	public Customer(String fisrtname, String lastname, String email, String adresse) {
		super();
		this.fisrtname = fisrtname;
		this.lastname = lastname;
		this.email = email;
		this.adresse = adresse;
	}

	public Customer() {
		super();
	}
	
	
}
