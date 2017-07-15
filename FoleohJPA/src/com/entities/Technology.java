package com.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int id;
	
	private String technology;
	
	@ManyToMany(mappedBy="technologies")
	private List<Program> programs;
	
	@ManyToMany(mappedBy="technologies")
	private List<Project> projects;
}
