package com.shweta.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shweta.model.Airline;
import com.shweta.util.HibernateUtil;

/**
 * Servlet implementation class DeleteAirline
 */
@WebServlet("/delete-airline")
public class DeleteAirline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAirline() {}

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
		
		try {
			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction trans = session.beginTransaction();
			
			Airline airline = session.get(Airline.class, id);
			
			if(airline!= null) {
				session.delete(airline);
				
			}
			
			
			trans.commit();
			
			session.close();
			
			out.println("<h3>Airline Deleted!</h3>");
			request.getRequestDispatcher("admin-operations.jsp").include(request, response);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
