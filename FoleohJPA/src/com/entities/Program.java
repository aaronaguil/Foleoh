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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	
}
