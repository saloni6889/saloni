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
                              <form id="contact-form" action="Wp_Controller" method="POST">
                            <!-- section tittle -->
                            <div class="row ">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>Wedding Planner</h2>
                                        </div>
                                        <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                        <input type="email" name="email" placeholder="Email">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <button type="submit" name="action" value="getotp" class="boxed_btn3">Get OTP</button>

                                    </div>
                                </div>
                                </div>
                                </div>
                                </form>
                                <div class="form_heading text-center">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
         
    <!-- Contact form end -->
                                
</body>
</html>