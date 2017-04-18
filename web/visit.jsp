<%@ page import="java.io.File" %>
<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 17/4/19
  Time: 上午6:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>visit.jsp</title>
</head>
<body>
    <%!
        File tempDir=null;

        public void jspInit(){
            // 这里这么调用出错了，因为application是_jspService()方法的局部变量
            // tempDir=(File)application.getAttrbute("javax.servlet.context.tempdir");
            // 因为实现了Servlet接口，所以可以如下这么调用
            tempDir= (File) getServletConfig().getServletContext().getAttribute("javax.servlet.context.tempdir");
        }
    %>

    工作目录为：<%=tempDir.getPath()%>
</body>
</html>
