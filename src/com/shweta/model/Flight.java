package com.shweta.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "flight")                
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "flight_id")
	private int id;

	@Column(name = "flight_code")
	private String flightCode;

	@Column(name = "arrival_date")
	private LocalDate arrivalDate;

	@Column(name = "departure_date")
	private LocalDate departDate;

	@Column(name = "arrival_time")
	private LocalTime arrivalTime;

	@Column(name = "departure_time")
	private LocalTime departureTime;

	@Column(name="total_tickets")
	private int tickets;
	
	@Column(name="price")
	private double price;
	
	@ManyToMany(targetEntity=User.class, cascade = { CascadeType.ALL} )
	@JoinTable(name="user", 
	joinColumns= {@JoinColumn(name="flight_id")},
	inverseJoinColumns= {@JoinColumn(name="user_id")})
	private List<User> user;

	@ManyToOne()
	@JoinColumn(name = "airline_id", nullable = false)
	private Airline airline;

	@ManyToOne()
	@JoinColumn(name = "place_id", nullable = false)
	private Place place;

	public Flight() {

	}

	public Flight(String flightCode, LocalDate arrivalDate, LocalDate departDate, LocalTime arrivalTime,
			LocalTime departureTime, int tot_tickets, double price, Airline airline, Place place) {
		super();
		this.flightCode = flightCode;
		this.arrivalDate = arrivalDate;
		this.departDate = departDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.tickets = tot_tickets;
		this.price = price;
		this.airline = airline;
		this.place = place;
	}
	

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	

}
