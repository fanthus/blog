package com.fanthus.servlet;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/lifecycle/servlet")
public class LifecycleServlet implements Servlet {

    //构造函数
    public LifecycleServlet() {
        System.out.println("创建 LifeCycleServlet 对象");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("名字"+servletConfig.getServletName());
        System.out.println("初始化 servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行 servlet 业务逻辑");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("释放 servlet");
    }
}
