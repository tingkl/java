<%--
  Created by IntelliJ IDEA.
  User: tingkl
  Date: 2016/12/13
  Time: 下午4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success<%=request.getSession().getAttribute("username")%>
${username}
</body>
</html>