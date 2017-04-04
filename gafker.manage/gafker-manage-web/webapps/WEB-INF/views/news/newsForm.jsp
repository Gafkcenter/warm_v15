<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<h1>收藏</h1>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>
<form:form commandName="familyNews" action="${pageContext.request.contextPath}/news/s" method="POST">
<fieldset>
<legend>收藏技术资料</legend>
<p>
<form:hidden path="createBy" id="createBy" value="${user.id}"/>
<label for="id">收藏编号:</label>
<form:input path="id" id="id" readonly="true" cssErrorClass="error"/>
<form:errors path="id" cssClass="error"/><br/>
<label for="namecn">名称:</label>
<form:input path="namecn" id="namecn" cssErrorClass="error"/>
<form:errors path="namecn" cssClass="error"/><br/>
<label for="catelogType">所属类别:</label>
<form:input path="catelogType" id="catelogType" cssErrorClass="error"/>
<form:errors path="catelogType" cssClass="error"/><br/>
<label for="urlAddress">收藏网址:</label>
<form:input path="urlAddress" id="urlAddress" cssErrorClass="error"/>
<form:errors path="urlAddress" cssClass="error"/><br/>
<label for="content">内容描述:</label>
<form:textarea path="content" id="content" cols="35%"  rows="4" cssErrorClass="error"/>
<form:errors path="content" cssClass="error"/><br/>
</p>
<p id="buttons">
<input id="submit" type="submit" tabindex="4" value="添加收藏"/>
<input id="reset" type="reset" value="复位" tabindex="4"/>
</p>
</fieldset>
</form:form>
</div>
