<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt " %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/speed-loan.min.css" > -->
<style type="text/css">
#error {
color:red;
}
h1{
text-align: center;
}
</style>
</head>
<body> 
    <h1>绿福客家谱</h1>  
<div id="global">
    <form:form commandName="userattribute" id="userattribute" name="userattribute" action="${pageContext.request.contextPath}/user/register" method="post">
    ${message}<br/>
    <form:errors path="*" cssClass="error"/><br/>
        <label for="familynamesFk">姓氏</label> 
        <form:select name="familynamesFk" path="familynamesFk" id="familynamesFk">
        <option value="0">--选姓氏--</option>
        <form:options items="${names}" itemLabel="namecn" itemValue="id"/>
        </form:select> <br/>
        <label>昵称名字</label> 
        <form:input  name="username" path="username" maxLength="40" cssErrorClass="error" /><br/>
        <label>用户密码</label>
        <form:password name="password" path="password"  maxLength="15"  cssErrorClass="error"/><br/>
        <label>验证码</label>
        <form:input  name="regcode" path="regcode"  maxLength="4"/><br/>
        <div style="margin-left: 300px;">
         <a href="javaScript:change();">
     <img src="${pageContext.request.contextPath}/security/regcode" alt="验证码" id="checkimagecode"/>
     </a><br/>
        <input type="submit"  id="submit"  name="submit" value="注册家园" />
        </div>
    </form:form>
    </div> 
        <jsp:include page="../bottom.jsp"></jsp:include>
</body>  
</html>  