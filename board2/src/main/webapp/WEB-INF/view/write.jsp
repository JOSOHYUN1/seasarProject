<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 작성</title>
</head>
<body>
<s:form method="POST">
	<table align="center">
		<tr>
			<td>작성자</td>
			<!-- <td><input type="text" name="writer" maxlength="10"><html:errors property="writer" /></td> -->
			<td><input type="text" name="writer" value="${vo.writer}"><html:errors property="writer" /></td>
			<!-- <td><input type="text" name="writer"><html:errors property="validate" /></td> -->
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${vo.title}" maxlength="20"><html:errors property="title" /></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" cols="80" rows="20">${vo.content}</textarea><html:errors property="content" /></td>
		</tr>
		<tr>
			<td></td>
			<td><s:submit property="insert" value="등록" />
				<s:submit property="writeCancel" value="취소" /></td>
		</tr>
	</table>
</s:form>
</body>
</html>