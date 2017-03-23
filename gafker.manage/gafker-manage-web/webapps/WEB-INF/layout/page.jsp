<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<s:url value="/css/style.css"/>">
</head>
<body>
<div id="header">
<t:insertAttribute name="header"/>
</div>
<div id="content">
<t:insertAttribute name="body"/>
</div>
<div id="footer">
<t:insertAttribute name="footer"/>
</div>
</body>
</html>