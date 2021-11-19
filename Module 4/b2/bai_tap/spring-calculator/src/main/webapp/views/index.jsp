<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calculator" method="post">
    <input type="text" name="number1" value="${requestScope.number1}" >
    <input type="text" name="number2" value="${requestScope.number2}">
    </br>
    <input type="submit" name="ope" value="Addition(+)" >
    <input type="submit" name="ope" value="Subtraction(-)" >
    <input type="submit" name="ope" value="Multiplication(X)" >
    <input type="submit" name="ope" value="Division(/)" >

</form>
<h6>Result: ${requestScope.result}</h6>
</body>
</html>