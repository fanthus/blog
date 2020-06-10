<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/9
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP内置对象测试</title>
</head>
<body>
    <%
        //直接使用内置对象 request 来获取参数 id
        String id = request.getParameter("id");
    %>
    <p> 从 request 中获取参数为 - </p>
    <p> id 为 <%=id%> </p>
    <p></p>
    <%
        out.write("hello world");
        Class t = page.getClass();
        pageContext.getAttribute("id");
    %>

</body>
</html>
