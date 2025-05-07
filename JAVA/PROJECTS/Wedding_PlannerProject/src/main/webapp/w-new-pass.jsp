<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="header.jsp" %>
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
                        <%String email = (String)request.getAttribute("email"); %>
                            <!-- section tittle -->
                            <div class="row ">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                    <%
                                    String msg = (String)request.getAttribute("msg");
                                    if(msg!=null){
                                    	%>
                                    	 <div class="form_heading text-center">
                                            <h5><%out.print(msg); %></h5>
                                        </div>
                                    	<%
                                    }
                                    
                                    %>
                                        <div class="form_heading text-center">
                                        <h2>WeddingPlanner</h2>
                                        
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                        <input type="hidden" name="email" value="<%=email %>">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    
                                        <input type="password" name="np" placeholder="Enter New Password">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    
                                        <input type="password" name="cnp" placeholder="Confirm New Password">
                                    </div>
                                <div class="col-xl-12">
                                                    <button type="submit" name="action" value="cnp" class="boxed_btn3">Change Password</button>
                                                </div>
                                            </div>
                                </form>
                                <div class="form_heading text-center">
                                            <h3><a href="w-forgot-password.jsp">Forgot Password?</a></h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Contact form end  -->
</body>
</html>