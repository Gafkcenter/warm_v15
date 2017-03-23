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
<a href="${pageContext.request.contextPath}/p/s">添加我家的农产品</a>
<h1>农产品详情</h1>
<c:if test="${not empty product}">
<div>
	农产品编号：<a href="${pageContext.request.contextPath}/tr/${product.id}/trace" title="查该产品加溯源信息">${product.id}</a><br/>
	规则编号：${product.ustringid}<br/>
	产品名称：${product.namecn}<br/>
	价格级别：${product.pricesobj}<br/>
	产品状态：${product.productstatus}<br/>
	上架时间：<fmt:formatDate value="${product.onshelvestime}" type="date"/>  <br/>
	生产时间：<fmt:formatDate value="${product.productdate}" type="date"/><br/>
	<img src="${product.defaultimages}" alt="农产品图片" class="imgwidth"/><a href="#" title="${product.imageslistobj}">更多图片</a><br/><br/>
	<span style="text-align: left;"><img src="${product.qrcode}" alt="农产品信息查询" id="qrcode"/>&nbsp;<img src="${product.qrtracea}" alt="农产品生产查询" id="qrcode"/><br/></span>
	<span style="text-align: left;">产品生产查询&nbsp;产品信息查询</span><br/><br/>
	农产品介绍:<br/>
	<textarea rows="4" cols="30%" readonly="readonly" id="global" style="float: auto;background-color: #00ffee;">${product.description}</textarea>
</div>
</c:if>
</div>
