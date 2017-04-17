package com.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextTesterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();

        response.setContentType("text/html;charset=GB2312");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>ContextTesterServlet</title></head>");
        out.println("<body>");
        out.println("<br>Email:" + context.getInitParameter("emailOfewbmaster"));
        out.println("<br>Path:" + context.getRealPath("/WEB-INF"));
        out.println("<br>MimeType:" + context.getMimeType("/WEB-INF/web.xml"));
        out.println("<br>MajorVersion:" + context.getMajorVersion());
        out.println("<br>MinorVersion:" + context.getMinorVersion());
        out.print("<br>ServerInfo:" + context.getServerInfo());
        out.print("</body></html>");

        context.log("这是ContextTesterServlet输出的日志。");
        out.close();

    }
}
