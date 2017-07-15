package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Job {

	@Id
	int id;
	
	@Column(name="company_name")
	private String companyName;
	
	private String title;
	
	private String description;
	
	@Column(name="year_started")
	private int yearStarted;
	
	@Column(name="year_ended")
	private int yearEnded;
	
	private String city;
	
	private String state;
	
	@ManyToOne
	@JoinColumn(name="User_Detail_id")
	private UserDetail userDetail;
	
}
