<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib
	uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"
%>
<!DOCTYPE html>
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=UTF-8"
>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include><br /> 祝福要真诚哦，亲。
	<br /> ${message}
	<a href="http://www.gafker.com/t/l">再送祝福</a>
	<br />
	<br />
	<b>友情提示：</b>
	<br /> 1.登录码:用于用户登录
	<br /> 2.祝福码/分享码：用于分享祝福
	<br />
	<span style="color: red;">>>>>${messageTitle}</span>
	<br />
	<br />
	<b>可能原因：</b>
	<br /> 1.祝福信息不完整。
	<br /> 2.祝福图片大于2M;
	<br /> 3.其它;
	<br />
	<jsp:include page="../bottom.jsp"></jsp:include>
</body>
</html>