<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="wp-header.jsp"%>
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
                                    String msg = (String)request.getAttribute("msg");
                                    if(msg!=null){
                                    	%>
                                    	 <div class="form_heading text-center">
                                            <h5><%out.print(msg); %></h5>
                                        </div>
                                    	<%
                                    }
                                    
                                    %>
                                <div class="form_heading  text-center mb-30">
                                        <h2>Change Password</h2>
                                        </div>
                                        <form action="Wp_Controller" method="post">
                                        <div class="row">
                                
                                    <div class="form-box mb-30">
                                
                                       <input type="hidden" name="email" value="<%=w.getEmail()%>">

                                    </div>
                               
                                <div class="col-lg-12">
                                    <div class="form-box subject-icon mb-30">
                                        <input type="password" name="op" placeholder="Old Password">

                                    </div>
                                </div>
                            
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                        <input type="password" name="np" placeholder="New Password">

                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-box subject-icon mb-30">
                                        <input type="password" name="cnp" placeholder="Confirm New Password">

                                    </div>
                                </div>
                            
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                         <button type="submit" name="action" value="cp" class="boxed_btn3">Change Password</button>

                                    </div>
                                </div>
                             
                                <div class="col-lg-12">
                                    <div class="form_heading  text-center mb-30">
                                        <h2><a href="w-forgot-password.jsp">Forgot Password?</a></h2>
                                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
                </div>
    <!--? Contact form end -->
</body>
</html>