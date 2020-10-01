<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
<a href="delete-flight.jsp">Delete Flight</a>  |

<div class="container">
	<section id="content">
		<form action="update-flight" method="post">
			<h1>Update Flight</h1>
			<div>Flight Id
				<input type="text" placeholder="Flight Id" required="" name="id" />
			</div>
			<div> Arrival Date
				<input type="date" placeholder="Arrival Date" required="" name="arrivalDate" />
			</div>
			<div> Departure Date
				<input type="date" placeholder="Departure Date" required="" name="departureDate" />
			</div>
			<div> Arrival Time
				<input type="time" placeholder="Arrival Time" required="" name="arrivalTime" />
			</div>
			<div> Departure Time
				<input type="time" placeholder="Departure Time" required="" name="departureTime" />
			</div>
			<div> Price
				<input type="text" placeholder="price" required="" name="price" />
			</div>
			
			<div> Place Id 
				<input type="text" placeholder="Place Id" required="" name="placeId" />
			</div>
			<div>
				<input type="submit" value="Update Flight" />
				
				
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->


</body>

</html>