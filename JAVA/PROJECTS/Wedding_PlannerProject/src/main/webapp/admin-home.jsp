<%@page import="Dao.weddingplannerDao"%>
<%@page import="Model.weddingplanner"%>
<%@page import="Dao.CustomerDao"%>
<%@page import="Model.Customer"%>
<%@page import="Dao.PlanDao"%>
<%@page import="Model.Plan"%>
<%@page import="Dao.BookingDao"%>
<%@page import="Model.Booking"%>
<%@page import="java.util.List"%>
<%@page import="Model.Admin"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>DASHGUM - FREE Bootstrap Admin Template</title>

    <!-- Bootstrap core CSS -->
    <link href="assets(Admin)/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets(Admin)/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets(Admin)/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets(Admin)/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets(Admin)/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="assets(Admin)/css/style.css" rel="stylesheet">
    <link href="assets(Admin)/css/style-responsive.css" rel="stylesheet">

    <script src="assets(Admin)/js/chart-master/Chart.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  
      <%
	Admin a = null;
	if (session.getAttribute("data") != null) {
		a = (Admin) session.getAttribute("data");
	} else {
		response.sendRedirect("admin-login.jsp");
	}
	%>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <header class="header black-bg">
              <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
              </div>
            <!--logo start-->
           <a href="index.html" class="logo"><b><%=a.getEmail()%></b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
                <!--  notification start -->
                <ul class="nav top-menu">
                    <!-- settings start -->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
                            <i class="fa fa-tasks"></i>
                            <span class="badge bg-theme">4</span>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="top-menu">
            	<ul class="nav pull-right top-menu">
                    <li><a class="logout" href="login.html">Logout</a></li>
            	</ul>
            </div>
        </header>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu" id="nav-accordion">
					<p class="centered">
						<a href="profile.html"><img src="assets(Admin)/img/ui-sam.jpg" class="img-circle" width="60"></a>
					</p>

					<li class="mt"><a class="active" href="javascript:void(0)" onclick="showWeddingPlanners()"> <i class="fa fa-dashboard"></i> <span>Wedding Planners</span></a></li>
					<li class="sub-menu"><a href="javascript:void(0)" onclick="showCustomers()"> <i class="fa fa-desktop"></i><span>Customers</span></a></li>
					<li class="sub-menu"><a href="javascript:void(0)" onclick="showPlans()"> <i class="fa fa-cogs"></i><span>Plans</span></a></li>
					<li class="sub-menu"><a href="javascript:void(0)" onclick="showBookings()"> <i class="fa fa-cogs"></i><span>Bookings</span></a></li>
				</ul>
				<!-- sidebar menu end-->
			</div>
		</aside>
		<!--sidebar end-->  

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT SECTION
      *********************************************************************************************************************************************************** -->
		<section id="main-content">
			<section class="wrapper" id="data-section">
				<!-- Wedding Planners Data -->
				<div id="wedding-planners" style="display:none;">
					<h3><i class="fa fa-angle-right"></i> Wedding Planners Data</h3>
					<div class="row mt">
						<div class="col-lg-12">
							<div class="content-panel">
								<h4><i class="fa fa-angle-right"></i> Wedding Planners</h4>
								<section id="unseen">
									<table class="table table-bordered table-striped table-condensed">
										<thead>
											<tr>
												<th>Id</th>
												<th>Name</th>
												<th>Contact</th>
												<th>Address</th>
												<th>Email</th>
												<th>Password</th>
											</tr>
										</thead>
										<tbody>
											<%
											List<weddingplanner> list = weddingplannerDao.getAllWeddingPlanners();
											%>
											<%
											for (weddingplanner w : list) {
											%>
											<tr>
												<td><%=w.getId()%></td>
												<td><%=w.getName() %></td>
												<td><%=w.getContact() %></td>
												<td><%=w.getAddress() %></td>
												<td><%=w.getEmail() %></td>
												<td><%=w.getPassword() %></td>
											</tr>
											<%
											}
											%>
										</tbody>
									</table>
								</section>
							</div>
						</div>
					</div>
				</div>

				<!-- Customers Data -->
				<div id="customers" style="display:none;">
					<h3><i class="fa fa-angle-right"></i> Customers Data</h3>
					<div class="row mt">
						<div class="col-lg-12">
							<div class="content-panel">
								<h4><i class="fa fa-angle-right"></i> Customers</h4>
								<section id="unseen">
									<table class="table table-bordered table-striped table-condensed">
										<thead>
											<tr>
												<th>Id</th>
												<th>Name</th>
												<th>Contact</th>
												<th>Address</th>
												<th>Email</th>
												<th>Password</th>
											</tr>
										</thead>
										<tbody>
											<%
											List<Customer> list1 = CustomerDao.getAllCustomers();
											%>
											<%
											for (Customer c : list1) {
											%>
											<tr>
												<td><%=c.getId()%></td>
												<td><%=c.getName() %></td>
												<td><%=c.getContact() %></td>
												<td><%=c.getAddress() %></td>
												<td><%=c.getEmail() %></td>
												<td><%=c.getPassword() %></td>
											</tr>
											<%
											}
											%>
										</tbody>
									</table>
								</section>
							</div>
						</div>
					</div>
				</div>

          <!-- Plan Data -->
          <div id="plans" style="display:none;">
            <h3><i class="fa fa-angle-right"></i> Plans Data</h3>
            <div class="row mt">
              <div class="col-lg-12">
                <div class="content-panel">
                  <h4><i class="fa fa-angle-right"></i> Plans</h4>
                  <section id="unseen">
                    <table class="table table-bordered table-striped table-condensed">
                      <thead>
                        <tr>
                          <th>Plan ID</th>
                          <th>Wedding Planner ID</th>
                          <th>Budget</th>
                          <th>Style</th>
                          <th>No of Guests</th>
                          <th>Venue</th>
                          <th>Photos/Videos</th>
                          <th>No of Guests for Transport</th>
                        </tr>
                      </thead>
                      <tbody>
                        <%
                        List<Plan> plans = PlanDao.getAllPlans();
                        for (Plan p : plans) {
                        %>
                        <tr>
                          <td><%=p.getPid()%></td>
                          <td><%=p.getWp_id() %></td>
                          <td><%=p.getBudget() %></td>
                          <td><%=p.getStyle() %></td>
                          <td><%=p.getNoofguest() %></td>
                          <td><%=p.getVanue() %></td>
                          <td><%=p.getPhotosvideos() %></td>
                          <td><%=p.getNoofguestfortransport() %></td>
                        </tr>
                        <%
                        }
                        %>
                      </tbody>
                    </table>
                  </section>
                </div>
              </div>
            </div>
          </div>

          <!-- Booking Data -->
          <div id="bookings" style="display:none;">
            <h3><i class="fa fa-angle-right"></i> Bookings Data</h3>
            <div class="row mt">
              <div class="col-lg-12">
                <div class="content-panel">
                  <h4><i class="fa fa-angle-right"></i> Bookings</h4>
                  <section id="unseen">
                    <table class="table table-bordered table-striped table-condensed">
                      <thead>
                        <tr>
                          <th>Booking ID</th>
                          <th>Plan ID</th>
                          <th>Customer ID</th>
                          <th>Booking Status</th>
                          <th>Payment Status</th>
                        </tr>
                      </thead>
                      <tbody>
                        <%
                        List<Booking> bookings = BookingDao.getAllBookings();
                        for (Booking b : bookings) {
                        %>
                        <tr>
                          <td><%=b.getBid()%></td>
                          <td><%=b.getPid() %></td>
                          <td><%=b.getCus_id() %></td>
                          <td><%=b.getBooking_status() %></td>
                          <td><%=b.getPayment_status() %></td>
                        </tr>
                        <%
                        }
                        %>
                      </tbody>
                    </table>
                  </section>
                </div>
              </div>
            </div>
          </div>
        </section>
      </section>
		<!-- js placed at the end of the document so the pages load faster -->
		<script src="assets(Admin)/js/jquery.js"></script>
		<script src="assets(Admin)/js/bootstrap.min.js"></script>

		<script type="text/javascript">
			// Function to show Wedding Planners data
			function showWeddingPlanners() {
				document.getElementById("wedding-planners").style.display = "block";
				document.getElementById("customers").style.display = "none";
				document.getElementById("plans").style.display = "none";
				document.getElementById("bookings").style.display = "none";
			}

			// Function to show Customers data
			function showCustomers() {
				document.getElementById("wedding-planners").style.display = "none";
				document.getElementById("customers").style.display = "block";
				document.getElementById("plans").style.display = "none";
				document.getElementById("bookings").style.display = "none";
			}

			// Function to show Plans data
			function showPlans() {
				document.getElementById("wedding-planners").style.display = "none";
				document.getElementById("customers").style.display = "none";
				document.getElementById("plans").style.display = "block";
				document.getElementById("bookings").style.display = "none";
			}

			// Function to show Bookings data
			function showBookings() {
				document.getElementById("wedding-planners").style.display = "none";
				document.getElementById("customers").style.display = "none";
				document.getElementById("plans").style.display = "none";
				document.getElementById("bookings").style.display = "block";
			}
		</script>

	</body>
</html>


		<!-- js placed at the end of the document so the pages load faster -->
		<script src="assets(Admin)/js/jquery.js"></script>
		<script src="assets(Admin)/js/jquery-1.8.3.min.js"></script>
		<script src="assets(Admin)/js/bootstrap.min.js"></script>
		<script class="include" type="text/javascript"
			src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="assets(Admin)/js/jquery.scrollTo.min.js"></script>
		<script src="assets(Admin)/js/jquery.nicescroll.js" type="text/javascript"></script>
		<script src="assets(Admin)/js/jquery.sparkline.js"></script>


		<!--common script for all pages-->
		<script src="assets(Admin)/js/common-scripts.js"></script>

		<script type="text/javascript"
			src="assets(Admin)/js/gritter/js/jquery.gritter.js"></script>
		<script type="text/javascript" src="assets/js/gritter-conf.js"></script>

		<!--script for this page-->
		<script src="assets(Admin)/js/sparkline-chart.js"></script>
		<script src="assets(Admin)/js/zabuto_calendar.js"></script>

		<!-- <script type="text/javascript">
		$(document)
				.ready(
						function() {
							var unique_id = $.gritter
									.add({
										// (string | mandatory) the heading of the notification
										title : 'Welcome to Dashgum!',
										// (string | mandatory) the text inside the notification
										text : 'Hover me to enable the Close Button. You can hide the left sidebar clicking on the button next to the logo. Free version for <a href="http://blacktie.co" target="_blank" style="color:#ffd777">BlackTie.co</a>.',
										// (string | optional) the image to display on the left
										image : 'assets/img/ui-sam.jpg',
										// (bool | optional) if you want it to fade out on its own or just sit there
										sticky : true,
										// (int | optional) the time you want it to be alive for before fading out
										time : '',
										// (string | optional) the class name you want to apply to that specific message
										class_name : 'my-sticky-class'
									});

							return false;
						});
	</script> -->

		<script type="application/javascript">
			
			
			
		
		
		
        $(document).ready(function () {
            $("#date-popover").popover({html: true, trigger: "manual"});
            $("#date-popover").hide();
            $("#date-popover").click(function (e) {
                $(this).hide();
            });
        
            $("#my-calendar").zabuto_calendar({
                action: function () {
                    return myDateFunction(this.id, false);
                },
                action_nav: function () {
                    return myNavFunction(this.id);
                },
                ajax: {
                    url: "show_data.php?action=1",
                    modal: true
                },
                legend: [
                    {type: "text", label: "Special event", badge: "00"},
                    {type: "block", label: "Regular event", }
                ]
            });
        });
        
        
        function myNavFunction(id) {
            $("#date-popover").hide();
            var nav = $("#" + id).data("navigation");
            var to = $("#" + id).data("to");
            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
        }
	
		</script>
</body>
</html>