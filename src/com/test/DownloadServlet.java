package com.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out;
        InputStream in;

        String fileName = req.getParameter("filename");
        if (fileName == null) {
            out = resp.getOutputStream();
            out.write("Please input filename.".getBytes());
            out.close();
            return;
        }

        in = getServletContext().getResourceAsStream("/store/" + fileName);
//        System.out.println(getServletContext().get);
        int length = in.available();

        resp.setContentType("application/force-download");
        resp.setHeader("Content-Length", String.valueOf(length));
        resp.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");

        out = resp.getOutputStream();
        int byteRead = 0;
        byte[] buffer = new byte[512];
        while ((byteRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, byteRead);
        }

        in.close();
        out.close();
    }
}
