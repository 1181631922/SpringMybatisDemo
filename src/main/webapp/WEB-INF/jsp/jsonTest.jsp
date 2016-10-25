<%--
  Created by IntelliJ IDEA.
  User: fanyafeng
  Date: 16/10/24
  Time: 下午2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json交互测试</title>
    <script type="text/javascript" src="resources/js/jquery-1.4.4.min.js"/>
    <script type="text/javascript">
        function requestJson() {
            $.ajax({
                type: 'post',
                url: '${pageContext.request.contextPath}/requestJson',
                contentType: 'application/json;charset=utf-8',
                data: '{"name":"手机","price":"99"}',
                success: function (data) {
                    alert(data);
                }
            });

        }

        function responseJson() {

        }
    </script>
</head>
<body>
<input type="button" onclick="requestJson()" value="请求json,输出json"/>
<input type="button" onclick="requestJson()" value="请求key/value,输出json">

</body>
</html>
