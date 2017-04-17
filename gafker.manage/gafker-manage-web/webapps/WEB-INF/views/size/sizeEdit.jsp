<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="BASE" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>客户管理 - 创建客户</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, 
maximum-scale=1.0, user-scalable=no" >
<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>" >
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>" >
<style type="text/css">
table{
width:100%;
margin: auto;
text-align: center;
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
#err{
color: red;
}
</style>
</head>
<body>
	<h1>
		<a href="${BASE}/admin/home">首页</a> / <a href="${BASE}/size/l">尺码管理</a> / 更新尺码
	</h1>
<div id="global">
<!-- 错误提示 -->
<c:if test="${not empty errorMap}">
<div id="err">
<c:forEach  var="err" items="${errorMap}">
<li>${err.key}:${err.value}</li>
</c:forEach>
</div>
</c:if>
	<form id="size_form">
		<table>
			<tr>
				<td>家人姓名：</td>
				<td>
				<input type="text" name="namecn" value="${sizeInfo.namecn}">
				<input type="hidden" name="id" value="${sizeInfo.id}">
				<input type="hidden" name="updateby" value="${sizeInfo.updateby}">
				</td>
			</tr>
			<tr>
				<td>服装型号：</td>
				<td>
				<select name="bodytype" >
				<option value="${sizeInfo.bodytype}">${sizeInfo.bodytype}</option>
				<option value="0">--请选择对应类型--</option>
				<optgroup label="儿童型号">
					<option value="1">0.5-1岁</option>
					<option value="2">1-2岁</option>
					<option value="3">2-3岁</option>
					<option value="4">3-4岁</option>
					<option value="5">4-5岁</option>
					<option value="7">6-7岁</option>
					<option value="9">8-9岁</option>
					<option value="11">10-11岁</option>
					<option value="13">12-13岁</option>
					<option value="15">14-15岁</option>
				</optgroup>
				<optgroup label="字母型号">
					<option value="XS">XS</option>
					<option value="S">S</option>
					<option value="M">M</option>
					<option value="L">L</option>
					<option value="XL">XL</option>
					<option value="2XL">2XL</option>
					<option value="3XL">3XL</option>
					<option value="4XL">4XL</option>
				</optgroup>
				<optgroup label="数字码">
					<option value="23">23码</option>
					<option value="24">24码</option>
					<option value="25">25码</option>
					<option value="26">26码</option>
					<option value="27">27码</option>
					<option value="28">28码</option>
					<option value="29">29码</option>
					<option value="30">30码</option>
					<option value="31">31码</option>
				</optgroup>
				</select>
				</td>
			</tr>
			<tr>
				<td>身高尺码：</td>
				<td><input type="text" name="height" value="${sizeInfo.height}">cm
				</td>
			</tr>
			<tr>
				<td>身体重量：</td>
				<td><input type="text" name="weight" value="${sizeInfo.weight}">kg
				</td>
			</tr>
			<tr>
				<td>肩宽尺码：</td>
				<td><input type="text" name="shouldersize" value="${sizeInfo.shouldersize}">cm
				</td>
			</tr>
			<tr>
				<td>胸围尺码：</td>
				<td><input type="text" name="bustszie" value="${sizeInfo.bustszie}">cm</td>
			</tr>
			<tr>
				<td>腰围尺码：</td>
				<td><input type="text" name="waistsize" value="${sizeInfo.waistsize}">cm</td>
			</tr>
			<tr>
				<td>臀部尺码：</td>
				<td><input type="text" name="hipline" value="${sizeInfo.hipline}">cm</td>
			</tr>
			<tr>
				<td>鞋子尺码：</td>
				<td>
				<select name="shoessize">
				<option value="${sizeInfo.shoessize}" selected="selected">${sizeInfo.shoessize}</option>
				<option value="0">--请选择对应尺码--</option>
				<optgroup label="儿童鞋码">
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					</optgroup>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
					<option value="32">32</option>
					<option value="33">33</option>
					<option value="34">34</option>
					<option value="35">35</option>
					<option value="36">36</option>
					<option value="37">37</option>
					<option value="38">38</option>
					<option value="39">39</option>
					<option value="40">40</option>
					<option value="40.5">40.5</option>
					<option value="41">41</option>
					<option value="42">42</option>
					<option value="42.5">42.5</option>
					<option value="43">43</option>
					<option value="44">44</option>
					<option value="45">45</option>
				</select>
				</td>
			</tr>
		</table>
		<button type="submit">更新尺码</button>
	</form>
</div>
	<script src="${BASE}/js/jquery-1.8.3.min.js"></script>
	<script src="${BASE}/js/jquery.form.min.js"></script>
	<script>
		$(function() {
			$('#size_form').ajaxForm({
				type : 'post',
				url : '${BASE}/size/u',
				success : function(data) {
					if (data) {
						location.href = '${BASE}/size/l';
					}
				}
			});
		});
	</script>

</body>
</html>