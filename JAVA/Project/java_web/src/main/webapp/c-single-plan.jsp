<%@page import="Dao.weddingplannerDao"%>
<%@page import="Model.weddingplanner"%>
<%@page import="Dao.PlanDao"%>
<%@page import="Model.Plan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="c-header.jsp"%>
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
						<%
										String msg = (String)request.getAttribute("msg");
										if(msg!=null){
											%>
											<h3><%out.print(msg); %></h3>
											<%
										}
										%>
							<form id="contact-form" action="BookingController" method="POST">
								<!-- section tittle -->
								<div class="row ">
									<div class="col-lg-12">
										<div class="section-tittle tittle-form text-center mb-30">
											<h2>Book Wedding</h2>
											<img src="assets/img/gallery/tittle_img2.png" alt="">
										</div>
									</div>
								</div>
								<%int pid = Integer.parseInt(request.getParameter("pid")); %>
										<%Plan p = PlanDao.getPlanByPId(pid); %>
										<%weddingplanner w = weddingplannerDao.getSingleWP(p.getWp_id());%>
								<div class="row">
									<div class="col-lg-12">
										<div class="form-box mb-30">
											<input type="hidden" name="cusid" value="<%=c.getId()%>">
										</div>
									 </div>
								<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<input type="hidden" name="pid" value="<%=p.getPid()%>">
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>Wedding Planner name : <%=w.getName() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>Budget : <%=p.getBudget() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>Style : <%=p.getStyle() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>No of Guest : <%=p.getNoofguest() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>Vanue : <%=p.getVanue() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<h4>Photos Videos : <%=p.getPhotosvideos() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
							 				<h4>No of Guest Transport : <%=p.getNoofguestfortransport() %></h4>
										</div>
									</div>
									<div class="col-lg-12">
										<div class="form-box subject-icon mb-30">
											<input type="date" name="date" placeholder="select date">
										</div>
									</div>
									<button type="submit" name="action" value="booknow"class="boxed_btn3">Book</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		</div>
		<!-- Contact form End -->
</body>
</html>