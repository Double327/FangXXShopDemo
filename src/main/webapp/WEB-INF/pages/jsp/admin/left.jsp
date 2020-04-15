<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	/* 获取当前服务器地址 */
	String webPath = request.getContextPath();
%>
<ul class="menu">
	<c:choose>
		<%--超级管理员--%>
		<c:when test="${sessionScope.user.name eq 'admin'}" >
			<li><a href="<%=webPath%>/admin/authorityList">管理员权限管理</a></li>
			<li><a href="<%=webPath%>/user/member">会员管理</a></li>
			<li><a href="<%=webPath%>/user/listByPage">数据报表</a></li>
		</c:when>

		<%--一般业务管理--%>
		<c:otherwise>
			<li><a href="<%=webPath%>/goods/listByPage">商品列表</a></li>
			<li><a href="<%=webPath%>/goods/add">商品添加</a></li>
			<li><a href="<%=webPath%>/category/list">分类列表</a></li>
			<li><a href="<%=webPath%>/admin/toCategoryAdd">添加分类</a></li>
			<li><a href="<%=webPath%>/order/listByPage">订单列表</a></li>
			<li><a href="<%=webPath%>/comment/list">评价管理</a></li>
		</c:otherwise>
	</c:choose>
</ul>