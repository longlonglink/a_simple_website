<%--
  Created by IntelliJ IDEA.
  Date: 2022/6/24
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %><%--指令标识--%>
<%--我的第一个网站--%><%--隐藏的注释--%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>my blog</title>
  </head>
  <body>
  <%String a="my first blog";%>
 <% request.setCharacterEncoding("utf-8");%>

 <jsp:forward page="baidu.jsp">
     <jsp:param name="id" value="郑泽凯"/>
 </jsp:forward><%--动作标识--%>
  </body>
</html>
