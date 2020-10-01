<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="com.shweta.model.Flight" %>     
    
    
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


<div align="center">
  <h2>Displaying Flight List</h2>
  <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>ID</b></th> 
          <th><b>CODE</b></th> 
          <th><b>ARRIVAL DATE</b></th> 
          <th><b>DEPARTURE DATE</b></th> 
          <th><b>ARRIVAL TIME</b></th> 
          <th><b>DEPARTURE TIME</b></th> 
          <th><b>TOTAL TICKETS</b></th> 
          <th><b>PRICE</b></th> 
          <th><b>Airline Id</b></th>
          <th><b>Place Id</b></th>
         </tr> 
         <%ArrayList<Flight> flight =  
            (ArrayList<Flight>)request.getAttribute("flight_data"); 
        for(Flight f:flight){ %>
        
        <tr> 
                <td><%=f.getId()%></td> 
                <td><%=f.getFlightCode()%></td>
                <td><%=f.getArrivalDate()%></td>
                <td><%=f.getDepartDate()%></td>
                <td><%=f.getArrivalTime()%></td>
                <td><%=f.getDepartureTime()%></td>
                <td><%=f.getTickets()%></td>
                <td><%=f.getPrice()%></td>
                <td><%=f.getAirline().getId()%></td> 
                <td><%=f.getPlace().getId()%></td> 
            </tr> 
            <%}%> 
        </table>  
        <hr/> 
</div>
</body>
</html>