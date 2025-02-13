<%@page import="Dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Product</title>
</head>
<body>
<%
    try {
        int productId = Integer.parseInt(request.getParameter("pid"));
        ProductDao.deleteProduct(productId);
        response.sendRedirect("ViewProduct.jsp"); 
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>
