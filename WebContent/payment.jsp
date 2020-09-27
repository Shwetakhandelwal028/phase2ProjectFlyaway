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
<h1>Welcome to FlyAway Ticket Booking Portal</h1>
</div>
<div align="center"><h3>Payment Gateway</h3></div>

<div class="container">
	<section id="content">
		<form action="payment" method="post">
			
			<div>
				<input type="text" placeholder="Card Number" required="" name="number" />
			</div>
			<div>
				<input type="text" placeholder="Name on Card" required="" name="name" />
			</div>
			<div>
				<input type="text" placeholder="cvv" required="" name="cvv" />
			</div>
			
			<div>
				<input type="submit" value="Make Payment" />
				
				
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->

</body>
</html>