<%@ page
	language="java"
	contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
%>
<%@ taglib
	uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"
%>
<%@ taglib
	prefix="form"
	uri="http://www.springframework.org/tags/form"
%>
<%@ taglib
	prefix="fmt"
	uri="http://java.sun.com/jsp/jstl/fmt"
%>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
	<c:import
		url="../common/base.jsp"
		charEncoding="utf-8"
	></c:import>
</c:catch>
<c:out value="${importError0}"></c:out>
<!DOCTYPE html>
<script type="text/javascript">
<!--
	var totalFileLength, totalUploaded, fileCount, filesUploaded,xhr;
	//显示上传文件的完整路径信息
	function showPath(s) {
		var showPath = document.getElementById('showPath');
		if (showPath) {
			showPath.innerHTML = showPath.innerHTML + '<br/>' + s+"&nbsp;完成";
		}
	}
	//显示调试信息
	function debug(s) {
		var debug = document.getElementById('debug');
		if (debug) {
			debug.innerHTML = debug.innerHTML + '<br/>' + s;
		}
	}
	//上传完成执行操作callback
	function onUploadComplete(e) {
		//查看当前上传文件对象的属性
		var fileAttr = document.getElementById('files').files[filesUploaded];
		showPath(fileAttr.name+"&nbsp;&nbsp;"+xhr.responseText);
		totalUploaded += fileAttr.size;
		filesUploaded++;
		debug('complete ' + filesUploaded + ' of ' + fileCount);
		debug('totalUploaded' + totalUploaded);
		if (filesUploaded < fileCount) {
			uploadNext();
		} else {
			var bar = document.getElementById('bar');
			bar.style.width = '100%';
			bar.innerHTML = '100% complete';
			//alert('完成上传！Finished uploading file(s)');
		}
	}
	//文件选取操作
	function onFileSelect(e) {
		var files = e.target.files;//文件列表对象
		var output = [];
		fileCount = files.length;
		totalFileLength = 0;
		for (var i = 0; i < fileCount; i++) {
			var file = files[i];
			output.push(file.name, ' (', file.size, ' bytes, ', file
					.lastModifiedDate.toLocaleDateString(), ')');
			output.push('<br/>');
			debug('add ' + file.size);
			totalFileLength += file.size;
		}
		document.getElementById('selectedFiles').innerHTML = output.join('');
		debug('totalFileLength:' + totalFileLength);
	}
	//上传 中
	function onUploadProgress(e){
		if(e.lengthComputable){
			var percentComplete=parseInt((e.loaded+totalUploaded)*100/totalFileLength);
			var bar=document.getElementById('bar');
			bar.style.width=percentComplete+' % complete';
		}else{
			debug('umable to compute');
		}
	}
	//上传失败
	function onUploadFailed(e){
		alert("确认是否为图片,且要小于2M。重新选择图片。");
	}
	//上传文件
	function uploadNext(){
		xhr=new XMLHttpRequest();
		var fd=new FormData();
		var file=document.getElementById('files').files[filesUploaded];
		fd.append('multipartFile',file);
		//参数1：事件名称；参数2：调用函数；参数3：false 默认 事件句柄在冒泡阶段执行  true 捕获阶段执行；
		xhr.upload.addEventListener('progress',onUploadProgress,false);
		xhr.addEventListener('load',onUploadComplete,false);
		xhr.addEventListener('error',onUploadFailed,false);
		xhr.open('POST','s');//文件发送接口;
		debug('uploading '+file.name);
		//xhr.onreadystatechange = callback;
		xhr.send(fd);  
    }   
	
	//上传入口,启动上传功能
	function startUpload(){
		totalUploaded=filesUploaded=0;
		uploadNext();
	}
	window.onload=function(){
		document.getElementById('files').addEventListener('change',onFileSelect,false);
		document.getElementById('uploadButton').addEventListener('click',startUpload,false);
	}
//-->
</script>
<div id="global">
	<a href="${pageContext.request.contextPath}/admin/home">家园首页</a>&nbsp;
	<a href="${pageContext.request.contextPath}/p/s">添加农产品</a>
	<a href="${pageContext.request.contextPath}/f/l/${user.id}">查看家园相册</a>
	<h1>家庭照片HTML5上传系统</h1>
	<!-- 进度条 
	<div id="progressBar" style="height: 20px; border: 1px solid gray" >
		<div id="bar" style="height: 100%; background: #33dd33; width: 0%" ></div>
	</div>
	-->
	<!-- 上传表单  -->
	<form action="">
		<input type="file" id="files" multiple /><br />
		<output id="selectedFiles"></output>
		<br /> 
		<input id="uploadButton" type="button" value="图片上传" />
	</form>
	<div id="showPath" style="height: 200px; border: 1px solid green; overflow: auto;" ></div>
	<!-- <div id="debug" style="height: 100px; border: 2px solid green; overflow: auto" ></div> -->
</div>
