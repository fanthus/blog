<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/19
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();         //从请求里获取 Cookie 信息
        for (Cookie cookie:cookies) {                    //遍历 Cookie
            String cookieName = cookie.getName();        //获取 Cookie 名字
            String cookieValue = cookie.getValue();      //获取 Cookie 值
            System.out.print("cookieName " + cookieName + ";"+ "cookieValue " + cookieValue + ";\n");
        }
        Cookie cookie = new Cookie("name","zhangsan");
        response.addCookie(cookie);
    %>
</body>
</html>
