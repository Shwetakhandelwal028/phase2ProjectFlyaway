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

import com.shweta.util.HibernateUtil;
import com.shweta.model.Airline;;

/**
 * Servlet implementation class CreateAirline
 */
@WebServlet("/create-airline")
public class CreateAirline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAirline() {
        }

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
		String name =  request.getParameter("name");
		
		try {
			SessionFactory sFactory = HibernateUtil.buildSessionFactory();
			Session session = sFactory.openSession();
			Transaction trans = session.beginTransaction();
			
			Airline airline = new Airline();
			airline.setCode(code);
			airline.setName(name);
			
			session.save(airline);
			trans.commit();
			
			session.close();
			out.println("<h3>Airline Created!</h3>");
			request.getRequestDispatcher("admin-operations.jsp").include(request, response);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
