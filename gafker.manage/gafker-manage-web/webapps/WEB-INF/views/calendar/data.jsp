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
<div>
<a href="${pageContext.request.contextPath}/admin/home">管理首页</a>&nbsp;
<a href="${pageContext.request.contextPath}/ca/page/calendar:calendarForm">添加计划任务</a>
<h1>我家的计划列表</h1>
	<table  id="customers" style="text-align: center;">
	<tr>
	<th>编号</th>
	<th>名称</th>
	<th>分类</th>
	<th>标题</th>
	<th>内容</th>
	<th nowrap>时间类型</th>
	<th nowrap>使用时间</th>
	<th nowrap>状态</th>
	<th>销耗资金</th>
	<th>支持操作</th>
	</tr>
	<c:if test="${not empty data}">
	<c:forEach items="${data}" var="product" varStatus="counts">
	<c:if test="${counts.count/2==1}">
	<tr class="alt">
	</c:if>
	<c:if test="${counts.count/2==0}">
	<tr>
	</c:if>
	<td><a href="${pageContext.request.contextPath}/ca/q/${product.id}" title="计划详情">${product.id}</a></td>
	<td>${product.namecn}</td>
	<td>${product.catelog}</td>
	<td>${product.title}</td>
	<td>${product.content}</td>
	<td>${product.timetype}</td>
	<td>${product.tastusetime}</td>
	<td>${product.calendarstatus}</td>
	<td>${product.moneyuse}</td>
	<td>
	<a href="${pageContext.request.contextPath}/ca/">修改</a>&nbsp;
	<a href="${pageContext.request.contextPath}/ca/d/${product.id}">删除</a></td>
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty data}">
<tr><td colspan="8">没有制定信息,有计划有动力,生活在一个清晰的世界里</td></tr>
</c:if>
	</table>
</div>
