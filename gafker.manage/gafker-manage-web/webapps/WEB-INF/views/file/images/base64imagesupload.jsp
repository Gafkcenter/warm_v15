<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="width=device-width,inital-scale=1.0,minimum-scale=1.0,maximum-scake=1.0,user-scalable=no" />  
<meta name="apple-mobile-web-app-capable" content="yes" />  
<meta name="apple-mobile-web-status-bar-style" content="block" />  
<meta name="fromat-detecition" content="telephone=no" />
<title>这个JSP没有去使用</title>
<jsp:include page="../../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
<script type="text/javascript">
$('.testUpload').bind('change',function(event){
	var imageUrl=getObjectURL($(this)[0].files[0]);
	convertImgToBase64(imageUrl,function(base64Img){
		$('#base').attr('src',base64Img);
		$('#uploadFile').val(base64Img.split(',')[1]);
	});
	event.preventDefault();
});
//生成图片的base64编码
function convertImgToBase64(url,callback,outputFormat){
	var canvas=document.createElement('CANVAS');
	var ctx=canvas.getContext('2d');
	var img=new Image;
	img.crossOrigin='Anonymous';
	img.onload=function(){
		var width=img.width;
		var height=img.height;
		//压缩百分比，1为100%
		var rate = 1;
		canvas.width=width*rate;
		canvas.height=height*rate;
		ctx.drawImage(img,0,0,width,height,0,0,width*rate,height*rate);
		//canvas.toDataURL返回的是一串Base64编码的URL
		var dataURL=canvas.toDataURL(outputFormat||'image/png');
		callback.call(this,dataURL);
		canvas=null;
	};
	img.src=url;
}
//createobjecturl()静态方法创建一个包含了DOMString代表参数对象的URL。
//该url的声明周期是在该窗口中.
//也就是说创建浏览器创建了一个代表该图片的Url.
function getObjectURL(file){
	var url=null;
	if(window.createObjectURL!=undefined){
		//basic
		url=window.createObjectURL(file);
	}else if(window.URL!=undefined){
		//(mozilla(firefox))
		url=window.URL.createObjectURL(file);
	}else if(window.webkitURL!=undefined){
		//web_kit or chrome
		url=window.webkitURL.createObjectURL(file);
	}
	return url;
}
</script>
</head>
<body>
<form id="uploadImg" method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/upoadImgBase64">
<div style="position: relative;">
<img id="base" style="position: absolute;width: 50px;"  alt="上传" src="">
<input type="file" style="	position: absolute;opacity:100;" name="files" class="testUpload"/>
<!-- 存base64字符串 -->
<input type="hidden" name="baseFile" id="uploadFile"/>
</div>

</form>
</body>
</html>