<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/1/9
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>用户信息列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">首页</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>

<div class="jumbotron">
    <h1 class="container">用户信息列表</h1>
    <div class="container">
        <table class="table table-hover">
            <tr>
                <th>序号</th>
                <th>用户ID</th>
                <th>用户名</th>
                <th>密码</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${ userList}" var="user" varStatus="status">
                <tr>
                    <td>${ status.index + 1}</td>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.userPWD}</td>
                    <td><a href="">更新</a> &nbsp;&nbsp;<a href="delete?id=${user.id}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<script src="${pageContext.request.contextPath}/res/js/jquery-2.2.0.min.js"></script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
</body>
</html>
