<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="wp-header.jsp"%>
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
					<%
					String msg = (String) request.getAttribute("msg");
					if (msg != null) {
					%>
					<h3>
						<%
						out.print(msg);
						%>
					</h3>
					<%
					}
					%>
					<div class="form-wrapper">
						<form id="contact-form" action="PlanController" method="POST">
							<!-- section tittle -->
							<div class="row ">
								<div class="col-lg-12">
									<div class="section-tittle tittle-form text-center mb-30">
										<h2>Are you attending?</h2>
										<img src="assets/img/gallery/tittle_img2.png" alt="">
									</div>
								</div>
							</div>
							<div class="row">

								<div class="col-xl-12">
									<input type="hidden" name="id" value="<%=w.getId()%>">
									<select class="form-select wide" name="budget"
										id="default-select">
										<option value="1 Lac - 2 Lac">1 Lac - 2 Lac</option>
										<option value="2 Lac - 3 Lac">2 Lac - 3 Lac</option>
										<option value="3 Lac - 4 Lac">3 Lac - 4 Lac</option>
										<option value="4 Lac - 5 Lac">4 Lac - 5 Lac</option>
										<option value="5 Lac - 10 Lac">5 Lac - 10 Lac</option>
									</select>
								</div>
								<div class="col-lg-12 mb-30">
									<div class="select-itms">
										<select name="style" id="default-select">
											<option value="Standard">Standard</option>
											<option value="delux">Delux</option>
											<option value="superdelux">Super Delux</option>
											<option value="premium">Premium</option>
											<option value="theme">Theme</option>

										</select>
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-box mb-30">
										<input type="text" name="noofguest" placeholder="No of Guest">
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-box subject-icon mb-30">
										<input type="text" name="vanue" placeholder="vanue">
									</div>
								</div>
								<div class="form-box mb-30">
									<input type="text" name="photosvideos"
										placeholder="Photographs And Videos">
								</div>
							</div>
							<div class="form-box mb-30">
								<input type="text" name="noofguestfortransport"
									placeholder="Transportations For No of Guest">
							</div>


							<div class="submit-info">
								<button type="submit" name="action" value="add plan"
									class="boxed_btn3">Add Plan</button>
							</div>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>

</body>
</html>