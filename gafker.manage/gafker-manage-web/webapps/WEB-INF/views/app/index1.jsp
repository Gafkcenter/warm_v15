<%@ page
	language="java"
	contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>单列布局</title>
<style>
*{margin:0;padding:0;}
#wrap{
    width:80%;
    margin:0 auto;
    border:2px solid black;
}
#header{
    width:100%;
    height:100px;
    background:blue;
    margin-bottom:10px;
}
#main{
    width:100%;
    margin-bottom:10px;
}
#main .content{
    height:500px; /* 在实际开发中不设置列的高度，让高度自适应。 */
    background:yellow;
}
#footer{
    width:100%;
    height:100px;
    background:gray;
}
</style>
<body>
<div id="wrap">
    <div id="header">页头</div>
    <div id="main">主体
        <div class="content">内容</div>
    </div>
    <div id="footer">页脚</div>
</div>
</body>
</html>