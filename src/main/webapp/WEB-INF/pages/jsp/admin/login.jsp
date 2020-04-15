<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String webPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <base href="${base}/"/>
    <title>管理后台登录</title>
    <script type="text/javascript" src="<%=webPath%>/js/jquery-2.0.3.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=webPath%>css/admin.css"/>
    <script type="text/javascript">
        $(function () {
            $("#captchaImg").on("click", function () {
                $(this).attr("src", "random?" + new Date().getTime());
            });
        });
    </script>
</head>
<body id="login">
<div class="container">
    <div id="header">
        <div class="logo">
            <a href="#"><img src="<%=webPath%>/images/admin/logo.png" width="250" height="53"/></a>
        </div>
    </div>
    <div id="wrapper" class="clearfix">
        <div class="login_box">
            <div class="login_title">后台管理登录</div>
            <div class="login_cont">
                <form action='<%=webPath%>/user/adminLogin' method='post'>
                    <table class="form_table">
                        <col width="90px"/>
                        <col/>
                        <tr>
                            <th valign="middle">用户名：</th>
                            <td><input class="normal" type="text" name="name" alt="请填写用户名"/></td>
                        </tr>
                        <tr>
                            <th valign="middle">密码：</th>
                            <td><input class="normal" type="password" name="password" alt="请填写密码"/></td>
                        </tr>
                        <tr>
                            <th valign="middle"></th>
                            <td><input class="submit" type="submit" value="登录"/><input class="submit" type="reset"
                                                                                       value="取消"/></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
    <div id="footer">Copyright © 2015-2018 灵微网上商城</div>
</div>
</body>
<script>
    <c:if test="${not empty msg}">
    alert("${msg}");
    </c:if>
</script>
</html>

