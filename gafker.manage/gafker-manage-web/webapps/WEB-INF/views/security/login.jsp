<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<!doctype html>
<html>
<script type="text/javascript">
function change(){
	var t=new Date().getTime();
	document.getElementById("checkimagecode").src='${pageContext.request.contextPath}/security/regcode?t='+t;
}
</script>  
<head>
<style type="text/css">
.error {
color:red;
}
h1{
text-align: center;
}
input{
text-align: center;
}
</style>
<link rel="stylesheet" href="css/speed-loan.min.css" >
</head>
<body> 
<div id="global">
    <h1>绿福客家谱</h1>  
    <c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!-- 使用spring国际化 -
<spring:message code="gafker.test.name"></spring:message>
<spring:message code="welcome"></spring:message>
-->
	${message}<br/>
<form:form commandName="userattribute" id="userattribute" name="userattribute" action="${pageContext.request.contextPath}/security/dologin" method="post">
	<form:errors path="*" cssClass="error"/><br/>
     <label for="username" >昵称名字</label> 
     <form:input  name="username" path="username" maxLength="40"  cssErrorClass="error"/>
     <br/>
     <label for="password">用户密码</label>
     <form:password name="password" path="password"  maxLength="15"   cssErrorClass="error"/>
     <br/>
     <label for="regcode">验证码</label>
     <form:input path="regcode"  maxLength="4"/><br/>
     <a href="javaScript:change();">
     <img src="${pageContext.request.contextPath}/security/regcode" alt="验证码" id="checkimagecode"/>
     </a><br/>
     <input type="submit"  id="submit"  name="submit" value="进入家园"/>&nbsp;
     <a href="${pageContext.request.contextPath}/user/register" style="color:blue;font-size:1em;">注册家园</a>
</form:form>
</div>
    <jsp:include page="../bottom.jsp"></jsp:include>
</body>  
</html>  