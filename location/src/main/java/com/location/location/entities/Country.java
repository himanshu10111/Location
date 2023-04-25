package com.location.location.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Country {
	
	private String name;
	private String continent;
	@Id
	private Long ID;
	
	
	//Constructor using fields.
	public Country(String name, String continent, long i) {
		super();
		this.name = name;
		this.continent = continent;
		ID = i;
	}
	
	//  default Constructor 
	public Country() {
		super();
		
	}

	// toSting method
	@Override
	public String toString() {
		return "Country [name=" + name + ", continent=" + continent + ", ID=" + ID + "]";
	}
	
	// getter setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	

}
