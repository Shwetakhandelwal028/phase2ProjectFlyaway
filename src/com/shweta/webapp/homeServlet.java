package com.shweta.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;

import com.shweta.model.Airline;
import com.shweta.model.Flight;
import com.shweta.model.Place;
import com.shweta.model.Ticket;
import com.shweta.util.HibernateUtil;

/**
 * Servlet implementation class homeServlet
 */
@WebServlet("/home-servlet")
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public homeServlet() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String s = request.getParameter("source");
		String d = request.getParameter("destination");
		
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		Integer tot_passengers = Integer.parseInt(request.getParameter("passengers"));
		
		System.out.println(s);
		System.out.println(d);

		try {
 			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction trans = session.beginTransaction();

			Query query = session.createQuery("select f.id, "
					+ "a.name, f.departDate, p.source, p.destination from Flight f "
					+ "join f.airline a join f.place p where  p.source = :s"
					+ " and p.destination = :d and f.departDate = :date");
		    query.setParameter("s", s);
		    query.setParameter("d", d);
			query.setParameter("date", date);
			
			List<Object[]> flight = query.getResultList();
			if(flight.isEmpty()) {
				out.println("<h3 style='color:red'; align = 'center'>No flights Available!!</h3>");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}else {
				request.setAttribute("flights", flight);
				request.getRequestDispatcher("flight-details.jsp").forward(request, response);
			}
			
			trans.commit();
			session.close();
			sFactory.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
		
}
