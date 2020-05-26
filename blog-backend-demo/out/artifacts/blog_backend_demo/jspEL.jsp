<%--
  Created by IntelliJ IDEA.
  User: xiushanfan
  Date: 2020/5/20
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("name","page_tomcat");
        request.setAttribute("name","request_tomcat");
        session.setAttribute("name","session_tomcat");
        application.setAttribute("name","application_tomcat");
    %>
    <%
        String name = (String)request.getAttribute("name");
    %>
    <%=name%>
    <br/>
    ${requestScope.name}
    <br/>
    <%
        pageContext.setAttribute("number1",5);
        pageContext.setAttribute("number2",2);
    %>
    ${number1 > number2}
    <br/>
    <%
        pageContext.setAttribute("tname","");
    %>
    ${not empty tname}

</body>
</html>
