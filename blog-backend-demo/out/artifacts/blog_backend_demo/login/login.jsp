<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/15
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="/login/check.jsp" method="post">
    用户名: <input type="text" name="username"/>
    密码: <input type="password" name="password"/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
