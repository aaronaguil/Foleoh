package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Program {

	@Id
	int id;
	
	@Column(name="program_name")
	private String programName;
	
	private String description;
	
	@ManyToMany
	@JoinTable(name = "User_Program", joinColumns = @JoinColumn(name = "Program_id"), inverseJoinColumns = @JoinColumn(name = "User_id"))
	private List<User> users;
	
	@ManyToMany
	@JoinTable(name = "Technology_Program", joinColumns = @JoinColumn(name = "Program_id"), inverseJoinColumns = @JoinColumn(name = "Technology_id"))
	private List<Technology> technologies;
	
	@ManyToMany
	@JoinTable(name = "Program_Location", joinColumns = @JoinColumn(name = "Program_id"), inverseJoinColumns = @JoinColumn(name = "Location_id"))
	private List<Location> locations;
	
	
}
