<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>
		<input type="file" name="file"><br>
		<input type="submit" value="업로드">
	</form>
	<hr>
	<a href="views">파일 보기</a>
</body>
</html>









