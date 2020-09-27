<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:pink;">
<div align="center" width="400px;"style="border:9px solid pink;">
<h1>Welcome to FlyAway Ticket Booking Portal</h1>
</div>

<div class="container">
	<section id="content">
		<form action="admin-login" method="post">
			<h1>Login Form</h1>
			<div>
				<input type="text" placeholder="Username" required="" name="username" />
			</div>
			<div>
				<input type="password" placeholder="Password" required="" name="password" />
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="">Change Password?</a>
				
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
</div>
</body>
</html>