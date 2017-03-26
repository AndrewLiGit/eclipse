

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增商品类型</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	padding: 5px;
}

table tr {
	height: 50px;
}

table tr td {
	width: 500px;
	padding: 5px;
}

table tr td.t1 {
	width: 100px;
	text-align: right;
}

table tr td input,select {
	width: 200px;
	height: 25px;
}

table tr td input.sub1 {
	width: 50px;
}

table tr td textarea {
	width: 300px;
	height: 150px;
	text-align: left;
}

#error {
	color: red;
}
</style>
<script type="text/javascript">
	window.onload=function(){
		var form=document.getElementById("inputForm");
		form.onsubmit=function(){
			
			var proName=document.getElementById("productName");
			if(proName.value==""){
				alert("商品类型不能为空！");
				return false;
			}
			
			return true;
		};
	};
</script>
</head>
<body>
	<h1>新增商品类型</h1>
	<div id="error">
		<%
			Object obj=request.getAttribute("error");
			if(null!=obj){
				out.print(obj);
			}
		%>
	</div>
	<div id="input">
		<form id="inputForm" method="post" action="do.jsp">
			<input type="hidden" name="op" value="create">
			<label>商品类型</label>
			<input type="text" id="proTypeName" name="proTypeName">
			<input type="submit" value="保存"> 
			<input type="button" value="取消" onclick="history.go(-1);">
		</form>
	</div>
	
</body>
</html>