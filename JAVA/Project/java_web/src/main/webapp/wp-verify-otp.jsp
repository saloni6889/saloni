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
                                <%
										String msg = (String) request.getAttribute("msg");
										if (msg != null) {
										%>
										<div class="form_heading text-center">
										<h5>
												<%
												out.print(msg);
												%>
											</h5>
										</div>
										<%
										}
										%>
										<div class="form_heading text-center">
											<h3>Wedding Planner</h3>
										</div>
										<form action="Wp_Controller" method="post">
											<%
											int otp = (Integer) (request.getAttribute("otp"));
											%>
											<%
											String email = (String) request.getAttribute("email");
											%>
										<div class="row">
												<input type="hidden" name="email" value="<%=email%>">
												<input type="hidden" name="otp1" value="<%=otp%>">
												<div class="col-xl-12">
										<input type="text" name="otp2" placeholder="Enter OTP">
												</div>
												<div class="col-xl-12">
													<button type="submit" name="action" value="verify"
														class="boxed_btn3">Verify</button>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- / Contact form end -->                            
</body>
</html>