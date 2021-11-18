<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translation</title>
</head>
<body>

<h1>Nhập từ tiếng anh:</h1>
<h3 style="color:red">${message}</h3>

<form action="translate" method="post">
    <input type="text" name="word"><br>
    <input type="submit" value="Validate">
</form>

</body>
</html>
