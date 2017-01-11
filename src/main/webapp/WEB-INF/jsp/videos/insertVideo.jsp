<%--
  Created by IntelliJ IDEA.
  User: fanyafeng
  Date: 16/10/18
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>修改视频信息</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/videos/editVideoSubmit" method="get">
    <%--<input type="hidden" name="id" value="${video.id }"/>--%>
    修改视频信息：
    <table width="100%" border=1>
        <tr>
            <td>视频标题</td>
            <td>
                <textarea rows="3" cols="180" name="title">${video.title }</textarea>
            </td>
        </tr>
        <tr>
            <td>视频简介</td>
            <td>
                <textarea rows="3" cols="180" name="des">${video.des }</textarea>
            </td>
        </tr>
        <tr>
            <td>视频头图</td>
            <td>
                <textarea rows="3" cols="180" name="header_img">${video.header_img }</textarea>
            </td>
        </tr>
        <tr>
            <td>视频占位图</td>
            <td>
                <textarea rows="3" cols="180" name="img">${video.img }</textarea>
            </td>
        </tr>
        <tr>
            <td>视频连接</td>
            <td>
                <textarea rows="3" cols="180" name="video_url">${video.video_url }</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
