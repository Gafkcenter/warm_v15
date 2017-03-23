<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.net.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>${wishes[0].students}祝福${wishes[0].teachers}：${wishes[0].content}。随时为身边的人还有远方的她送上最暖心的祝福(传承|世界|绿福客|暖心祝福)!</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>" >
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>" >
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, 
maximum-scale=1.0, user-scalable=no" >
<meta content="telephone=no" name="format-detection" >
<meta http-equiv="Access-Control-Allow-Origin" content="*" >
<meta name="keywords" content="温暖,节日,祝福,上海,安徽,族谱,世界,传承,绿福客" />
<meta name="description" content="温暖,节日,祝福,上海,安徽,族谱,世界,传承,绿福客" />
 <script type="text/javascript">
function checkFile(obj){   
	        var file = obj.files[0];      
	        //判断类型是不是图片  
	        if(!/image\/\w+/.test(file.type)){     
	                alert("请确保文件为图像类型");   
	                return false;   
	        }
	} 
</script>
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" >
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/speed-loan.min.css" >
<style>
.footer {
	font-size: 12px;
	text-align: center;
	line-height: 15px;
	margin: 15px 0 5px;
	color: #b7b7b7;
}
</style>

</head>
<body>
<div align="right" style="margin-right: 5%" >
	
<c:if test="${empty user}" >
	欢迎第${vCount}位成员<b>来访者</b>
	<a href="${pageContext.request.contextPath}/admin/home" title="进入家园,要先登录" style="color:blue;">进入家园</a>&nbsp;
	<a href="${pageContext.request.contextPath}/security/login">登录家园</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<c:if test="${not empty user}" >
	欢迎第${vCount}位成员<b> ${user.username}</b> 
	<a href="${pageContext.request.contextPath}/admin/home" title="进入家园,要先登录" style="color:blue;">进入家园</a>&nbsp;
	<a href="javascript:alert('暂时不提供！');" title="完善个人资料">修改个人资料</a>&nbsp;
	<a href="${pageContext.request.contextPath}/security/logout">退出家园</a>
</c:if>
</div>
	<nav class="nav" id="nav" >
		<div class="banner" id="banner" >
			<img src="${pageContext.request.contextPath}/images/banner1.jpg" width="100%" height="40%" >
		</div>
	</nav>