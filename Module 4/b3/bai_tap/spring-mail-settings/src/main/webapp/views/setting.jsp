<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Mail Setting</title>
</head>
<body>
<h3>Mail Setting</h3>
<form:form method="POST" action="info" modelAttribute="mailSetting">
    <table>
        <tr>
            <td><form:label path="language">Language: </form:label></td>
            <td><form:select path="language">
                <form:options cssStyle="size: 200px" items="${listOfLanguages}"></form:options>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page size </form:label></td>

            <td>
                Show
                <form:select path="pageSize">
                <form:options items="${listOfSizes}"></form:options>
            </form:select>
                email per pages
            </td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Spam Filter: </form:label></td>
            <td><form:checkbox path="spamFilter"/>
            Enable spams filter
            </td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature: </form:label></td>
            <td><form:textarea cssStyle="size: 200px" path="signature"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>