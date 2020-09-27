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
@Table(name="place")
public class Place {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="place_id")
	private int id;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@OneToMany(mappedBy="place")
	private Set<Flight> flights;
	
	public Place() {}

	public Place(int id, String source, String destination, Set<Flight> flights) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.flights = flights;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}
	
	
	
}
