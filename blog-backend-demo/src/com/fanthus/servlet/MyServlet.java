package com.fanthus.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/myservlet")
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String id = servletRequest.getParameter("id");
        System.out.println("Hello world.我是 Servlet，我已经接收到客户端发来的请求,参数是"+id);
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("你好，客户端");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
