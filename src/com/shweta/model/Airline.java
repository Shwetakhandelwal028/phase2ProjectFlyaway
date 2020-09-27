package com.shweta.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="airline")
public class Airline {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="airline_id")
	private int id;
	
	@Column(name="airline_code")
	private String code;
	
	@Column(name="airline_name")
	private String name;
	
	@OneToMany(mappedBy="airline")
	private Set<Flight>  flights;
	
	public Airline() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}

    public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}


	public Airline( String code, String name, Set<Flight> flights) {
		
		this.code = code;
		this.name = name;
		this.flights = flights;
	}



	
	
	
	
}
