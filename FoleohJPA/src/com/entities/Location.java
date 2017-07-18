package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	private String street;
	private String suite;
	private String city;
	private String state;
	private int zipcode;
	private int headquarters;	

	@ManyToOne
	@JoinColumn(name="School_id")
	private School school;
	
	@ManyToMany(mappedBy="locations")
	private List<Program> programs;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(int headquarters) {
		this.headquarters = headquarters;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public List<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}
	
	public void addProgram(Program program){
		if(programs == null){
			programs = new ArrayList<Program>();
			programs.add(program);
		}
		else{
			programs.add(program);
		}
	}

}
