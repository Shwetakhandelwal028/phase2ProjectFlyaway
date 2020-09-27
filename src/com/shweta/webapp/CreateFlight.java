package com.shweta.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shweta.model.Airline;
import com.shweta.model.Flight;
import com.shweta.model.Place;
import com.shweta.util.HibernateUtil;

/**
 * Servlet implementation class CreateFlight
 */
@WebServlet("/create-flight")
public class CreateFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateFlight() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String code =  request.getParameter("code");
		LocalDate arrivalDate = LocalDate.parse(request.getParameter("arrivalDate"));
		LocalDate departureDate = LocalDate.parse(request.getParameter("departureDate"));
		LocalTime arrivalTime = LocalTime.parse(request.getParameter("arrivalTime"));
		LocalTime departureTime = LocalTime.parse(request.getParameter("departureTime"));
		Integer airlineId = Integer.parseInt(request.getParameter("airlineId"));
		Integer placeId = Integer.parseInt(request.getParameter("placeId"));
		Integer totalTicket = Integer.parseInt(request.getParameter("totalTicket"));
		Double price = Double.parseDouble(request.getParameter("price"));
		try {
			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction trans = session.beginTransaction();
			
			
			Airline airline = new Airline();
			Place place = new Place();
			airline.setId(airlineId);
		    place.setId(placeId);
			Flight flight = new Flight(code, arrivalDate, departureDate, arrivalTime, departureTime, totalTicket,
					price,airline, place);
			
			
			Set<Flight> flightSet  = new HashSet<>();
			flightSet.add(flight);
			
		    airline.setFlights(flightSet);
		    place.setFlights(flightSet);
		    session.save(flight);
			
			
			trans.commit();
			
			session.close();
			out.println("<h3>Flight Created!</h3>");
			request.getRequestDispatcher("admin-operations.jsp").include(request, response);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
