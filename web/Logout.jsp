<%-- 
    Document   : Logout
    Created on : Apr 25, 2020, 10:22:32 PM
    Author     : neelanshi sharma
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.setAttribute("userid", null);
    session.invalidate();
    response.sendRedirect("Home.jsp");
%>  
