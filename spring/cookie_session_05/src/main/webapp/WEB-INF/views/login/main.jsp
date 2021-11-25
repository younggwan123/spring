<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>main.jsp<br>
	<c:choose>
		<c:when test="${loginId != null}">
			${loginId } 님 환영합니다<br>
			${loginNick } 님 환영합니다<br>
			<a href="logout">logout</a>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				alert('로그인 해라!!!');
				location.href="login";
			</script>
		</c:otherwise>
	</c:choose>
	
	
	
</body>
</html>









