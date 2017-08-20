<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>${webname }</title>

<!-- Mobile Specific Metas ================================================== -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- CSS ================================================== -->
<%@ include file="/WEB-INF/jsp/common/css.jsp" %>
<style type="text/css">
label.valid { width: 24px;height: 24px;background: url(${ctx}/resource/static/images/valid.png) no-repeat;display: inline-block;text-indent: -9999px;}
label.error { height: 24px; color: red; background: url(${ctx}/resource/static/images/error.png) no-repeat; padding: 4px 0px 0 20px;margin-top: -20px;}
/* .imglogo{width: 100px;height: 100px;} */
#tabbox1,#tabbox2 {
width: 100px;
height: 80px;
position: relative;
margin-left: 68px;
}
</style>
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/content/zzw/top.jsp" %>
	<div class="mainContainer sixteen container">
            <!--Header Block-->
<%@ include file="/WEB-INF/jsp/common/content/zzw/head-nav.jsp" %>

            <!--Banner Block-->
            <section class="banner-wrapper">
              <div class="heading-block">
                    <div class="titleico"></div>
                    <div class="title10">发布公告</div>                  
               </div>
                <div style="width:70%; padding:20px 20px; line-height:35px; display:inline;">
                <form id="form" action="${ctx }/common/service/noticedeploycheck/" method="post">
                  <p class="textname1" style="margin-left:5%">
                    <input name="title" type="text" class="r-input" value=""  placeholder="请输入公告标题" required>
                    <br><br>
                    <strong>请输入公告内容：</strong><br>
                    <!-- <textarea name="content" cols="" rows="6" style="width:80%" value="" placeholder="请输入公告内容" required></textarea> -->
                    <script id="content" name="content" type="text/plain"></script>
                    
                    <br><font color="#008d7c">至少30个字</font></p>
                  <p class="textname1" align="center">
                    <input name="input" type="submit"  class="r-botton" value="发 布"/>
                  </p>
                  </form>
                </div>
              <div class="heading-block">
                    <div class="titleico"></div>
                    <div class="title10">公告管理</div>                  
               </div>
               <div style="width: 900px; margin-top: 30px;">
               			<c:forEach var="n" items="${ns }">
	               			<div class="newsBox3">
	                           <div class="left" style="width:500px;">
	                              <a href="${ctx }/noticeDetails/?id=${n.id}" class="newstile1">● ${n.title }</a><br>
	                              <span class="newsdate"><fmt:formatDate value="${n.pubtime}" type="date"/></span>
	                           </div>
	                           <div class="right" style="width:200px;">
	                           <a href="${ctx }/common/service/noticeedit/?nid=${n.id}" class="newstile1" >修改</a> |   <a class="newstile1" style="cursor: pointer;" onclick="delnotice(${n.id})">删除</a>
	                           </div>
	                        </div>
               			</c:forEach>
               </div>
            </section>
            
            <!--Content Block-->
            <section class="content-wrapper">
              <div class="content-container container">
                 <%@ include file="/WEB-INF/jsp/common/footer.jsp" %>
              </div>
            </section>
    </div> 
    
</body>
<!--js-->
<%@ include file="/WEB-INF/jsp/common/js.jsp" %>
<script type="text/javascript" src="${ctx}/resource/static/js/ajaxfileupload.js"></script>
<script type="text/javascript" src="${ctx}/resource/static/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="${ctx}/resource/static/js/messages_zh.min.js"></script>
<script type="text/javascript" src="${ctx}/wpt/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${ctx}/wpt/ueditor/ueditor.all.min.js"></script>

<script type="text/javascript">
UEDITOR_CONFIG.UEDITOR_HOME_URL = "${ctx}/wpt/ueditor/";
var ue = UE.getEditor("content",{
	elementPathEnabled : false,//关闭元素路径
	initialFrameHeight:220,//设置编辑器高度
	scaleEnabled:true//关闭自动拉高
});

$(document).ready(function(){
	$(".inline").colorbox({inline:true, width:"50%"});
	$("#form").validate({  
        rules: {  
		    title: {  
		    	required: true
		   	},  
		   content: {  
		    	required: true,  
		    	minlength: 30
		    }
		 },  
         messages: {  
		    title: {  
		    	required: "请输入标题" 
		  	},  
		 	content: {  
		    	required: "请输入公告内容",  
		    	minlength: "公告内容不能小于{0}个字符",
		   	}
		}  
    });
});

function delnotice(id) {
	var f = window.confirm("您确认删除吗？");
	if (!f) {
		return;
	}
	var url = "${ctx}/common/service/noticedelcheck/?nid="+id;
	$.ajax({
		url: url,
		type: "get",
		dataType: "json",
		success: function(data, textStatus){
			if (eval(data)[0]=="success") {
				alert("删除成功");
				window.location.href = window.location;
			}else{
				alert("删除失败");
			}
		},
		error: function(){
			alert("连接远程服务器失败");
		}
	});
}
</script>
<!--end js-->

</html>
