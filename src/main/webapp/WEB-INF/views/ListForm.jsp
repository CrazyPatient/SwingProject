<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	*{
		margin: 0 auto;
		padding: 0 auto;
		overflow: hidden;
	}
	
	td,h2{
		text-align: center;
	}
	
</style>


<!-- 페이지 조회수 보존 -->
<script type="text/javascript">
window.onpageshow = function(event) {
	if(event.persisted){
		document.location.reload();
	}
}
</script>


</head>
<body>

	<h2>게시판 글 목록</h2>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="d" items="${list}">
			<tr>
			<td>${ d.board_idx }</td>
			<td>${ d.board_name }</td>
			<td>
			<a href="contentForm?board_idx=${d.board_idx }">${ d.board_title }</a>
			</td>
			
			<td>
			<c:set var="dateVar" value="${d.board_date}"/>
			<fmt:formatDate value="${dateVar }" pattern="yyyy-MM-dd HH:mm:ss"/>			
			</td>
			
			<td>${ d.board_hit }</td>
		</tr>		
		</c:forEach>
		
		<tr>
			<td colspan="5"><a href="writeForm">글 작성</a></td>
		</tr>
	</table>


</body>
</html>