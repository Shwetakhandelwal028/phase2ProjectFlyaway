<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>     
<%@ page import="com.shweta.model.Place" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:pink;">
<div align="center" width="400px;"style="border:9px solid pink;">
<h1>Welcome to FlyAway Admin Portal</h1>
</div>

<a href="create-airline.jsp">Create Airline</a> |
<a href="show-airline">Show Airlines</a> |
<a href="update-airline.jsp">Update Airline</a> |
<a href="delete-airline.jsp">Delete Airline</a> |
<a href="create-place.jsp">Create Place</a> |
<a href="show-places">Show Places</a> |
<a href="update-place.jsp">Update Place</a> |
<a href="delete-place.jsp">Delete Place</a> |
<a href="create-flight.jsp">Create Flight</a> |
<a href="show-flights">Show Flights</a> |
<a href="update-flight.jsp">Update Flight</a> |
<a href="delete-flight.jsp">Delete Flight</a> |
<a href="create-ticket.jsp">Create Ticket</a> |
<a href="show-tickets">Show Tickets</a> |
<a href="update-ticket.jsp">Update Ticket</a> 

<div align="center">
  <h2>Displaying Places List</h2>
  <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>ID</b></th> 
          <th><b>SOURCE</b></th> 
          <th><b>DESTINATION</b></th> 
         </tr> 
         <%ArrayList<Place> place =  
            (ArrayList<Place>)request.getAttribute("placedata"); 
        for(Place p:place){ %>
        
        <tr> 
                <td><%=p.getId()%></td> 
                <td><%=p.getSource()%></td>
                <td><%=p.getDestination()%></td>
                
            </tr> 
            <%}%> 
        </table>  
        <hr/> 
</div>

</body>
</body>
</html>