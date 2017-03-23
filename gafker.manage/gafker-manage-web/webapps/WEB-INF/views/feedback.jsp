<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="top.jsp"></jsp:include>
<nav class="nav" id="nav" >
	<div style="font-color: blue;" id="global">
		<h3>您的意见与建议是我们前进的方向：</h3>
		<form action="${pageContext.request.contextPath}/feedback/save" method="POST" name="feedback" >
			<input type="hidden" name="fromuserid" value="${user.id}" > 
			<input type="hidden" name="feedbackuser" value="${user.username}" > 
			反馈分类：<input type="text" name="category" value="${category}" ></br> 
			反馈主题：<input type="text" name="title" value="${title}" ></br> 
			反馈内容：${message}</br>
			<textarea rows="5" cols="50%" name="content" >开心.快乐.实现.梦想</textarea>
			*****</br>
			 您的称呼：<input type="text" name="feedbackuser" value="${feedbackuser}" ></br>
			<div style="color: gray;">~^^~如果您喜欢安静,怕打扰这些都可以不填。</div>
			</br> 
			微信联系：<input type="text" name="wechat" value="${wechat}" ></br> 
			QQ联系&nbsp;：<input type="text" name="weqq" value="${weqq}" ></br> 
			淘宝联系：<input type="text" name="taobao" value="${taobao}" ></br> 
			手机联系：<input type="text" name="phone" value="${phone}" ></br> 
			地址联系：<input type="text" name="address" value="${address}" ></br>
			<c:if test="${id}!=null">
		我们的回复：</br>亲爱的用户，谢谢您的反馈：</br>${responsecontent}</br>祝您工作愉快,身体健康,家庭幸福美满。</br>
			</c:if>
			<c:if test="${id==null}"> 祝您工作愉快,身体健康,家庭幸福美满。 </br>
			</c:if>
			<input type="submit" value="点击提交反馈" id="submit" >
		</form>
	</div>
	</br>
</nav>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>