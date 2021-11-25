<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function ajaxTest(){
		var n = document.getElementById("name").value
		var a = $("#age").val()
		var addr = $("#addr").val()
		var form = { name : n, age: a , addr:addr}
		console.log(form)
		$.ajax({
			url : "ajax_result01", type : "POST",
			// data : 서버(컨트롤러)로 보내는 데이터
			data : JSON.stringify(form),
			dataType : 'json', // 서버(컨트롤러)로 부터 돌아오(return값)는 값
			// contentType : 서버(컨트롤러)로 보내는 타입의 형태
			contentType : "application/json; charset=utf-8",
			success : function(result){
				$("#label").text(result.name + ", "+result.age+", "+result.addr)
			}, error : function(){
				alert("문제 발생!!!!")
			}
		})
	}
</script>
</head>
<body>
	<input type="text" id="name" placeholder="name"><br>
	<input type="text" id="age" placeholder="age"><br>
	<input type="text" id="addr" placeholder="addr"><br>
	<input type="button" onclick="ajaxTest()">
	<hr>
	결과 : <label id="label"></label>
</body>
</html>







