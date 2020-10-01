<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>     
<%@ page import="com.shweta.model.Place" %>  
<%@ page import="com.shweta.model.Airline" %>  


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

<div align="center" class="container">
	<section id="content">
		<form  action="book-flight" method="post">
			<h1>Book Flight</h1>
			<div> 
				<input type="text" placeholder="username" required="" name="name" />
			</div>			
			<div> 
				<input type="tel" placeholder="Mobile Num" required="" name="mobile" />
			</div>
			<div> 
				<input type="text" placeholder="age" required="" name="age" />
			</div>
			<div> 
				<input type="text" placeholder="Flight Id" required="" name="id" />
			</div>
			
            <div>
				<input type="submit" value="Book Flight" />
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
</body>
</html>