<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/6/5
  Time: 11:39 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/save" method="post">
        用户名 id <input type="text" name="id"/><br/>
        用户名 <input type="text" name="name"/><br/>
        用户地址 <input type="text" name="address.value"/><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
