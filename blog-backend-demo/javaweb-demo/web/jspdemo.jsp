<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/6
  Time: 10:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        public String test() {
            return "Hello world!!!";
        }
    %>
    <%
        String str = test();
    %>
    <%=
        str
    %>
</body>
</html>
