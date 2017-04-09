<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>
<br/>
${user.username}<br/>
<form:form commandName="trace" action="${pageContext.request.contextPath}/tr/s" method="POST" enctype="multipart/form-data">
<fieldset>
<legend>农产品溯源</legend>
${message}
<p>
<label for="id">溯源编号:</label>
<form:input path="id" id="id" readonly="true" cssErrorClass="error"/>
<form:errors path="id" cssClass="error"/><br/>
<form:hidden path="familyproductFk" id="familyproductFk" value="${trace.familyproductFk}"/>
<label for="productName">农产品名称:</label>
<form:input path="productName" id="productName" value="${trace.productName}" readonly="true"/><br/>
<label for="namecn">溯源名称:</label>
<form:input path="namecn" id="namecn" cssErrorClass="error"/>
<form:errors path="namecn" cssClass="error"/><br/>
<label for="title">溯源标题:</label>
<form:input path="title" id="title" cssErrorClass="error"/>
<form:errors path="title" cssClass="error"/><br/>
<label for="contentobj">溯源内容:</label>
<form:textarea path="contentobj" id="contentobj" cols="35%"  rows="4" cssErrorClass="error"/>
<form:errors path="contentobj" cssClass="error"/><br/>
<label for="description">溯源图片:</label>
<input type="file" name="images" multiple/><br/>
</p>
<p id="buttons">
<input id="submit" type="submit" tabindex="4" value="溯源提交"/>
<input id="reset" type="reset" value="复位" tabindex="4"/>
</p>
</fieldset>
</form:form>
</div>
