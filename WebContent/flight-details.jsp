<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="com.shweta.model.Flight" %>  
<%@ page import="com.shweta.model.Airline" %>
<%@ page import="com.shweta.model.Place" %>
<%@ page import="com.shweta.model.Ticket" %>    
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


  


 <div align="center">
  <h3>Flight Details</h3>
  <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Flight Code</b></th> 
          <th><b>Airline Name</b></th>
          <th><b>Depart Date</b></th>
          <th><b>SOURCE</b></th> 
          <th><b>DESTINATION</b></th> 
         </tr> 
         <%ArrayList<Flight> flight =  
            (ArrayList<Flight>)request.getAttribute("flights"); 
        for(Flight f:flight){ %>
        
        <tr> 
                <td><%=f.getFlightCode()%></td> 
                <td><%=f.getAirline().getName()%></td> 
                <td><%=f.getDepartDate()%></td> 
                <td><%=f.getPlace().getSource()%></td>
                <td><%=f.getPlace().getDestination()%></td>
                
            </tr> 
            <%}%> 
        </table>  
        <hr/> 
</div>       
</body>
</html>