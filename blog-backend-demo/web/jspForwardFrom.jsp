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
    <title>转发来源</title>
</head>
<body>
    <label>JSP forward from </label>
    <%
        String id = request.getParameter("id");
        Integer tid = Integer.parseInt(id);
        tid = tid + 1;
        System.out.print(tid);
        //将数据存储到 request 中
        request.setAttribute("number",tid);
        //获取请求派发到的目的地
        RequestDispatcher dispacher = request.getRequestDispatcher("jspForwardTo.jsp");
        //将请求转发到目的地
        dispacher.forward(request,response);
    %>
</body>
</html>
