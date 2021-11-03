<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/11/2021
  Time: 4:47 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<meta charset="UTF-8">
<head>
    <title>Tạo layout trong Bootstrap</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>
<body>
<div class="container" style="height: auto">
    <header class="row">
        <img class="col-sm-2" style="width: 100px; height: 80px" src="/assert/image/hotel.jpg">
        <div class="col-sm-10">
            <h6 class="float-right">Nguyen Dinh Nghia</h6>
        </div>

    </header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#"><i class="fas fa-home"></i> Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-user"></i>Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/customer?action=list"><i class="far fa-user"></i>Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="far fa-phone"></i>Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-phone"></i>Liên hệ</a>
                </li>


            </ul>
            <div class="nav navbar-nav navbar-right">
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <div class="row" style="height: 70%">

        <aside class="col-sm-3">
            <div class="card-header">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-th-list"></span>
                    <strong>Item list</strong>
                </div>
                <div class="list-group">
                    <a href="#" class="list-group-item">Item 1</a>
                    <a href="#" class="list-group-item">Item 2</a>
                    <a href="#" class="list-group-item">Item 3</a>
                    <a href="#" class="list-group-item">Item 4</a>
                    <a href="#" class="list-group-item">Item 5</a>

                </div>
            </div>
        </aside>
        <article class="col-sm-9">
            <div class="row">
            </div>
        </article>
    </div>
    <footer class="card">
        <div class="card-header text-center">
            <p>CodeGym &copy; 2017</p>
        </div>
    </footer>
</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
