package com.natwest.holidaylocations.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String continent;
	private int noOfVisitors;
	private boolean hasBeach;
	
	
	public Cities () {
		
	}
	
	public Cities(String name, String continent, int noOfVisitors, boolean hasBeach) {
		this.name = name;
		this.continent = continent;
		this.noOfVisitors = noOfVisitors;
		this.hasBeach = hasBeach;
		
	}
	
	
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
	public int getNoOfVisitors() {
		return noOfVisitors;
	}
	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}
	public boolean isHasBeach() {
		return hasBeach;
	}
	public void setHasBeach(boolean hasBeach) {
		this.hasBeach = hasBeach;
	}
	
	
	

}
