din.jsp is including content.jsp
<%
    int var=1;
    request.setAttribute("username","tom");
%>
<%--这么写会报错，因为这是动态包含--%>
<jsp:include page="content.jsp"/>
<p>din.jsp is doing somthing else.</p>