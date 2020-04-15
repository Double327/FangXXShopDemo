<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String webPath = request.getContextPath();
%>
<div class="header">
    <h1 class="logo">
        <a title="" style="background: url(<%=webPath%>/images/logo.png);" href="">电子商务平台</a>
    </h1>
    <ul class="shortcut">
        <li class="first"><a href="<%=webPath%>/order/uindex">会员中心</a></li>
        <li><a href="<%=webPath%>/order/listByUser">我的订单</a></li>
        <c:if test="${sessionScope.user.role eq 'a'}">
            <li><a href="<%=webPath%>/user/toAdminLogin">后台管理</a></li>
        </c:if>
        <li class='last'><a href="">使用帮助</a></li>
    </ul>
    <p class="loginfo">
        <!-- 判断当前用户登录状态-显示不同选项-->
        <c:if test="${not empty sessionScope.user}">
            ${user.name}您好，欢迎来到${site}！[<a href="<%=webPath%>/user/logout" class="reg">安全退出</a>]
        </c:if>
        <c:if test="${empty sessionScope.user}">
            [<a href="<%=webPath%>/user/toLogin">登录</a>
            <a class="reg" href="<%=webPath%>/user/toRegister">免费注册</a>]
        </c:if>
    </p>
</div>