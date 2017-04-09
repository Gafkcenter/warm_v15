<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<jsp:include page="../../common/common_head.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js" type="text/javascript"></script>
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
				$("#familynameid").change(function(event){
			        $.ajax({
			            url:"/admin/branch/listbyname",
			            data:{familynameid:$("#familynameid").val()},
			            type:"POST",
			            dataType:"json",
			            contentType: "application/x-www-form-urlencoded; charset=utf-8", 
			            timeout:50000,
			            success:function(json){
			            	//success执行异常
			            	//alert("ffff"+json);
			                var select_option;
			                $.each(json.selected_option_value,function(i, item){
			                    select_option = item;
			                });
			                var options_str = "";
			                $("#parentid").html("");
			                $.each(json,function(i, item){
			                        options_str += "<option value=\"" + item.id + "\" >" + item.namecn + "</option>";
			        });
			                $("#parentid").append(options_str);
			            },
			            error:function(xhr, status){
			                //alert("error");
			            }
			    })});
			});
		</script>
<style>
<!--
#typeerror{
color: red;
}
-->
</style>
<div id="syshead"><h1>Warm家谱信息-辈份信息-姓氏分支</h1></div>
<div id="global">
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">辈份列表</a>
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">分支列表</a>
1.<a href="${pageContext.request.contextPath}/admin/gen/s">辈份信息</a>
			<c:out value="${message}"></c:out>
	<form:form 
		action="${pageContext.request.contextPath}/admin/branch/s"
		method="POST" commandName="bran" enctype="multipart/form-data" >
		<fieldset>
		<form:errors path="*"/>
			<legend>增加姓氏分支信息</legend>
			<!-- 分支编号
			<form:input id="id" path="id" name="id" cssErrorClass="errorBox" tabindex="1" readonly="true" title="分支编号"/>
			<br/>
			-->
			家族姓氏
			<form:select path="familynameid" id="familynameid" class="familynameid">
			<option value="" selected="selected">--请选择--</option>
			<form:options  items="${names}"   itemValue="id" itemLabel="namecn"/>
			</form:select>*
			<br/>上级分支
			<form:select path="parentid" id="parentid" class="parentid">
			<option value="" selected="selected">--请选择--</option>
			<option value="0">顶级分支</option>
			<!--<form:options  items="${branchlist}"   itemValue="id" itemLabel="namecn"/>-->
			</form:select>*<br/>
			分支名
			<form:input id="namecn" path="namecn" name="namecn" cssErrorClass="errorBox" tabindex="2" title="家族辈份"/>*汉字
		</fieldset>
		<div id="buttons">
			<label for="dummy"></label> <input
				type="submit"
				value="保存辈份"
				id="submit"
				tabindex="11"
			> <input
				type="reset"
				value="重置辈份"
				id="reset"
				tabindex="12"
			>
		</div>
	</form:form>
</div>