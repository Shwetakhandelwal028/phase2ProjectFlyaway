package com.shweta.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private int id;
	
	@Column(name="ticket_price")
	private double ticketPrice;
	
	@ManyToOne()
	@JoinColumn(name="flight_id", nullable = false)
	private Flight flight;
	
	public Ticket() {}
	

	public Ticket(double ticketPrice, Flight flight) {
		
		this.ticketPrice = ticketPrice;
		this.flight = flight;
	}

	

	public int getId() {
		return id;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
	
}
