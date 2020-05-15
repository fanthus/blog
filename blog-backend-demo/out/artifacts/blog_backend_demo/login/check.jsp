<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/15
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("username");
        String password1 = request.getParameter("password");
        if (name.equals("admin") && password1.equals("123123")) {
            //登录
            request.setAttribute("name",name);
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        } else {
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>
