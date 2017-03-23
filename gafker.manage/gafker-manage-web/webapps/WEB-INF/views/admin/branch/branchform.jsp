<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<jsp:include page="../../common/common_head.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<style>
<!--
#typeerror{
color: red;
}
-->
</style>
<div id="syshead"><h1>Warm家谱信息-辈份信息-姓氏分支</h1></div>
<div id="global">
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">辈份列表</a>
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">分支列表</a>
1.<a href="${pageContext.request.contextPath}/admin/gen/s">辈份信息</a>
	<form:form 
		action="${pageContext.request.contextPath}/admin/branch/s"
		method="POST" commandName="bran" enctype="multipart/form-data" >
		<fieldset>
		<form:errors path="*"/>
			<legend>增加姓氏分支信息</legend>
			<!-- 分支编号
			<form:input id="id" path="id" name="id" cssErrorClass="errorBox" tabindex="1" readonly="true" title="分支编号"/>
			<br/>
			-->
			家族分支
			<form:input id="namecn" path="namecn" name="namecn" cssErrorClass="errorBox" tabindex="2" title="家族辈份"/>*汉字
			<br /> 家族姓氏
			<form:select path="familynameid" id="familynameid" class="familynameid">
			<option value="" selected="selected">--请选择--</option>
			<form:options  items="${names}"   itemValue="id" itemLabel="namecn"/>
			</form:select>*
			<br/>
			<c:out value="${message}"></c:out>
			<br/>上级分支
			<form:select path="parentid" id="parentid" class="parentid">
			<option value="" selected="selected">--请选择--</option>
			<option value="0">顶级父类</option>
			<form:options  items="${branchlist}"   itemValue="id" itemLabel="namecn"/>
			</form:select>*
		</fieldset>
		<div id="buttons">
			<label for="dummy"></label> <input
				type="submit"
				value="保存辈份"
				id="submit"
				tabindex="11"
			> <input
				type="reset"
				value="重置辈份"
				id="reset"
				tabindex="12"
			>
		</div>
	</form:form>
</div>