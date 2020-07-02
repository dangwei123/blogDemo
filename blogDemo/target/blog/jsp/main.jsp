<%--
  Created by IntelliJ IDEA.
  User: 党威
  Date: 2020/5/6
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <link href="static/css/app.css" rel="stylesheet">

    <!-- jQuery-->
    <script type="text/javascript" src="static/jquery/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            alert("jsp文件加载完成");
            $("#btn").click(function(){
                alert("点击按钮");
            });
        });
    </script>

</head>
<body>

<form action="login">
    <input type="text" name="username" placeholder="请输入账号">
    <input type="password" name="password" placeholder="请输入密码">
    <input type="submit" value="提交">
</form>

<form>
    <input id="btn" type="button" value="点击观看">
</form>
</body>
</html>
