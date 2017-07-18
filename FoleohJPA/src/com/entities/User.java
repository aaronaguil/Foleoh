package com.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private List<Comment> comments;
	
	@OneToOne(mappedBy="user")
	private UserDetail userDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void addReview(Review review){
		if(reviews == null){
			reviews = new ArrayList<Review>();
			reviews.add(review);
		}
		else{
			reviews.add(review);
		}
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comment comment){
		if(comments == null){
			comments = new ArrayList<Comment>();
			comments.add(comment);
		}
		else{
			comments.add(comment);
		}
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	
	

}
