package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	int id;
	
	private String comment;
	
	@Column(name="date_posted")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="Review_id")
	private Review review;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
}
