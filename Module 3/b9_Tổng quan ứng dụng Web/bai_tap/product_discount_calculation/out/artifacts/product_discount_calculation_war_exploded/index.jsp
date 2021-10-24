<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/10/2021
  Time: 9:31 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post", action="/calculate">
  <label>Description</label>
  <input  type="text" name="productDescription" placeholder="Enter descrition"/><br/>
  <input type="text" name="price" placeholder="Price"/><br/>
  <input type="text" name="percent" placeholder="Discount percentage"/><br/>
  <input type = "submit" id = "submit" value = "Calculate"/>
</form>
</body>
</html>
