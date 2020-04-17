<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/3
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/views/common/common.jsp"%>
    <script src="/js/common.js"></script>
</head>
<body>
<div id="app" >
        <el-table
                :data="department"
                style="width: 100%" >

            <el-table-column
                    prop='id'
                    label="日期"
                    width="180" >
            </el-table-column>

            <el-table-column
                    prop="name"
                    label="姓名"
                    width="180">
            </el-table-column>
            <el-table-column
                    prop="dirPath"
                    label="地址">
            </el-table-column>
        </el-table>
</div>
<script>
    new Vue({
        el: '#app',
        data:({
            department:[
            ]
        }),
        mounted() {
            var _this = this
                axios.get('/department/list')
                    .then(function (response) {
                        _this.department=response.data
                    })
        },
        methods:{

        }
    });
</script>
</body>
</html>
