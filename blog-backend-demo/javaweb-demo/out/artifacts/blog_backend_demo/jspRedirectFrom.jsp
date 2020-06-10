<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/12
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>H</title>
</head>
<body>
<%
    request.setAttribute("name", "tom");
    response.sendRedirect("jspRedirectTo.jsp");
%>
</body>
</html>
