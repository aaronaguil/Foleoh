package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	public void addLocation(Location location){
		if(locations == null){
			locations = new ArrayList<Location>();
			locations.add(location);
		}
		else{
			locations.add(location);
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

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}
	
	
	
}
