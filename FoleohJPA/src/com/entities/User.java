package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	int id;
	
	private String username;
	private String password;
	
	@Column(name="date_registered")
	private Date dateRegistered;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@ManyToMany(mappedBy="users")
	private List<Program> programs;
	
	@OneToMany(mappedBy="user")
	private List<Review> reviews;
	
	@OneToMany(mappedBy="user")
	private List<Comment> comment;
	
	@OneToOne(mappedBy="user")
	private UserDetail userDetail;
	

}
