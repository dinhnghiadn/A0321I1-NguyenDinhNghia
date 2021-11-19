<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    table {
        border: 1px solid #000;
    }

    th, td {
        border: 1px dotted #555;
    }
</style>
<h5>There are ${requestScope.list.size()} condiment(s) in list</h5>
<caption>Choosed Condiments</caption>
<ul>
    <c:forEach var="c" items="${requestScope.list}">

        <li>
            <c:out value="${c}"/>
        </li>

    </c:forEach>
</ul>
