package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School {

	@Id
	int id;
	
	@Column(name="school_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
	@OneToMany(mappedBy="school")
	private List<Location> locations;
	
	@OneToMany(mappedBy="school")
	private List<Review> reviews;
	
	@OneToOne(mappedBy="school")
	private SchoolDetail schoolDetail;
	
}
