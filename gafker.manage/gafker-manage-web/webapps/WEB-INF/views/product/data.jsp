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
<a href="${pageContext.request.contextPath}/p/s">添加我家的农产品</a>
<h1>我家的农产品</h1>
	<table  id="customers" style="text-align: center;">
	<tr>
	<th>编号</th>
	<!-- <th>规则编号</th> -->
	<th>产品名称</th>
	<!-- <th>价格级别</th>
	<th>状态</th>
	<th nowrap>上架时间</th><th nowrap>生产时间</th>-->
	<th nowrap>产品推广码</th>
	<th nowrap>溯源记录</th>
	<th>农产品图片</th>
	<!-- <th>农产品介绍</th> -->
	</tr>
	<c:if test="${not empty productList}">
	<c:forEach items="${productList}" var="product" varStatus="counts">
	<c:if test="${counts.count/2==1}">
	<tr class="alt">
	</c:if>
	<c:if test="${counts.count/2==0}">
	<tr>
	</c:if>
	<td><a href="${pageContext.request.contextPath}/p/${user.id}/${product.id}" title="查农产品详情">${product.id}</a></td>
	<!-- <td>${product.ustringid}</td>-->
	<td>${product.namecn}</td>
	<!-- <td>${product.pricesobj}</td> 
	<td>${product.productstatus}</td>-->
	<!-- <td><fmt:formatDate value="${product.onshelvestime}" type="date"/></td>
	<td><fmt:formatDate value="${product.productdate}" type="date"/></td> -->
	<td><img src="${product.qrcode}" width="100px" alt="农产品信息查询"/></td>
	<td><img src="${product.qrtracea}" alt="农产品生产过程查询" id="qrcode"/></td>
	<td>
	<img src="${product.defaultimages}" alt="农产品图片" class="imgwidth"/><br/>
	<a href="#" title="${product.imageslistobj}">更多图片</a>
	</td>
	<!-- <td><textarea rows="8" cols="30%" readonly="readonly" id="global" style="float: auto;background-color: #00ffee;">${product.description}</textarea></td> -->
	</tr>
</c:forEach>
</c:if>
<c:if test="${empty productList}">
<tr><td colspan="5">没有产品信息</td></tr>
</c:if>
	</table>
</div>
