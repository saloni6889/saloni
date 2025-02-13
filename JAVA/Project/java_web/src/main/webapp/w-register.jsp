<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--? Contact form Start -->
		<div class="contact-form section-padding30 fix">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-xl-6 col-lg-6">
						<div class="form-wrapper">
	                    <form id="contact-form" action="Wp_Controller" method="POST">
	                 	<!-- section tittle -->
		                <div class="row ">
			            <div class="col-lg-12">
				      <div class="section-tittle tittle-form text-center mb-30">
					<h2>WeddingPlanner</h2>

				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="form-box mb-30">
					<input type="text" name="name" placeholder="name">
				</div>
			</div>


			<div class="col-lg-12">
				<div class="form-box mb-30">
					<input type="text" name="address" placeholder="address">
				</div>
			</div>
			<div class="col-lg-12">
				<div class="form-box mb-30">
					<input type="text" name="contact" placeholder="contact">
				</div>
			</div>
			<div class="col-lg-12">
				<div class="form-box mb-30">
					<input type="text" name="email" placeholder="email">
				</div>
			</div>
			<div class="col-lg-12">
				<div class="form-box mb-30">
					<input type="text" name="password" placeholder="password">
				</div>
			</div>

	<div class="submit-info">
				<button class="btn" type="submit" name="action" value="register">Confirm now</button>
			</div>
		</div>
	</form>
	</div>
	</div>
	</div>
	</div>
	</div>

</body>
</html>