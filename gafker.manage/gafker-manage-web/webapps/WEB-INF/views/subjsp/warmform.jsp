<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.net.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/text.js"> --%>
<style>
<!--
.error{
color: red;
}
-->
</style>

<div id="global" style="margin: 0px; width: 93.5%">
				<form:form action="${pageContext.request.contextPath}/t/save" method="POST" commandName="sendwishes">
					送给<form:input path="teachers" name="teachers"  id="teachers"/>的祝福.<br/> 
					<form:hidden path="warmfile" name="warmfile" id="warmfile" value="" /><br/> 
					<span>
					祝福语:
					</span>
					<form:textarea path="content" id="textarea" cssErrorClass="error"/>
					<form:errors path="content" cssClass="error"/>
					<br/>
					<c:if test="${not empty user}">
						<form:input path="students" value="${user.username}"  id="students" readonly="true" cssErrorClass="error"/>
						<form:errors path="students" cssClass="error"/>
					</c:if>
					<c:if test="${empty user}">
						<form:input path="students"   id="students"  value="来访者" cssErrorClass="error"/>
						<form:errors path="students" cssClass="error"/>
					</c:if>
					承上的祝福.<br/>
					心情图片:<jsp:include page="../file/images/canvas.jsp"></jsp:include><br/><br/>
					<input type ="submit" name="submit" value="送出祝福" id="submit" />
				</form:form>
</div>