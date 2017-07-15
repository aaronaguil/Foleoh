package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="School_Detail")
public class SchoolDetail {

	@Id
	int id;
	
	@Column(name="year_founded")
	private String yearFounded;
	private String description;
	private String headline;
	
	@OneToOne
	@JoinColumn(name="School_id")
	private School school;
}
