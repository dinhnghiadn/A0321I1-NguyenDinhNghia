<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08/10/2021
  Time: 9:44 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>${resultFromServlet}</h2>
<h2><%=request.getAttribute("resultFromServlet")%></h2>
</body>
</html>
