package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Location {

	@Id
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
}
