<%--
  Created by IntelliJ IDEA.
  User: fanyafeng
  Date: 16/10/18
  Time: 下午12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>商品列表</title>
    <script type="text/javascript">
        function editItemsAllSubmit() {
//            提交form
            document.itemsForm.action = "${pageContext.request.contextPath}/items/editItemsAllSubmit";
            document.itemsForm.submit();
        }

        function queryItems() {
//            提交form
            document.itemsForm.action = "${pageContext.request.contextPath}/items/itemsList";
            document.itemsForm.submit();
        }
    </script>
</head>
<body>
<form name="itemsForm" action="${pageContext.request.contextPath}/items/itemsList" method="post">
    查询条件:
    <table width="100%" border="1">
        <tr>
            <td>商品名称:<input name="itemsCustomModel.name"></td>
            <td>
                <input type="button" value="查询" onclick="editItemsAllSubmit()">
                <input type="button" value="批量删除" onclick="deleteItems()">
            </td>
        </tr>
    </table>

    商品列表:
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsList}" var="item" varStatus="status">
            <tr>
                <td><input name="itemsCustomModelList[${status.index}].name" value="${item.name}"/></td>
                <td><input name="itemsCustomModelList[${status.index}].price" value="${item.price}"/></td>
                <td><input name="itemsCustomModelList[${status.index}].createTime" value="<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
                </td>
                <td><input name="itemsCustomModelList[${status.index}].detail" value="${item.detail}"/></td>
            </tr>
        </c:forEach>
    </table>


</form>
</body>
</html>
