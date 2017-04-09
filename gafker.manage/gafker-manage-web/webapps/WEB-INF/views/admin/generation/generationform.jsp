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
				$("#familynamesFk").change(function(event){
			        $.ajax({
			            url:"/admin/branch/listbyname",
			            data:{familynameid:$("#familynamesFk").val()},
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
			                $("#branch").html("");
			                $.each(json,function(i, item){
			                        options_str += "<option value=\"" + item.id + "\" >" + item.namecn + "</option>";
			        });
			                $("#branch").append(options_str);
			            },
			            error:function(xhr, status){
			               // alert("error");
			            }
			    })});
			});
		</script>
<div id="syshead"><h1>Warm家谱信息-辈份信息</h1></div>
<div id="global">
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">辈份列表</a>
1.<a href="${pageContext.request.contextPath}/admin/branch/s">姓氏分支信息</a><br/>
			<c:out value="${message}"></c:out>
	<form:form 
		action="${pageContext.request.contextPath}/admin/gen/s"
		method="POST" commandName="cur_generation" enctype="multipart/form-data" >
		<fieldset>
		<form:errors path="*"/>
			<legend>增加辈份信息</legend>
			<!-- 辈份编号
			<form:input id="id" path="id" name="id" cssErrorClass="errorBox" tabindex="1" readonly="true" title="辈份编号"/>
			-->
			<br /> 家族姓氏
			<form:select path="familynamesFk" id="familynamesFk" class="familynamesFk">
			<option value="" selected="selected">--请选择--</option>
			<form:options  items="${names}"   itemValue="id" itemLabel="namecn"/>
			</form:select>*
			<br/>
			<br/>家族辈份
			<form:input id="namecn" path="namecn" name="namecn" cssErrorClass="errorBox" tabindex="2" title="家族辈份"/>*汉字
			<br/>当前代数
			<form:input id="generation" path="generation" name="generation" cssErrorClass="errorBox" tabindex="15" title="当前代数"/>*数字
			<br /> 所属分支
			<form:select path="branch" id="branch" class="branch">
			<option value="" selected="selected">--请选择--</option>
			</form:select>
			<!--
			<form:input id="branch" path="branch" name="branch" cssErrorClass="errorBox" tabindex="3" title="祖先分支"/>
			-->
			<br /> 谱改标记
			<form:input id="regenerationtime" path="regenerationtime" name="regenerationtime" cssErrorClass="errorBox" tabindex="6" title="谱改标记"/>*数字,第几次谱改
			<br /> 分布区域
			<form:input id="personarea" path="personarea" name="personarea" cssErrorClass="errorBox" tabindex="5" title="分布区域"/>可选 ,逗号分隔地名
			<br /> 家族代表
			<form:input id="leaderid" path="leaderid" name="leaderid" cssErrorClass="errorBox" tabindex="7" title="家族代表"/>领头人
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