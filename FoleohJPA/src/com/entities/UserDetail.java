package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Detail")
public class UserDetail {
	
	@Id
	int id;

	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String description;
	
	@Column(name="profile_pic")
	private String profilePic;
	
	@Column(name="current_city")
	private String currentCity;
	
	@Column(name="current_state")
	private String currentState;
	
	@OneToOne
	@Column(name="User_id")
	private User user;
	
	@OneToMany(mappedBy="userDetail")
	private List<Project> projects;
	
	@OneToMany(mappedBy="userDetail")
	private List<Job> jobs;
}
