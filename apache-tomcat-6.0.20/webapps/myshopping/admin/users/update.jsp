<%@page import="com.gssw.jd.pojo.Users"%>
<%@page import="com.gssw.jd.dao.impl.UsersDaoImpl"%>
<%@page import="com.gssw.jd.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	UsersDao pdao = new UsersDaoImpl();
	Users users = pdao.read(Integer.parseInt(id));
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
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
	window.onload = function() {
		var form = document.getElementById("inputForm");
		form.onsubmit = function() {

			var proName = document.getElementById("proTypeName");
			if (proName.value == "") {
				alert("商品类型不能为空！");
				return false;
			}

			return true;
		};
	};
</script>
</head>
<body>
	<h1>修改用户</h1>
	<div id="error">
		<%
			Object obj = request.getAttribute("error");
			if (null != obj) {
				out.print(obj);
			}
		%>
	</div>
	

		<form id="inputForm" method="post" action="do.jsp">
			<input type="hidden" name="op" value="update">
			<input type="hidden" name="id" value="<%=users.getUserId()%>">
			<table cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td class="t1">用户名</td>
					<td><input type="text" name="userName" id="userName" value="<%=users.getUserName()%>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">用户密码</td>
					<td><input type="text" name="userPass" value="<%=users.getUserPass()%>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">注册时间</td>
					<td><input type="text" name="loginTime"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">是否为管理员</td>
					<td><select name="isAdmin"  >
							<option value="0">--普通用户--</option>
							<option value="1">管理员</option>
							
					</select></td>
					<td>...</td>
				</tr>
			
				<tr>
					<td></td>
					<td><input class="sub1" type="submit" value="保存"> <input
						type="button" value="取消" onclick="history.go(-1);"></td>
					<td></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>