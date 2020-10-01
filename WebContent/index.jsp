<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.shweta.model.Place" %> 
 <%@ page import="java.util.ArrayList" %> 
 <%@ page import="java.time.LocalDate" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body style="background-color:pink;">
<div align="center" width="400px;"style="border:9px solid pink;">
<h1>Welcome to FlyAway Ticket Booking Portal</h1>
</div>

<div align="right"><a href="admin-login.jsp" >Admin</a></div>

<div align="center" class="container">
	<section id="content">
		<form action="home-servlet" method="post">
			<h1>Search Flights</h1>
			<div> Source
				<select name="source" id="source">
                            <option value="Ahemdabad">Ahemdabad</option>
                            <option value="Bangalore">Bangalore</option>
                            <option value="Chennai">Chennai</option>
                            <option value="Delhi">Delhi</option>
                            <%String source = request.getParameter("source");
                            session.setAttribute("source", source);
                            %>
                            
                </select>
			</div>
			<div> Destination
				 <select name="destination" id="destination">
                            <option value="Ahemdabad">Ahemdabad</option>
                            <option value="Bangalore">Bangalore</option>
                            <option value="Chennai">Chennai</option>
                            <option value="Delhi">Delhi</option>
                            <%String destination = request.getParameter("destination");
                            session.setAttribute("destination", destination);
                            %>
                </select>
			</div> 
			<div>Date of Travel
			    <input type="date" name="date" id="date" required > 
			    <%String date = request.getParameter("date");
                            session.setAttribute("date", date);
                            %>
			</div>
			<div> Number of Passengers
			    <input type="text" name="passengers" id="passengers" required > 
			    <%String total_passengers = request.getParameter("passengers");
                            session.setAttribute("total_passengers", total_passengers);
                            %>
			</div>
			<div>
				<input type="submit" value="Search Flights" />
				
				
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
         
          

<footer align="right">
<p>Developed by Shweta Khandelwal</p>
</footer>



</body>
</html>