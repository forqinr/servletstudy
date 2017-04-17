package com.test;

import javax.servlet.*;
import java.io.IOException;

public class CheckServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");

        String msg;

        if (name == null) {
            msg = "Please input name";
        } else {
            msg = "Hello " + name;
        }

        servletRequest.setAttribute("msg", msg);

        System.out.println("before dispatcher");

        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("/out");
        dispatcher.forward(servletRequest, servletResponse);

        System.out.println("after dispatcher");
    }
}
