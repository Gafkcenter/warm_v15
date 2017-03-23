<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hello</title>
    <c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
</head>
<body>

当前页面为${currentPage}

<p></p>

欢迎${user.username}登录

你有权限访问该页面

<a href="<c:url value='/security/logout'/>"><button>退出登录</button></a>

 <br/>
<shiro:hasRole name="admin">
    <a href="user/show">查看用户</a><br>
    <a href="user/create">创建用户</a>
</shiro:hasRole>

<shiro:hasRole name="user">
<a href="user/show">查看用户</a>
</shiro:hasRole>

</body>
</html>