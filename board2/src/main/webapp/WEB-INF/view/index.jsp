<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
    <%@page import="java.text.SimpleDateFormat" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>게시판 목록</title>
</head>
<body>

 <h2>게시판 목록</h2>
<s:form method="POST">


<table style="border:1px solid #ccc" border="1">

    <colgroup>
        <col width="10%"/>
        <col width="*"/>
        <col width="15%"/>
        <col width="20%"/>
    </colgroup>

    <thead>
        <tr>
            <th scope="col">글번호 </th>
            <th scope="col">제목</th>
            <th scope="col">작성자</th>
            <th scope="col">작성일</th>
        </tr>
    </thead>

	<tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list}" var="board">
                    <tr>
                        <td align="center">${board.boardNo }</td>
                        <td><a href="view?boardNo=${board.boardNo}">${board.title }</a></td>
                        <td align="center">${board.writer }</td>
                        <td align="center">${board.regdate }</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </tbody>

</table>


<s:submit property="write" value="글작성" />
</s:form>
</body>
</html>