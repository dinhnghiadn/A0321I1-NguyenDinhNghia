<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Sandwitch Condiment</title>
</head>
<body>
<h2>Choose Sandwitch Condiment</h2>
<form action="save" method="post">
    <input type="checkbox" id ="com1"  name="condiment" value="Lettuce">
    <label for="com1">Lettuce</label><br>
    <input type="checkbox" id ="com2"  name="condiment" value="Tomato">
    <label for="com2">Tomato</label><br>
    <input type="checkbox" id ="com3"  name="condiment" value="Mustard">
    <label for="com3">Mustard</label><br>
    <input type="checkbox" id ="com4"  name="condiment" value="Sprout">
    <label for="com4">Sprout</label><br>
    <input type="submit" value="Save" >
</form>
</body>
</html>