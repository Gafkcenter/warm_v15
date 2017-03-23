<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>&nbsp;
<a href="${pageContext.request.contextPath}/p/s">添加农产品</a>
<a href="${pageContext.request.contextPath}/tr/s">记录溯源信息</a>
<h1>溯源详情</h1>
<c:if test="${not empty trace}">
<span class="right">谢谢${trace.createby}提供的溯源信息</span>  <br/>
溯源名称：${namecn}  <br/>
溯源标题：${title}  <br/>
产品名称 ：${familyproductFk}  <br/>
溯源时间：<fmt:formatDate value="${createtime}" type="date"/>  <br/>
溯源内容：<textarea cols="50%" rows="3">${contentobj}</textarea>  <br/>
溯源级别：${showlevel}  <br/>
</c:if>
</div>
