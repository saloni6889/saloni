<%@ page import="Dao.ProductDao"%>
<%@page import="Model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
</head>
<body>
<% 
	
    Product p = (Product)(request.getAttribute("product"));
%>

    <!-- Product edit form start -->
    <div class="contact-form section-padding30 fix">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6 col-lg-6">
                    <%
                        String msg = (String) request.getAttribute("msg");
                        if (msg != null) {
                    %>
                    <h3>
                        <%= msg %>  <!-- Message print karne ka sahi tareeka -->
                    </h3>
                    <%
                        }
                    %>
                    <div class="form-wrapper">
                        <form id="contact-form" action="ProductController" method="POST">
                            <!-- Section title -->
                            <div class="row ">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>Edit Product Details</h2>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <!-- Product Name -->
                                <div class="col-xl-12">
                                    <div class="form-box mb-30">
                                        <input type="hidden" name="productId" value="<%= p.getId() %>">
                                        <input type="text" name="productName" value="<%= p.getName() %>">
                                    </div>
                                </div>

                                <!-- Product Category -->
                                <div class="col-lg-12 mb-30">
                                    <div class="form-box mb-30">
                                        <input type="text" name="productCategory" value="<%= p.getCategory() %>">
                                    </div>
                                </div>

                                <!-- Product Model -->
                                <div class="col-lg-12 mb-30">
                                    <div class="form-box mb-30">
                                        <input type="text" name="productModel" value="<%= p.getModel() %>">
                                    </div>
                                </div>

                                <!-- Product Price -->
                                <div class="col-lg-12 mb-30">
                                    <div class="form-box mb-30">
                                        <input type="text" name="productPrice" value="<%= p.getPrice() %>">
                                    </div>
                                </div>

                                <!-- Product Description -->
                                <div class="col-lg-12 mb-30">
                                    <div class="form-box mb-30">
                                        <input type="text" name="productDescription" rows="3" value="<%= p.getDescription() %>">
                                    </div>
                                </div>
                            </div>

                            <!-- Submit Button -->
                            <div class="submit-info">
                                <button type="submit" name="action" value="update product" class="boxed_btn3">Update Product</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>