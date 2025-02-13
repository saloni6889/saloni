<%@page import="Dao.weddingplannerDao"%>
<%@page import="Model.weddingplanner"%>
<%@page import="Dao.PlanDao"%>
<%@page import="Model.Plan"%>
<%@page import="java.util.List"%>
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
	<%
	List<Plan> list = PlanDao.getAllPlan();
	%>

	<div class="container">
		<div class="row">
			<%
			for (Plan p : list) {
			%>
			<%
			weddingplanner w = weddingplannerDao.getSingleWP(p.getWp_id());
			%>
			<div class="card" style="width: 18rem;">
				<div class="card-header"><%=w.getName()%></div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Budget : <%=p.getBudget() %></li>
					<li class="list-group-item">Style : <%=p.getStyle() %></li>
					<li class="list-group-item">No of Guest : <%=p.getNoofguest() %></li>
					<li class="list-group-item">Vanue : <%=p.getVanue() %></li>
					<li class="list-group-item">Photos Videos : <%=p.getPhotosvideos() %></li>
					<li class="list-group-item">No of Guest Tra: <%=p.getNoofguestfortransport() %></li>
				</ul>
				<div class="text-center"><a href="BookingController?action=booknow&pid=<%=p.getPid()%>&cusid=<%=c.getId()%>">Book Now</a></div>
				<br><br>
				<div class="text-center"><a href="c-single-plan.jsp?pid=<%=p.getPid()%>">Book Now</a></div>
			</div>
			<%
			}
			%>

		</div>
	</div>
</body>
</html>