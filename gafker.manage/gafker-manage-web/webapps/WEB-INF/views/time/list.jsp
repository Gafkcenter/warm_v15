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
<a href="${pageContext.request.contextPath}/time/list">时间列表</a>
<h4>时间列表</h4>
<table class="bordered">
	<tr>
	<th>收藏内容名称</th><th width="30%">内容介绍</th><th>收藏人</th><th>有用</th></tr>
	<c:if test="${not empty timeList}">
		<c:forEach items="${timeList}" var="news">
			<tr>
				<td>${news.id}</td>
				<td>${news.startTime}</td>
				<td>${news.startTimeString}</td>
				<td>${news.day_start_string}</td>
				<td>${news.start_day_key}</td>
				<td>${news.end_time}</td>
				<td>${news.end_time_string}</td>
				<td>${news.start_day_end}</td>
				<td>${news.start_day_end_string}</td>
				<td>${news.end_day_key}</td>
				<td>${news.time_zone_etc}</td>
				<td>${news.time_zone_gmt}</td>
				<td>${news.duration_start_day}</td>
				<td>${news.duration_end_day}</td>
				<td>${news.duration_total}</td>
				<td>${news.language}</td>
				<td>${news.ip}</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
</div>
