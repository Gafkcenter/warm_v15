<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<jsp:include page="../../common/common_head.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<style>
<!--
#typeerror{
color: red;
}
-->
</style>
<script>
<!--
function check(){
	var boo=false;
	var namecn=$("#namecn").val();
	if(namecn==""||namecn==null){
		$("#typeerror").text("类型不能为空！");
	}
    	$.ajax({
    	    type:"GET",
    	    url:namecn,
    	    async: false,//同步
    	    success:function(msg){
    	    	//重复
    	        if(msg==true){
    				$("#typeerror").text("该类型已经存！");
    				boo=false;
    	        }else{
    	        	boo=true;
    	        }
    	    }
    	});
    	return boo;
};

$(function(){	
$('#submittype').click(
		function(){
			var namecn=$("#namecn").val();
			var reg = /^\w+$/;
			if(namecn==""||namecn==null||!reg.test(namecn)){
				$("#typeerror").text("输入字母数字或下划线！");
				return false;
			}
			if(check()){	
			$("#formtype").submit();
			}
		});
});
-->
</script>
<div id="syshead"><h1>Warm字典系统-增加字典类型</h1></div>
<div id="global">
<c:if test="${exchange=='type'}">
<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>
<a href="${pageContext.request.contextPath}/admin/dict/l">字典列表</a>
<a href="${pageContext.request.contextPath}/admin/dict/s">添加字典类型值</a>
<form:form  id ="formtype" action="${pageContext.request.contextPath}/admin/dicttype/s"
		method="POST" commandName="dicttype" enctype="multipart/form-data" >
		<fieldset>
		<form:errors path="*"/>
			<legend>增加字典类型</legend>
			<!-- 类型编号
			<form:input id="id" path="id" name="id" cssErrorClass="errorBox" tabindex="13" readonly="true" title="类型编号"/>
			<br />  -->类型名称：
			<form:input id="namecn" path="namecn" name="namecn" cssErrorClass="errorBox" tabindex="14" title="类型名称"/>*字母,数字,下划线
			<br/><span id="typeerror"></span><br/>
			类型描述：<form:input id="description" path="description" name="description" cssErrorClass="errorBox" tabindex="14" title="类型描述"/>
			<br/>
		</fieldset>
		<div id="buttons">
			<label for="dummy"></label> 
			<input type="button" value="保存类型" id="submittype" tabindex="15" > 
			<input type="reset" value="重置类型" id="reset" tabindex="16" >
		</div>
</form:form>
</c:if>
<hr/>
<c:if test="${exchange=='value'}">
<a href="${pageContext.request.contextPath}/admin/dict/l">字典列表</a>
<a href="${pageContext.request.contextPath}/admin/dicttype/s">添加字典类型</a>
	<form:form 
		action="${pageContext.request.contextPath}/admin/dict/s"
		method="POST" commandName="dict" enctype="multipart/form-data" >
		<fieldset>
		<form:errors path="*"/>
			<legend>增加字典值</legend>
			<!-- 字典编号
			<form:input id="id" path="id" name="id" cssErrorClass="errorBox" tabindex="1" readonly="true" title="字典编号"/>
			<br />  -->
			<br /> 字典类型
			<form:select path="type" id="type">
			<option value="" selected="selected">--请选择--</option>
			<form:options  items="${types}"   itemValue="id" itemLabel="namecn"/>
			</form:select>*
			<br/>
			<c:out value="${message}"></c:out>
			<br/>字典中文
			<form:input id="labelCn" path="labelCn" name="labelCn" cssErrorClass="errorBox" tabindex="2" title="字典名称"/>*汉字
			<br/>字典英文
			<form:input id="labelEn" path="labelEn" name="labelEn" cssErrorClass="errorBox" tabindex="15" title="字典名称"/>*英文
			<br /> 字典取值
			<form:input id="value" path="value" name="value" cssErrorClass="errorBox" tabindex="3" title="字典值"/>*字母,数字,下划线
			<br /> 字典排序
			<form:input id="sort" path="sort" name="sort" cssErrorClass="errorBox" tabindex="6" title="字典排序"/>*数字
			<br /> 字典描述
			<form:input id="description" path="description" name="description" cssErrorClass="errorBox" tabindex="5" title="字典描述"/>
			<br /> 字典作用
			<form:input id="remarks" path="remarks" name="remarks" cssErrorClass="errorBox" tabindex="7" title="字典作用"/>
			<!-- 字典状态
			<form:input id="delFlag" path="delFlag" name="delFlag" cssErrorClass="errorBox" tabindex="8" title="字典状态"/>
			 -->
			<br /> 字典位置
			<form:input id="usePosition" path="usePosition" name="usePosition" cssErrorClass="errorBox" tabindex="9" title="字典位置"/>
		</fieldset>
		<div id="buttons">
			<label for="dummy"></label> <input
				type="submit"
				value="保存字典"
				id="submit"
				tabindex="11"
			> <input
				type="reset"
				value="重置字典"
				id="reset"
				tabindex="12"
			>
		</div>
	</form:form>
	</c:if>
</div>