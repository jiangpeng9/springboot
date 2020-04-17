<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/3
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    //   http://localhost:80/crm/
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%--所有访问前都会访问这个--%>
<base href="<%=basePath %>">
<!-- 引入样式 -->
<link rel="stylesheet" href="element-ui/lib/theme-chalk/index.css">
<%--引入vue--%>
<script src="/vue/vue.min.js"></script>
<%--引入axios.min.js来交互数据--%>
<script src="/vue/axios.min.js"></script>
<!-- 引入组件库 -->
<script src="element-ui/lib/index.js"></script>

