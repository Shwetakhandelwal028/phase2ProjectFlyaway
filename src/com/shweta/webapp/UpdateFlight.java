package com.shweta.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

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
 * Servlet implementation class UpdateFlight
 */
@WebServlet("/update-flight")
public class UpdateFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFlight() {}

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
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		LocalDate arrivalDate = LocalDate.parse(request.getParameter("arrivalDate"));
		LocalDate departureDate = LocalDate.parse(request.getParameter("departureDate"));
		LocalTime arrivalTime = LocalTime.parse(request.getParameter("arrivalTime"));
		LocalTime departureTime = LocalTime.parse(request.getParameter("departureTime"));
		int placeId = Integer.parseInt(request.getParameter("placeId"));
		int price = Integer.parseInt(request.getParameter("price"));
		try {
			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction trans = session.beginTransaction();
			
			Place place = new Place();
			Flight flight = session.get(Flight.class, id);
			
			flight.setArrivalDate(arrivalDate);
			flight.setDepartDate(departureDate);
			flight.setArrivalTime(arrivalTime);
			flight.setDepartureTime(departureTime);
			place.setId(placeId);
			flight.setPlace(place);
			flight.setPrice(price);
			
			session.update(flight);
			trans.commit();
			
			session.close();
			out.println("<h3>Flight Updated!</h3>");
			request.getRequestDispatcher("admin-operations.jsp").include(request, response);
			
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
