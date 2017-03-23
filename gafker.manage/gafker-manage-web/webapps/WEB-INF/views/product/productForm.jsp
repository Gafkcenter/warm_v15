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
${user.username}
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>
<form:form commandName="product" action="${pageContext.request.contextPath}/p/s" method="POST" enctype="multipart/form-data">
<fieldset>
<legend>添加家产品</legend>
<p>
<label for="id">农产品编号:</label>
<form:input path="id" id="id" readonly="true" cssErrorClass="error"/>
<form:errors path="id" cssClass="error"/>
<label for="namecn">农产品名称:</label>
<form:input path="namecn" id="namecn" cssErrorClass="error"/>
<form:errors path="namecn" cssClass="error"/><br/>
<label for="onshelvestime">上架时间:</label>
<input type="date" id="onshelvestime" name="onshelvestime" cssErrorClass="error"/>
<form:errors path="onshelvestime" cssClass="error"/><br/>
<label for="productdate">生产时间:</label>
<input type="date"  id="productdate"   name="productdate" cssErrorClass="error"/>
<form:errors path="productdate" cssClass="error"/><br/>
<label for="productstatus">农产品状态:</label>
<form:input path="productstatus" id="productstatus" cssErrorClass="error"/>
<form:errors path="productstatus" cssClass="error"/><br/>
<label for="pricesobj">农产品价值:</label>
<form:input path="pricesobj" id="pricesobj" cssErrorClass="error"/>多个价格逗号分隔
<form:errors path="pricesobj" cssClass="error"/><br/>
<label for="description">农产品描述:</label>
<form:textarea path="description" id="description" cols="35%"  rows="4" cssErrorClass="error"/>
<form:errors path="description" cssClass="error"/><br/>
<label for="description">农产品图片:</label>
<input type="file" name="images" multiple/><br/>
</p>
<p id="buttons">
<input id="submit" type="submit" tabindex="4" value="添加农产品"/>
<input id="reset" type="reset" value="复位" tabindex="4"/>
</p>
</fieldset>
</form:form>
</div>
