package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	int id;
	
	@Column(name="project_name")
	private String projectName;
	
	private String description;
	
	@Column(name="image_link")
	private String imageLink;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="project_link")
	private String projectLink;
	
	@ManyToOne
	@Column(name="User_Detail_id")
	private UserDetail userDetail;
	
	@ManyToMany
	@JoinTable(name = "Technology_Project", joinColumns = @JoinColumn(name = "Project_id"), inverseJoinColumns = @JoinColumn(name = "Technology_id"))
	private List<Technology> technologies;
}
