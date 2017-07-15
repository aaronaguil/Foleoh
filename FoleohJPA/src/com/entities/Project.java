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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getProjectLink() {
		return projectLink;
	}

	public void setProjectLink(String projectLink) {
		this.projectLink = projectLink;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}
	
	
	
}
