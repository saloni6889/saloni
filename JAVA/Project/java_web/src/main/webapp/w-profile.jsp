<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file ="wp-header.jsp" %>
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
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>WeddingPlanner</h2>
                                     
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                        <input type="hidden" name="id" value="<%=w.getId()%>">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-box subject-icon mb-30">
                                        <input type="text" name="name" value="<%=w.getName()%>">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-box subject-icon mb-30">
                                        <input type="text" name="contact" value="<%=w.getContact()%>">
                                    </div>
                                </div>
                                
                                <div class="col-lg-12">
                                   
                                        <input type="text" name="email" value="<%=w.getEmail()%>">
                                    </div>
                                    <div class="col-lg-12">
                                  
                                        <input type="text" name="address" value="<%=w.getAddress()%>">
                                    </div>
                                </div>
                                </div>
                                <div class="col-xl-12">
                                                    <button type="submit" name="action" value="update" class="boxed_btn3">Update</button>
                                
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
        </div>
    </div>
    <!-- / Contact form end -->

</body>
</html>