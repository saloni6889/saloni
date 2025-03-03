<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>
    <!-- Product Add Form -->
    <div class="product-form section-padding30 fix">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6 col-lg-6">
                    <%
                    String msg = (String) request.getAttribute("msg");
                    if (msg != null) {
                    %>
                        <div class="alert alert-info">
                            <%= msg %>
                        </div>
                    <%
                    }
                    %>
                    <div class="form-wrapper">
                        <form id="product-form" action="ProductController" method="POST">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>Add Product</h2>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <input type="text" name="name" placeholder="Product Name" required>
                                </div>
                                <div class="col-lg-12">
                                    <select name="category" required>
                                        <option value="Electronics">Electronics</option>
                                        <option value="Fashion">Fashion</option>
                                        <option value="Furniture">Furniture</option>
                                        <option value="Sports">Sports</option>
                                        <option value="Books">Books</option>
                                    </select>
                                </div>
                                <div class="col-lg-12">
                                    <input type="text" name="model" placeholder="Product Model" required>
                                </div>
                                <div class="col-lg-12">
                                    <input type="number" name="price" placeholder="Product Price" required>
                                </div>
                                <div class="col-lg-12">
                                    <textarea name="description" placeholder="Product Description" required></textarea>
                                </div>
                                <button type="submit" name="action" value="add product">Add Product</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>
    <!-- Product Add Form -->
    <div class="product-form section-padding30 fix">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-6 col-lg-6">
                    <%
                    String msg = (String) request.getAttribute("msg");
                    if (msg != null) {
                    %>
                        <div class="alert alert-info">
                            <%= msg %>
                        </div>
                    <%
                    }
                    %>
                    <div class="form-wrapper">
                        <form id="product-form" action="ProductController" method="POST">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="section-tittle tittle-form text-center mb-30">
                                        <h2>Add Product</h2>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <input type="text" name="name" placeholder="Product Name" required>
                                </div>
                                <div class="col-lg-12">
                                    <select name="category" required>
                                        <option value="Electronics">Electronics</option>
                                        <option value="Fashion">Fashion</option>
                                        <option value="Furniture">Furniture</option>
                                        <option value="Sports">Sports</option>
                                        <option value="Books">Books</option>
                                    </select>
                                </div>
                                <div class="col-lg-12">
                                    <input type="text" name="model" placeholder="Product Model" required>
                                </div>
                                <div class="col-lg-12">
                                    <input type="number" name="price" placeholder="Product Price" required>
                                </div>
                                <div class="col-lg-12">
                                    <textarea name="description" placeholder="Product Description" required></textarea>
                                </div>
                                <button type="submit" name="action" value="add product">Add Product</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
