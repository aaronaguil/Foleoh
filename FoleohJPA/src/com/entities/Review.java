package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {

	@Id
	int id;
	
	private String review;
	
	@Column(name="date_posted")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="School_id")
	private School school;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
	@OneToMany(mappedBy="review")
	private List<Comment> comments;
	
}
