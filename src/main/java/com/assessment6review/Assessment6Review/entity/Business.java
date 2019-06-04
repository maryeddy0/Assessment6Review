package com.assessment6review.Assessment6Review.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Business {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String location;
	
	
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Business(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public Business(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
