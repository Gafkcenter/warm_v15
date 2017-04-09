<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.net.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/text.js"> --%>
<script type="text/javascript">
			/*
			* 文件备注，压缩时不保存
			*/
			/*!
			* 压缩时保存备注
			*/
			//临时备注
			//定义XMLHttpRequest 对象
			//其它浏览器
			$(function(){
				$("input#students").blur(function(){
					var teacher=$("#teachers").val();
					var student=$("#students").val();
					$.get("/user/regwarmuser",{
						teachers:teacher,
						students:student,
						contentType: "application/x-www-form-urlencoded; charset=utf-8", 
						},function(data){
					//alert("欢迎您："+data);
				 });
				});
			});
		</script>
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
					图片祝福:<jsp:include page="../file/images/canvas.jsp"></jsp:include><br/>
					祝福词:
					</span>
					<form:textarea path="content" id="textarea" cssErrorClass="error"/>
					<form:errors path="content" cssClass="error"/>
					<br/>
					<c:if test="${not empty user}">
						<form:input path="students" value="${user.username}"  id="students" readonly="true" cssErrorClass="error"/>
						<form:errors path="students" cssClass="error"/>
					</c:if>
					<c:if test="${empty user}">
						<form:input path="students"   id="students" cssErrorClass="error"/>
						<form:errors path="students" cssClass="error"/>
					</c:if>
					承上的祝福.
					
					<input type ="submit" name="submit" value="送出祝福" id="submit" />
				</form:form>
</div>