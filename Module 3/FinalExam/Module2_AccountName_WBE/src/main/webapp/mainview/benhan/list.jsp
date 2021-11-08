<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03/11/2021
  Time: 7:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách bệnh án</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">

</head>
<body>
<div class="container">
    <a href="/benhan?action=create" class="btn btn-success">Thêm mới</a>
    <table id="customer" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID bệnh án</th>
            <th scope="col">Tên bệnh nhân</th>
            <th scope="col">Id bệnh nhân</th>
            <th scope="col">Ngày nhập viện</th>
            <th scope="col">Ngày xuất viện</th>
            <th scope="col">Lý do nhập viện</th>
            <th scope="col">Tác vụ</th>


        </tr>
        </thead>
        <tbody>
        <c:forEach var="benhan" items="${benhAnList}">
            <tr>
                <td> ${benhan.id}</td>
                <td> ${benhan.tenBenhNhan}</td>
                <td> ${benhan.idBenhNhan}</td>
                <td> ${benhan.nhapVien}</td>
                <td> ${benhan.xuatVien}</td>
                <td> ${benhan.lyDo}</td>
                <td>
                    <a href="/benhan?action=edit&id=${benhan.id}">Edit</a>
                    <a href="/benhan?action=delete&id=${benhan.id}">Delete</a>
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
