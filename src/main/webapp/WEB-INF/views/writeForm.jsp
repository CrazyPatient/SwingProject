<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>

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


</head>
<body>
	<h2>글쓰기</h2>
	
	<form action="writeAction">
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			
			<tr>
				<td>이름</td>
				<td><input type="text" name="board_name" value="" size="50"></td>
			</tr>	

			<tr>
				<td>제목</td>
				<td><input type="text" name="board_title" value="" size="50"></td>
			</tr>	

			<tr>
				<td>내용</td>
				<td>
					<textarea rows="10" cols="65" name="board_content"></textarea>
				
				</td>
			</tr>	
			
			<tr>
				<td colspan="2">
					<input type="submit" value="글쓰기">
					<a href="ListForm"><input type="button" value="목록보기"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>