<%@ page
	language="java"
	pageEncoding="utf-8"
%>
<%
 System.out.println(request.getParameter("username"));
 System.out.println(request.getParameter("psw"));
 String str="[{'pid':'1','pname':'吉林省'},{'pid':'2','pname':'辽宁省'},{'pid':'3','pname':'山东省'}]";
 out.println(str); 
%>
