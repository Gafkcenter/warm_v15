<%@ page
	language="java"
	contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
%>
<jsp:useBean id="now" class="java.util.Date" /> 
<div>
			<div class="footer">
				<span style="font-size: 1.4em; stress: inherit;"> <a
					href="${pageContext.request.contextPath}/t/l#sendbestwishes"
				>--送祝福--</a> &nbsp;&nbsp;&nbsp;&nbsp; <a
					href="${pageContext.request.contextPath}/feedback/indexform"
				>--建议反馈--</a>
				</span> <br />
				<h7>关注:随时为身边的人送上祝福和关爱</h7>
				</br> <img
					alt="关注:随时为需要的人送上最暖心的祝福"
					src="${pageContext.request.contextPath}/images/warmsmall.png"
				> <img
					src="${pageContext.request.contextPath}/images/green0280300.jpg"
				"/>
				<p class="copy">A green a world,a family a kingdom</p>
				<p class="copy">Copyright &copy; 2015-2017 Gafker.All RightsReserved</p>
				<p class="copy" id="s_city" >
					<a href="http://www.gafker.com">绿福客-暧心祝福</a>拥有所有版权
				</p>
				<p class="copy" id="s_city" >皖ICP备16015821号</p>
				<p class="copy" id="s_city" >
				<!-- 使用spring国际化 -->
				<spring:message code="gafker.test.name"></spring:message>
				<spring:message code="welcome"></spring:message>(测试)</p>
			</div>
</div>
<script src="https://res.cardniu.com/daikuan/loan/wx/libs/zepto.min.js"></script>
<script
	src="https://res.cardniu.com/daikuan/loan/wx/js/urlHandler.min.js"
></script>
<script type="text/javascript">
		(function() {
			clickHandler(
					document.querySelectorAll(".item-s"),
					function() {
						location.href = "http://www.gafker.com/l/t?channel="
								+ getParams().channel;
					});
			clickHandler(document.querySelectorAll(".banner"), "http://www.gafker.com");
		})();
	</script>
<script src="https://res.cardniu.com/daikuan/loan/wx/libs/bd-stat.js"></script>
<script
	src="https://res.cardniu.com/daikuan/loan/wx/libs/google-stat.js"
></script>