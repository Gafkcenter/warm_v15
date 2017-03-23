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
<a href="${pageContext.request.contextPath}/news/s">添加我家的收藏</a>
<h4>我的技术收藏</h4>
<table class="bordered">
	<tr>
	<th>收藏内容名称</th><th width="30%">内容介绍</th><th>收藏人</th><th>有用</th></tr>
	<c:if test="${not empty familyNewsList}">
		<c:forEach items="${familyNewsList}" var="news">
			<tr>
				<!-- <td>${news.id}</td> -->
				<td><a href="${news.urlAddress}" alt="${urlAddress}">${news.namecn}</a></td>
				<td>${news.content}</td>
				<td>${news.userName}<!-- ${news.createBy} --></td>
				<td><a href="${pageContext.request.contextPath}/news/u/${news.id}:${user.id}" title="认为实用请点击" alt="认为实用点击">${news.star}</a></td>
			</tr>
		</c:forEach>
	</c:if>
	<c:if test="${empty familyNewsList}">
	<tr>
	<td colspan="4" style="text-align: center;">
	<br/>
	<h3>您还没有收藏记录,请确保你已经登录家园<h3>
	</td>
	</tr>
	</c:if>
</table>
</div>
