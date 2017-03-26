<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
	String id=request.getParameter("id");
	ProTypeDao pdao=new ProTypeDaoImpl();
	ProType pt=pdao.read(Integer.parseInt(id));
	
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品类型</title>
<style type="text/css">
	* {
	margin: 0;
	padding: 0;
}

body { padding: 5px; }
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
			
			var proName=document.getElementById("proTypeName");
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
	<h1>修改商品类型</h1>
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
			<input type="hidden" name="op" value="update">
			<input type="hidden" name="id" value="<%= pt.getTypeId() %>">
			<label>商品类型</label>
			<input type="text" id="proTypeName" name="proTypeName" value="<%= pt.getTypeName()  %>">
			<input type="submit" value="保存"> 
			<input type="button" value="取消" onclick="history.go(-1);"> 
		</form>
	</div>
	
</body>
</html>