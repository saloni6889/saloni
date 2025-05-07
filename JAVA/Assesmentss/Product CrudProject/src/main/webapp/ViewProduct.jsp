<<<<<<< HEAD
<%@ page import="Dao.ProductDao" %>
<%@ page import="Model.Product" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Products</title>
</head>
<body>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Product Name</th>
                    <th scope="col">Category</th>
                    <th scope="col">Model</th>
                    <th scope="col">Price</th>
                    <th scope="col">Description</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Product> productList = ProductDao.getAllProducts();
                    for (Product product : productList) {
                %>
                    <tr>
                        <th scope="row"><%= product.getName() %></th>
                        <td><%= product.getCategory() %></td>
                        <td><%= product.getModel() %></td>
                        <td><%= product.getPrice() %></td>
                        <td><%= product.getDescription() %></td>
                        <!-- Edit Link Updated -->
                        <td><a href="ProductController?action=edit product&pid=<%= product.getId() %>">Edit</a></td>
                        <td><a href="ProductController?action=delete&pid=<%= product.getId() %>">Delete</a></td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
=======
<%@ page import="Dao.ProductDao" %>
<%@ page import="Model.Product" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Products</title>
</head>
<body>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Product Name</th>
                    <th scope="col">Category</th>
                    <th scope="col">Model</th>
                    <th scope="col">Price</th>
                    <th scope="col">Description</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Product> productList = ProductDao.getAllProducts();
                    for (Product product : productList) {
                %>
                    <tr>
                        <th scope="row"><%= product.getName() %></th>
                        <td><%= product.getCategory() %></td>
                        <td><%= product.getModel() %></td>
                        <td><%= product.getPrice() %></td>
                        <td><%= product.getDescription() %></td>
                        <!-- Edit Link Updated -->
                        <td><a href="ProductController?action=edit product&pid=<%= product.getId() %>">Edit</a></td>
                        <td><a href="ProductController?action=delete&pid=<%= product.getId() %>">Delete</a></td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
