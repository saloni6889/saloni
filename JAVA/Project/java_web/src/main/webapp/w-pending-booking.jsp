<%@page import="Dao.PlanDao"%>
<%@page import="Model.Plan"%>
<%@page import="Dao.BookingDao"%>
<%@page import="Model.Booking"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="wp-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Plan> plan_list = PlanDao.getPlanByWPId(w.getId()); %>
<%for(Plan p:plan_list){ %>
<%List<Booking> list = BookingDao.getPendingBookingByWeddingPlannerId(p.getPid()); %>
<%out.print(list); %>
<%} %>
</body>
</html>