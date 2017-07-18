package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	private String technology;
	
	@ManyToMany(mappedBy="technologies")
	private List<Program> programs;
	
	@ManyToMany(mappedBy="technologies")
	private List<Project> projects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public void addProject(Project project){		
		if(projects == null){
			projects = new ArrayList<Project>();
			projects.add(project);
		}
		else{
			projects.add(project);
		}
	}
	
}
