<%@page import="Model.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Wedding | Template </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.html">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

    <!-- CSS here -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/css/flaticon.css">
    <link rel="stylesheet" href="assets/css/slicknav.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <link rel="stylesheet" href="assets/css/magnific-popup.css">
    <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/css/themify-icons.css">
    <link rel="stylesheet" href="assets/css/slick.css">
    <link rel="stylesheet" href="assets/css/nice-select.css">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
    
    
    Customer c = null;
    if(session.getAttribute("data")!=null){
    	c = (Customer)session.getAttribute("data");
    }
    else{
    	response.sendRedirect("w-login.jsp");
    }
%>
<header>

    <!-- Header Start -->
  
    
    <div class="header-area">
            <div class="main-header header-sticky">
                <div class="container">
                    <div class="row align-items-center">
                        <!-- Logo -->
                        <div class="col-xl-2 col-lg-2">
                            <div class="logo">
                                <a href="index.jsp"><img src="assets/img/logo/logo.png" alt=""></a>
                            </div>
                        </div>
                        <div class="col-xl-10 col-lg-10 col-md-10">
                            <!-- Main-menu -->
                            <div class="main-menu f-right d-none d-lg-block">
                                <nav>                              
                                    <ul id="navigation">                                                          
                                       <li><a class="active" href="c-home.jsp">home</a></li>
                                        <li><a href="#">Our Story</a></li>
                                         <li><a href="#">Booking <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="c-pending-booking.jsp">Pending Booking</a></li>
                                                <li><a href="c-confirmed-booking.jsp">Confirmed Booking</a></li>
                                                    </ul>
                                                     </li>
                                                <li><a href="#">Plan <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="c-view-plan.jsp">View Plan</a></li>
                                            </ul>
                                        </li>
                                       
                                        <li><a href="#"><%=c.getName() %> <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="w-profile.jsp">Profile</a></li>
                                                <li><a href="w-change-password.jsp">Change password</a></li>
                                                <li><a href="w-logout.jsp">Logout</a></li>
                                               
                                            </ul>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div> 
                        <!-- Mobile Menu -->
                        <div class="col-12">
                            <div class="mobile_menu d-block d-lg-none"></div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    <!-- Header End -->
</header>
</head>
<body>
</body>
</html>