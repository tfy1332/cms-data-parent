<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/1/9
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/res/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<div class="container">
    <form name="form1" class="form-inline" method="post" action="saveUser" onSubmit="return check()">
        登录帐号：<input type="text" class="form-control" id="userName" name="userName"><br>
        登录密码：<input type="password" class="form-control"  id="userPWD" name="userPWD"><br>
        <input type="submit" class="btn btn-primary" name="submit" value="提交">
    </form>
</div>
<script src="${pageContext.request.contextPath}/res/js/jquery-2.2.0.min.js"></script>
<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
</body>
</html>
