package com.shweta.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="age")
	private int age;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name="username")
	private String username;

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="flight_id")
	private Flight flight;
	
	public User() {}

	
	public User(int age, long mobileNumber, String username) {
		super();
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.username = username;
	}
	
	


	public User( int age, long mobileNumber, String username, Flight flight) {
		
		
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.flight = flight;
	}


	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
	
	

	
	
}
