package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Program {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public void addUser(User user){
		if(users == null){
			users = new ArrayList<User>();
			users.add(user);
		}
		else{
			users.add(user);
		}
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}
	
	public void addTechnology(Technology technology){
		if(technologies == null){
			technologies = new ArrayList<Technology>();
			technologies.add(technology);
		}
		else{
			technologies.add(technology);
		}
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	public void addLocation(Location location){
		if(locations == null){
			locations = new ArrayList<Location>();
			locations.add(location);
		}
		else{
			locations.add(location);
		}
	}
	
	
}
