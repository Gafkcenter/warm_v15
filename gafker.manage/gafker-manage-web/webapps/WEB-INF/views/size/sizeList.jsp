<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="BASE" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>客户管理</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, 
maximum-scale=1.0, user-scalable=no" >
<script src="${BASE}/js/jquery-1.8.3.min.js"></script>
<script src="${BASE}/js/jquery.form.min.js"></script>
<script type="text/javascript">
function doDel(id){
	var result = confirm('确认删除！'+id);  
    if(result){ 
    	$.ajax({ 
    		type : "post", 
    		url : "${BASE}/d/" + id, 
    		success : function(data) { 
    		if(data == "success") {
    			$("#tr"+id).remove();
        		alert('删除成功！');  
    		}else{
    			alert('删除失败！');
    		}
    			}
    		}
    	}
    }
</script>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>" >
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>" >
<style type="text/css">
table{
width:100%;
margin: auto;
text-align: left;
}
body {
font-size:smaller;
width:100%;
	margin: 0 auto;
}

div, span {
	margin-left: 50%;
	text-align: center;
}
h2{
margin: auto;
text-align: center;
}
</style>
</head>
<body>

	<h1>
		<a href="${BASE}/admin/home">首页</a> / 尺码列表
	</h1>
	尺码换算：
	厘米-->欧制码：cm×2-10=eur|(eur+10)÷2=cm
	厘米-->美制码：cm-18+0.5=us|us+18-0.5=cm
	厘米-->港制码：cm-18-0.5=uk|uk+18+0.5=cm
<div id="global">
	<h2>
		<a href="${BASE}/size/s">添加家庭人员尺码</a>
	</h2>
	<table>
		<tr>
			<th>名称</th>
			<th>身高</th>
			<th>体重</th>
			<!-- <th>肩宽</th>
			<th>胸围</th>
			<th>腰围</th>
			<th>臀围</th> -->
			<th>鞋尺码</th>
			<th>操作</th>
		</tr>
		<c:if test="${not empty sizeList}">
			<c:forEach var="sizes" items="${sizeList}">
				<tr id="tr"+${sizes.id}>
					<td style="text-align: left;width: 10%">${sizes.namecn}</td>
					<td>${sizes.height}</td>
					<th>${sizes.weight}</th>
					<!-- <td>${sizes.shouldersize}</td>
					<td>${sizes.bustszie}</td>
					<td>${sizes.waistsize}</td>
					<td>${sizes.hipline}</td>-->
					<td>${sizes.shoessize}</td>
					<td><a href="${BASE}/size/u/${sizes.id}">编辑</a> 
						<a href="javascript:if(confirm('确实要删除吗?'))location='${BASE}/size/d/${sizes.id}'">删除</a></td>
						
				</tr>
			</c:forEach>
		</c:if>
		<c:if test="${empty sizeList}">
			<tr>
				<td colspan="6"><span><h3>关爱家人,不要忘了添上你关心的人的信息喔,当然还要记得多更新...</h3></span>
				</td>
			</tr>
		</c:if>
	</table>
</div>
</body>
</html>