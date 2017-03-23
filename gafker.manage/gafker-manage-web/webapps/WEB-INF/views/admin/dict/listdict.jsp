<!doctype html>
<%@ page
	language="java"
	contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
%>
<%@ page import="java.net.*"%>
<%@taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"
%>
<%@ taglib
	uri="http://java.sun.com/jsp/jstl/functions"
	prefix="fn"
%>
<%@ taglib
	prefix="fmt"
	uri="http://java.sun.com/jsp/jstl/fmt"
%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/text.js"> 
${pageContext.request.contextPath}/admin/label/s
--%>
 <link rel="stylesheet" type="text/css" href="<c:url value="../../css/main.css"/>" > 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>

<script>
    function hide(id,delFlag){    
        confirm_ = confirm('确认要更改标签状态吗?');
        if(confirm_){
            $.ajax({
                type:"GET",
                url:'d/'+id+'/'+delFlag,
                success:function(msg){
                    //alert("test order");
                    //all delete is success,this can be execute
                    //alert(msg);
                    $("#tr_"+id).remove();
                }
            });
        }
    };
</script>
<div id="syshead"><h1>Warm字典系统-字典类型设置</h1></div>
<div>
<form action="${pageContext.request.contextPath}/admin/dict/q" method="POST" name="sysDictQuery">

	<label for="type">标签类型</label> 
	<input type="text" id="type" name="type" value="" placeholder="输入字典'标签类型'"/>
 	<label for="dummy"></label> 
 	<input type="submit" value="查询" id="submit">
</form>
<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>
<a href="${pageContext.request.contextPath}/admin/dicttype/s">1.设置字典类型</a>
<a href="${pageContext.request.contextPath}/admin/dict/s">2.添加指定类型值</a>
	<table id="customers">
		<thead>
			<tr>
				<th nowrap="nowrap">标签编号</th>
				<th nowrap="nowrap">标签名称</th>
				<th nowrap="nowrap">标签值</th>
				<th nowrap="nowrap">标签类型</th>
				<!--<th nowrap="nowrap">标签描述</th>
				<th nowrap="nowrap">标签排序</th>
				<th nowrap="nowrap">标签作用</th>-->
				<!-- <th nowrap="nowrap">标签状态</th>-->
				<!--<th nowrap="nowrap">标签使用</th>-->
				<th nowrap="nowrap">功能操作</th>
			</tr>
		</thead>
		<c:if test="${dictlist!= null || fn:length(dictlist) > 0}">
			<c:forEach var="item" items="${dictlist}" varStatus="status" >
				<tr  id="tr_${item.id}">
					<td>${item.id}</td>
					<td>${item.labelCn}</td>
					<td>${item.value}</td>
					<td>${item.type}</td>
					<!--<td>${item.description}</td>
					<td>${item.sort}</td>
					 <td>${item.remarks}</td> -->
					<!--<td>${item.delFlag}</td>-->
					<!-- <td>${item.usePosition}</td> ${pageContext.request.contextPath}/admin/dict/d/${item.id}/${item.delFlag}-->
					<td nowrap="nowrap">
					<a href="${pageContext.request.contextPath}/admin/dict/u/${item.id}" title="变更类型信息" >修改</a>&nbsp;
					<a href="#" title="标记类型为删除" onclick="hide(${item.id},${item.delFlag})">隐藏</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</div>