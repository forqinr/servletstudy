package com.test;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeServlet extends GenericServlet {
    private int initVal = 0;
    private int serviceVal = 0;
    private int destroyVal = 0;
    private String name;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        name = config.getServletName();
        initVal++;
        System.out.println(name + ">init():Servlet被初始化了" + initVal + "次");
    }

    @Override
    public void destroy() {
        destroyVal++;
        System.out.println(name + ">destroy():Servlet被销毁了" + destroyVal + "次");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        serviceVal++;
        System.out.println(name + ">service():Servlet共响应了" + serviceVal + "次");
        String content1 = "初始化次数：" + initVal;
        String content2 = "响应客户请求次数：" + serviceVal;
        String content3 = "销毁次数：" + destroyVal;

        servletResponse.setContentType("text/html;charset=GB2312");

        PrintWriter out = servletResponse.getWriter();
        out.print("<html><head><title>LifeServlet</title></head>");
        out.print("<body>");
        out.print("<h1>" + content1 + "</h1>");
        out.print("<h1>" + content2 + "</h1>");
        out.print("<h1>" + content3 + "</h1>");
        out.print("</body></html>");
        out.close();

    }
}
