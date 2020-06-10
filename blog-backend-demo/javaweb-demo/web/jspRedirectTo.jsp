<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/12
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name =  (String)request.getAttribute("name");
        out.write(name);
    %>
</body>
</html>
