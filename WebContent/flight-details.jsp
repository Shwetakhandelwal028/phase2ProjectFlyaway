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
          <th><b>Flight Id</b></th> 
          <th><b>Airline Name</b></th>
          <th><b>Depart Date</b></th>
          <th><b>SOURCE</b></th> 
          <th><b>DESTINATION</b></th> 
          <th><b> </b></th> 
         </tr> 
         <%ArrayList<Object[]> flight =  
            (ArrayList<Object[]>)request.getAttribute("flights"); 
        for(Object[] f:flight){ %>
        
        <tr> 
                <td><%=f[0]%></td> 
                <td><%=f[1]%></td> 
                <td><%=f[2]%></td> 
                <td><%=f[3]%></td>
                <td><%=f[4]%></td>
                <td><a href="book-flight.jsp">BOOK FLIGHT</a>
               <td>
               
               </td>
            </tr> 
            
            <%}%> 
        </table>  
        <hr/> 
</div>       
</body>
</html>