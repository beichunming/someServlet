package com.bcm;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: servlet
 * @description:
 * @author: beichunming
 * @create: 2019-08-07 14:42
 **/
public class SomeServlet implements Servlet {

    public SomeServlet() {
        System.out.println("创建SomeSetvlet实例");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化SomeServlet实例");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("执行getServletConfig（）");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行SomeServlet实例的service（）方法");
    }

    @Override
    public String getServletInfo() {
        System.out.println("执行getServletInfo()");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁SomeServlet");
    }
}
