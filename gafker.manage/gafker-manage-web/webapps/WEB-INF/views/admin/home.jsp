<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<jsp:include page="../common/common_head.jsp"></jsp:include>
<c:catch var="importError0">
        <c:import url="../common/base.jsp" charEncoding="utf-8"></c:import>
    </c:catch>
    <c:out value="${importError0}"></c:out>
    
<div id="syshead"><h1>${user.username}的家园</h1></div>
<div class="divcss5-right">欢迎<b>${user.username}</b>登录&nbsp;<a href="<c:url value='/security/logout'/>"><button>退出登录</button></a></div>
<div id="global">
<!-- 
<a href="<c:url value='/admin/role'/>"><button>访问需要角色的页面</button></a>
<a href="<c:url value='/admin/auth'/>"><button>访问需要权限的页面</button></a>
 -->
<!-- 我的收藏 -->
<a href="${pageContext.request.contextPath}/news/l/${user.id}">我家的技术收藏</a><br/>
<hr/>
<!-- 家乡介绍相关 -->
<a href="${pageContext.request.contextPath}/p/${user.id}">我家的农产品</a><br/>
<a href="${pageContext.request.contextPath}/tr/list">参于溯源的农产品</a><br/>
<!--
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/activities/l">举行活动的农产品</a><br/>
-->
<hr/>
<!-- 日常生活相关--> 
<a href="${pageContext.request.contextPath}/size/${user.id}" title="用心关注关爱的人">爱心尺码</a><br/>
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/bookstore/eat">家庭养生</a><br/>
<hr/>
<!-- 文件管理 -->
<a href="${pageContext.request.contextPath}/f/l/${user.id}">家庭相册</a><br/>
<!--
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/f/d">下载文件</a><br/>
 -->
<!-- 公益社会服务相关 -->
<a href="${pageContext.request.contextPath}/t/l" title="${pageContext.request.contextPath}/admin/wish/l">暖心祝福</a><br/>
<!-- 
<a href="javascript:alert('建设中...');" alt="${pageContext.request.contextPath}/admin/hope/l" title="提出人,愿望价值,所需要时间,愿望受益人，实现人,愿望列表,本人实现完成时间,实际完成时间,别人帮助完成时间,愿望实现率">愿望树</a><br/>
 -->
<hr/>
<!-- 家谱相关 -->
<a href="${pageContext.request.contextPath}/admin/branch/s">家谱分支</a><br/>
<a href="${pageContext.request.contextPath}/admin/gen/s">家族辈份</a><br/>
<!-- 
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/gendesk/s">家族圆桌</a><br/>
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/home/l">家族树</a><br/>
 -->
<hr/>
<!-- 
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/bookstore/l">书柜</a><br/>
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/clothespress/l">衣柜</a><br/>
<a href="javascript:alert('建设中...');" title="${pageContext.request.contextPath}/admin/collection/l">收藏柜</a><br/>
<hr/>
-->
<!-- 系统使用的的所有类型设置 -->
<a href="${pageContext.request.contextPath}/admin/dicttype/s">字典类型</a><br/>
<a href="${pageContext.request.contextPath}/admin/dict/l">字典类型值设置</a><br/>
<hr/>
<!-- 反馈系统 -->
<a href="${pageContext.request.contextPath}/feedback/indexform">意见建议</a><br/>
<hr/>
</div>