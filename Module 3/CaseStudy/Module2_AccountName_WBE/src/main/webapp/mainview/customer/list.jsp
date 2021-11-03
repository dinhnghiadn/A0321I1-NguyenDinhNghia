<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/11/2021
  Time: 4:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">

</head>
<body>
<div class="container">
    <a href="/customer?action=create" class="btn btn-success">Thêm mới</a>
    <table id="customer" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID khách hàng</th>
            <th scope="col">Tên khách hàng</th>
            <th scope="col">Giới tính</th>
            <th scope="col">Ngày sinh</th>
            <th scope="col">Số CMND</th>
            <th scope="col">Số ĐT</th>
            <th scope="col">Email</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">Loại khách</th>
            <th scope="col">Hoạt động</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td> ${customer.id}</td>
                <td> ${customer.name}</td>
                <td> ${customer.gender}</td>
                <td> ${customer.birthday}</td>
                <td> ${customer.idCard}</td>
                <td> ${customer.phone}</td>
                <td> ${customer.email}</td>
                <td> ${customer.address}</td>
                <td> ${customer.typeId}</td>
                <td>
                    <a href="/customer?action=edit&id=${customer.id}">Edit</a>
                    <a href="/customer?action=delete&id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        })
    })
</script>
</body>
</html>
