<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<h1>记录信息尺寸</h1>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>
<form:form commandName="sizeInfo" action="${pageContext.request.contextPath}/size/s" method="POST">
<fieldset>
<legend>记录家人服装尺码信息</legend>
<p>
<form:hidden path="createBy" id="createBy" value="${user.id}"/>
<label for="id">编号:</label>
<form:input path="id" id="id" readonly="true" cssErrorClass="error"/>
<form:errors path="id" cssClass="error"/><br/>
<label for="namecn">名称:</label>
<form:input path="namecn" id="namecn" cssErrorClass="error"/>*家人名称
<form:errors path="namecn" cssClass="error"/><br/>
<label for="bodyheight">身高:</label>
<form:input path="bodyheight" id="bodyheight" cssErrorClass="error"/>*单位：cm厘米
<form:errors path="bodyheight" cssClass="error"/><br/>
<label for="bodyweight">体重:</label>
<form:input path="bodyweight" id="bodyweight" cssErrorClass="error"/>*单位：kg千克
<form:errors path="bodyweight" cssClass="error"/><br/>
<label for="coatsizeobj">衣服尺码:</label>
<form:select path="coatsizeobj" id="coatsizeobj" cssErrorClass="error">
<form:option value="0">选择:年龄/尺码/衣长/肩宽/裤长/腰围</form:option>
<form:option value="1">选择:3个月/50cm/0/0/0/0</form:option>
<form:option value="2">选择:6个月/65cm/0/0/0/0</form:option>
<form:option value="3">选择:1岁/75cm/0/0/0/0</form:option>
<form:option value="4">选择:2岁/80cm/0/0/0/0</form:option>
<form:option value="5">选择:3岁/90cm/0/0/0/0</form:option>
<form:option value="6">选择:4岁/100cm/0/0/0/0</form:option>
<form:option value="7">选择:5岁/110cm/43/25/43/23.5</form:option>
<form:option value="8">选择:7岁/120cm/46/26/60/25</form:option>
<form:option value="9">选择:9岁/130cm/49/27/63.5/26.5</form:option>
<form:option value="10">选择:11岁/140cm/52/28/67/28</form:option>
<form:option value="11">选择:13岁/150cm/55/29/70.5/29.5</form:option>
<form:option value="12">选择:15岁/160cm/58/30/74/31</form:option>
</form:select>
<label for="shoessize">鞋子尺码:</label>
<form:input path="shoessize" id="shoessize" cssErrorClass="error"/>
<form:errors path="shoessize" cssClass="error"/><br/>
</p>
<p id="buttons">
<input id="submit" type="submit" tabindex="4" value="记录尺寸信息"/>
<input id="reset" type="reset" value="复位" tabindex="4"/>
</p>
</fieldset>
</form:form>
</div>
