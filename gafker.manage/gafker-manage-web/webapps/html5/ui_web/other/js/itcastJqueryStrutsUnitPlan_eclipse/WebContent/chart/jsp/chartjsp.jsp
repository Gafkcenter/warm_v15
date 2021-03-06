<%@ page
	language="java"
	pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"
%>
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=utf-8"
/>
<title>FusionCharts v3 Documentation</title>
<link
	rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Style.css"
	type="text/css"
/>
<script
	language="JavaScript"
	src="${pageContext.request.contextPath}/js/jquery-1.4.2.js"
></script>
<script
	language="JavaScript"
	src="${pageContext.request.contextPath}/chart/JSClass/FusionCharts.js"
></script>
<script
	language="JavaScript"
	src="${pageContext.request.contextPath}/chart/JSClass/chart.js"
></script>
</head>
<body>
	<table
		width="98%"
		border="0"
		cellspacing="0"
		cellpadding="3"
		align="center"
	>
		<tr>
			<td
				valign="top"
				class="text"
				align="center"
			><input
				type="button"
				name="column3D"
				id="column3D"
				value="柱状图"
			> <input
				type="button"
				name="Pie3D"
				id="Pie3D"
				value="饼图"
			> <input
				type="button"
				name="Line2D"
				id="Line2D"
				value="折线"
			></td>
		</tr>
		<tr>
			<td
				valign="top"
				class="text"
				align="center"
			>
				<div
					id="chartdiv"
					align="center"
				>FusionCharts.</div>
			</td>
		</tr>
	</table>
</body>
</html>
