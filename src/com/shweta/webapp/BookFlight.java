package com.shweta.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shweta.model.Flight;
import com.shweta.model.Place;
import com.shweta.model.User;
import com.shweta.util.HibernateUtil;

/**
 * Servlet implementation class BookFlight
 */
@WebServlet("/book-flight")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		Long mobile = Long.parseLong(request.getParameter("mobile"));
		Integer age = Integer.parseInt(request.getParameter("age"));
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		try {
		SessionFactory sFactory = HibernateUtil.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction trans = session.beginTransaction();
		
		
         Flight flight = new Flight();
         User  user  = new User(age, mobile, name);
		
         List<User> userlist = new ArrayList<>();
 		 userlist.add(user);
 		 
 		 flight.setUser(userlist);
 		 session.save(flight);
 		 session.save(user);
 		 trans.commit();
 		 session.close();
 		 
 		 request.getRequestDispatcher("payment.jsp").forward(request, response);
 		 
		}catch(Exception e) {
			e.printStackTrace();
		}
 		 
	}

}
