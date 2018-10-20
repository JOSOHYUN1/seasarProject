<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form method="POST">
	<table align="center">
		<tr>
			<td>작성자</td>
			<td><input type="text" name="writer" value="${vo.writer}" maxlength="30"><html:errors property="writer" /></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${vo.title}" maxlength="50"><html:errors property="title" /></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" cols="80" rows="20">${vo.content}</textarea><html:errors property="content" /></td>
		</tr>

		<tr>
			<td></td>
			<td>
			<input type="hidden" name="boardNo" value="${vo.boardNo}">
			<input type="hidden" name="regdate" value="${vo.regdate}">
			<s:submit property="update" value="수정 완료" />
			<s:submit property="delete" value="글 삭제" />
			<s:submit property="modifyCancel" value="취소" />
			</td>
		</tr>
	</table>
</s:form>
</body>
</html>