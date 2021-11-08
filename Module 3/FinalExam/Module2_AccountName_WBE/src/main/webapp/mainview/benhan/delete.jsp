<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/11/2021
  Time: 8:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xoá bệnh án</title>
</head>
<body>
<h1>Xoá bệnh án</h1>

<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Thông tin bệnh án</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td>${requestScope["benhan"].getId()}</td>
            </tr>
            <tr>
                <td>Id bệnh nhân: </td>
                <td>${requestScope["benhan"].getIdBenhNhan()}</td>
            </tr>
            <tr>
                <td>Tên bệnh nhân: </td>
                <td>${requestScope["benhan"].getTenBenhNhan()}</td>
            </tr>
            <tr>
                <td>Ngày nhập viện viện: </td>
                <td>${requestScope["benhan"].getNhapVien()}</td>
            </tr>
            <tr>
                <td>Ngày xuất viện: </td>
                <td>${requestScope["benhan"].getXuatVien()}</td>
            </tr>
            <tr>
                <td>Lý do: </td>
                <td>${requestScope["benhan"].getLyDo()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Xoá bệnh án"></td>
                <td><a href="/benhan">Về trang bệnh án</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
