<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<h2>Mail Setting Information</h2>
<table>
    <tr>
        <td>Language :</td>
        <td>${language}</td>
    </tr>
    <tr>
        <td>Page size :</td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>Spam filter :</td>
        <td>${spamFilter ? "Yes" : "No"}</td>
    </tr>
    <tr>
        <td>Signature :</td>
        <td>${signature}</td>
    </tr>
</table>
<a href="/mail/setting">Back to setting</a>
</body>
</html>
