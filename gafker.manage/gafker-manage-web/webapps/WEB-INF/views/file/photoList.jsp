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
<body>
<div id="global">
<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>&nbsp;
<a href="${pageContext.request.contextPath}/p/s">添加农产品</a>
<a href="${pageContext.request.contextPath}/f/s">上传家人照片</a>
<div id="global">
<h1>我的家庭相集</h1>
<c:if test="${not empty photoList}">
<c:forEach items="${photoList}" var="ph" varStatus="v">
<c:if test="${v.count%3==1}"><br/><br/></c:if>
<span style="width:200px;height: 400px;border: 1px solid #00ff33;"><img src="${ph.filename}" alt="${ph.rawname}" title="${ph.star}" class="familyphoto"></span>
</c:forEach>
</tr>
</table>
</c:if>
</div>
<jsp:include page="../bottom.jsp"></jsp:include>
</body>
