<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/9
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转发目的地的</title>
</head>
<body>
    <%
        //从 request 中获取数据
        Integer num = (Integer) request.getAttribute("number");
        System.out.print("forword to"+num);
        String val = num.toString();
        out.write(val);
        request.getParameter("");
        request.getParameterValues("");
    %>
</body>
</html>
