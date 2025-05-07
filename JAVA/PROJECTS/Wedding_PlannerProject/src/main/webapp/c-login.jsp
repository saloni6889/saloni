<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file ="header.jsp" %>
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
                         <form id="contact-form" action="customercontroller" method="POST">
                            <!-- section tittle -->
                            
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>Customer</h2>
                                        
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                        <input ty pe="text" name="email" placeholder="Email">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-box mb-30">
                                        <input type="text" name="password" placeholder="Password">
                                    </div>
                                </div>
                                <div class="submit-info">
                                    <button type="submit" name="action" value="login" class="boxed_btn3">Login</button>
                                </div>
                           </div>
                        </form>
                  </div>
                </div>
             </div>
          </div>       
       </div>       
     
    <!-- / Content form end -->

</body>
</html>