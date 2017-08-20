<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<style>
<!--
label{  
    display: inline-block;  
    padding: 0 10px;  
    vertical-align: middle;  
}  
input{  
    outline: none;  
    border: 1px solid rgb(216, 216, 216);  
    padding: 2px 10px 2px 10px;  
}  
input[type="text"]{  
    height: 14px;  
    line-height: 14px;  
    border-radius: 5px;  
    padding:10px 10px;  
    vertical-align: middle;  
    color:#666;  
}  
input[type="button"]{  
    padding: 0px 10px;  
    height:40px;  
}
.login-box p{  
    vertical-align:middle;  
    padding:0px 0px;  
}  
-->
</style>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<div id="global">
${user.username}
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>
<a href="${pageContext.request.contextPath}/ca/l">计划列表</a>
<form:form commandName="data" action="${pageContext.request.contextPath}/ca/s" method="POST" enctype="multipart/form-data">
<fieldset>
<legend>添加计划任务</legend>
<div class="login-box">
<p>
<input type="hidden" name="createby" value="${user.id}"/>
<label for="id">编号:</label>
<form:input path="id" id="id" readonly="true" cssErrorClass="error"/>
<form:errors path="id" cssClass="error"/>
</p>
<p>
<label for="namecn">计划名称:</label>
<form:input path="namecn" id="namecn" cssErrorClass="error"/>
<form:errors path="namecn" cssClass="error"/>
</p>
<p>
<label for="catelog">分类:</label>
<form:input path="catelog" id="catelog" cssErrorClass="error"/>
<form:errors path="catelog" cssClass="error"/>
</p>
<p>
<label for="content">计划内容:</label>
<form:input path="content" id="content" cssErrorClass="error"/>
<form:errors path="content" cssClass="error"/>
</p>
<p>
<label for="difficultylevel">困难度:</label>
<form:input path="difficultylevel" id="difficultylevel" cssErrorClass="error"/>
<form:errors path="difficultylevel" cssClass="error"/>
</p>
<p>
<label for="importantlevel">重要程度:</label>
<form:input path="importantlevel" id="importantlevel" cssErrorClass="error"/>
<form:errors path="importantlevel" cssClass="error"/>
</p>
<p>
<label for="warningtime">预警时间:</label>
<input type="date" id="warningtime" name="warningtime" cssErrorClass="error"/>
<form:errors path="warningtime" cssClass="error"/>
</p>
<p>
<label for="warningcycle">预警周期:</label>
<form:input id="warningcycle" path="warningcycle" cssErrorClass="error"/>
<form:errors path="warningcycle" cssClass="error"/>
</p>
<p>
<label for="timetype">时间单位:</label>
<form:input path="timetype" id="timetype" cssErrorClass="error"/>
<form:errors path="timetype" cssClass="error"/>
</p>
<p>
<label for="tastusetime">任务周期:</label>
<form:input path="tastusetime" id="tastusetime" cssErrorClass="error"/>
<form:errors path="tastusetime" cssClass="error"/>
</p>
<p>
<label for="starttime">开始时间:</label>
<input type="date" id="starttime" name="starttime" value="<fmt:formatDate type='date'/>" cssErrorClass="error"/>
<form:errors path="starttime" cssClass="error"/>
</p>
<p>
<label for="calendartype">任务类型:</label>
<form:input path="calendartype" id="calendartype" cssErrorClass="error"/>
<form:errors path="calendartype" cssClass="error"/>
</p>
<p>
<label for="calendarstatus">任务状态:</label>
<form:input path="calendarstatus" id="calendarstatus" cssErrorClass="error"/>
<form:errors path="calendarstatus" cssClass="error"/>
</p>
<p>
<label for="parentid">任务上级:</label>
<form:input path="parentid" id="parentid" cssErrorClass="error"/>
<form:errors path="parentid" cssClass="error"/>
</p>
<p>
<label for="calendarlevel">任务类别:</label>
<form:input path="calendarlevel" id="calendarlevel" cssErrorClass="error"/>
<form:errors path="calendarlevel" cssClass="error"/>
</p>
<p>
<label for="moneyuse">经济支付:</label>
<form:input path="moneyuse" id="moneyuse" cssErrorClass="error"/>
<form:errors path="moneyuse" cssClass="error"/>
</p>
</div>
<p id="buttons">
<input id="submit" type="submit" tabindex="4" value="添加计划"/>
<input id="reset" type="reset" value="复位" tabindex="4"/>
</p>
</fieldset>
</form:form>
</div>
