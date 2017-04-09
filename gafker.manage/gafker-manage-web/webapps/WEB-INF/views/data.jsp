<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="top.jsp"></jsp:include>
<section class="cont" id="speed_s" >
	<c:if test="${wishes!= null || fn:length(wishes) > 0}">
		<nav class="nav" id="nav" >
			<c:forEach var="item" items="${wishes}" varStatus="status" >
				<c:if test="${status.count==1}">
						<jsp:include page="subjsp/warmform.jsp"></jsp:include>
						<div><span>分享码</span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登录码</span></div>
						<div><span><img src="${item.qrcode}" class="err-product"/></span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="${user.userqrcode}" width="120px"/></span></div>
				<hr/>		
				</c:if>
				<div class ="full" style="white-space: nowrap;width: 90%;">
				<em>【${item.students}】祝福【${item.teachers}】:<a href="${pageContext.request.contextPath}/t/update/${item.id}" >${item.goodpoints}
								<img src="${pageContext.request.contextPath}/images/good.png" width="5%"></a></em>
				</div>
				<div>
				<span><img src='${item.imagespath}' width="99px" height="99px"  class="err-product"/></span>
				<span><p class="clear" style="color: green;">${fn:substring(item.content, 0, 200)}</p></span>
				</div>
				<div><p class="clear" style="color: grey;"><em>日期：<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss" /></em></p></div>
				<hr/>
			</c:forEach>
		</nav>
	</c:if>
	<c:if test="${wishes== null || fn:length(wishes) == 0}">
		<jsp:include page="subjsp/warmform.jsp"></jsp:include>
--暂无祝福--</br>
	</c:if>
</section>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>
