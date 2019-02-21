<%--
  Created by IntelliJ IDEA.
  User: Monster_0522
  Date: 2019/2/19
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/blog/successServlet" method="post">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    验证码：<input type="text" name="veriCode"><img src="/blog/imageServlet"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
