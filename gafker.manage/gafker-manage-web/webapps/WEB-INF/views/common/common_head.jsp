<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.net.*"%>
<%@ page session="false" %><!-- 去用Shiro的session -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"
>
<meta content="telephone=no" name="format-detection" >
<meta http-equiv="Access-Control-Allow-Origin" content="*" >
<meta name="keywords" content="温暖,节日,祝福,上海,安徽,族谱,世界,传承,绿福客" />
<meta name="description" content="温暖,节日,祝福,上海,安徽,族谱,世界,传承,绿福客" />
<title>${wishes[0].students}祝福${wishes[0].teachers}：${wishes[0].content}。随时为身边的人还有远方的她送上最暖心的祝福(传承|世界|绿福客|暖心祝福)!</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
<script type="text/javascript" src='<c:url value="/js/jquery-1.7.2.min.js"/>'></script>