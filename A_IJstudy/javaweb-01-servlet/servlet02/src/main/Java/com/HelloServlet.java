package com;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello");

//        this.getInitParameter() //初始化
//        this.getServletConfig() //Servlet 配置
//        this.getServletContext() //Servlet 上下文

        ServletContext con = this.getServletContext();

        String name = "pjxs";
        con.setAttribute("username",name); // 把一个数据放入context中，名字为username。

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
