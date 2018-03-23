<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>가수</td>
        <td>옥타브</td>
        <td>장르</td>
    <tr>
        <c:forEach items="${musics}" var="Domain">
    <tr>
        <td>${Domain.mId}</td>
        <td>${Domain.mName}</td>
        <td>${Domain.mSinger}</td>
        <td>${Domain.mOctave}</td>
        <td>${Domain.mGenre}</td>
    <tr>
        </c:forEach>
</table>
</body>
</html>