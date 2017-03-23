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
    $(function(){
        $("#global").each(function(){
            var url = "area.json";
            var areaJson;
            var temp_html;
            var oProvince = $(this).find(".familynamesFk");
            var oCity = $(this).find(".branch");
            //初始化省
            var province = function(){
                $.each(areaJson,function(i,province){
                    temp_html+="<option value='"+province.p+"'>"+province.p+"</option>";
                });
                oProvince.html(temp_html);
                city();
            };
            //赋值市
            var city = function(){
                temp_html = ""; 
                var n = oProvince.get(0).selectedIndex;
                $.each(areaJson[n].c,function(i,city){
                    temp_html+="<option value='"+city.ct+"'>"+city.ct+"</option>";
                });
                oCity.html(temp_html);
                district();
            };
            //选择省改变市
            oProvince.change(function(){
                city();
            });
            //获取json数据
            $.getJSON(url,function(data){
                areaJson = data;
                province();
            });
        });
    });
    </script>
<div id="syshead"><h1>Warm家谱信息-辈份信息</h1></div>
<div id="global">
<a href="javascript:alert('开发中...')" title="${pageContext.request.contextPath}/admin/gen/l">辈份列表</a>
1.<a href="${pageContext.request.contextPath}/admin/branch/s">姓氏分支信息</a>
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
			<c:out value="${message}"></c:out>
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