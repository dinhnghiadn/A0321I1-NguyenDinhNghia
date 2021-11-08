<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/11/2021
  Time: 7:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Quản lý bệnh án</title>
</head>
<body>
<center>
    <h1>Chỉnh sửa bệnh án</h1>
    <h2>
        <a href="/benhan?action=list">Danh sách bệnh án</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Sửa bệnh án
                </h2>
            </caption>
            <c:if test="${benhan != null}">
                <input type="hidden" name="id" value="<c:out value='${benhan.id}' />"/>
            </c:if>
            <tr>
                <th>Id bệnh án:</th>
                <td>
                    <input readonly type="text" name="id" size="45"
                           value="<c:out value='${benhan.id}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Id bệnh nhân:</th>
                <td>
                    <input readonly type="text" name="idBenhNhan" size="45"
                           value="<c:out value='${benhan.idBenhNhan}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Tên bệnh nhân:</th>
                <td>
                    <input readonly type="text" name="tenBenhNhan" size="45"
                           value="<c:out value='${benhan.tenBenhNhan}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngày nhập viện:</th>
                <td>
                    <input type="text" name="nhapVien" size="45"
                           value="<c:out value='${benhan.nhapVien}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngày xuất viện:</th>
                <td>
                    <input type="text" name="xuatVien" size="45"
                           value="<c:out value='${benhan.xuatVien}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Lý do nhập viện:</th>
                <td>
                    <input type="text" name="lyDo" size="45"
                           value="<c:out value='${benhan.lyDo}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Lưu"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
