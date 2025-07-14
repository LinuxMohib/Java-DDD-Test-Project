<%@ page contentType="text/html;charset=UTF-8" %>
<%
    request.setAttribute("pageTitle", "Dashboard");
    request.setAttribute("body", "dashboardContent.jsp");
%>
<jsp:include page="layout.jsp" />