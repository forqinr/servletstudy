package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println(username);

        if (username != null) {
//            username = new String(username.getBytes("ISO-8859-1"), "GB2312");
        }

        if (username == null) {
            response.sendError(response.SC_FORBIDDEN);
            return;
        }

        response.setContentType("text/html;charset=GB2312");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>HelloServlet</title></head>");
        out.println("<body>");
        out.println("你好：" + username);
        out.println("</body></html>");

        System.out.println("before close():" + response.isCommitted());
        out.close();
        System.out.println("after close():" + response.isCommitted());
    }
}
