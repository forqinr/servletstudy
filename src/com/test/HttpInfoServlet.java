package com.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class HttpInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=GB2312");
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>RequestInfo</title></head>");
        out.print("<body>");
        out.print("<br>LocalAddr:" + request.getLocalAddr());
        out.print("<br>LocalName:" + request.getLocalName());
        out.print("<br>LocalPort:" + request.getLocalPort());
        out.print("<br>Protocol:" + request.getProtocol());
        out.print("<br>RemoteAddr:" + request.getRemoteAddr());
        out.println("<br>RemoteHost:" + request.getRemoteHost());
        out.println("<br>RemotePort:" + request.getRemotePort());
        out.println("<br>Method:" + request.getMethod());
        out.println("<br>URI:" + request.getRequestURI());
        out.println("<br>ContextPath:" + request.getContextPath());
        out.println("<br>QueryString:" + request.getQueryString());

        out.println("<br>**************打印HTTP请求头**************");
        Enumeration eu = request.getHeaderNames();
        while (eu.hasMoreElements()) {
            String headerName = (String) eu.nextElement();
            out.println("<br>" + headerName + ": " + request.getHeader(headerName));
        }
        out.println("<br>**************打印HTTP请求头结束**************");

        out.println("<br>username: " + request.getParameter("username"));
        out.println("</body></html>");

        out.close();
    }
}
