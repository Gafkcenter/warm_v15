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
					<table class="loan-li" cellpadding="0" cellspacing="0" style="width: 100%">
						<jsp:include page="subjsp/warmform.jsp"></jsp:include>
						<tr> <td colspan="2">
								<table style="width: 100%">
									<tr> <td>分享码</td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登录码</td>
									</tr>
									<tr>
										<td><img src="${item.qrcode}" class="err-product"/></td>
										<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="${user.userqrcode}" width="120px"/></td>
									</tr>
									<tr>
										<td><hr /></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</c:if>
				<table  class="loan-li"  cellpadding="0" cellspacing="0"  style="width: 100%">
					<tr>
						<td>
						<img src='${item.imagespath}' width="99px" height="99px"  class="err-product"/>
						</td>
						<td><p>
								【${item.students}】送给【${item.teachers}】的祝福：
								<a href="${pageContext.request.contextPath}/t/update/${item.id}" >${item.goodpoints}
								<img src="${pageContext.request.contextPath}/images/good.png" width="5%" height="" >
								</a>
							</p> 
							<p class="loan-t">
								<a href="#"><em>${fn:substring(item.content, 0, 200)}</em></a>
							</p>
							<p class="clear">
								祝福日期：
								<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss" />
							</p>
							<p class="count">
								<span></span>
							</p></td>
					</tr>
					<tr>
						<td><hr /></td>
					</tr>
				</table>
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
