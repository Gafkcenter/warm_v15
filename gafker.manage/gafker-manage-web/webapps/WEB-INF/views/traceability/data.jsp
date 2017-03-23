<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}${user.username}"></c:out>
<!DOCTYPE html>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>&nbsp;
<a href="${pageContext.request.contextPath}/p/s">添加农产品</a>

<h1>农产品溯源</h1>
<c:if test="${not empty traceList}">
<c:forEach items="${traceList}" var="trace">
<a href="${pageContext.request.contextPath}/tr/${trace.familyproductFk}/s">提供溯源信息</a>  <br/>
<span class="right">谢谢${trace.createby}提供的溯源信息</span>  <br/>
溯源名称：${trace.namecn}  <br/>
溯源标题：${trace.title}  <br/>
产品名称 ：${trace.productName}-<a href="${pageContext.request.contextPath}/tr/${trace.familyproductFk}/trace" title="查询这个农产品的溯源信息">${trace.familyproductFk}</a>  <br/>
溯源时间：<fmt:formatDate value="${trace.createtime}" type="date"/>  <br/>
溯源内容：<textarea cols="50%" rows="3">${trace.contentobj}</textarea>  <br/>
溯源级别：${trace.showlevel}  <br/>
<hr/>
</c:forEach>
</c:if>
<a href="${pageContext.request.contextPath}/tr/${productId}/s">提供溯源信息</a>
</div>
