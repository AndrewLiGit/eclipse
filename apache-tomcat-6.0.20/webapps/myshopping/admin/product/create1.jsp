
<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%



	ProTypeDao ptdao = new ProTypeDaoImpl();
	List<ProType> ptlist=ptdao.read();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增商品</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

table tr {
	height: 50px;
}

table tr td {
	width: 100px;
	padding: 5px;
}

table tr td.t1 {
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
</style>
<script type="text/javascript">
	//验证商品名称是否有效
	function validProName() {
		//客户端验证；
		var pName = document.getElementById("ProName");
		if (pName.value == "") {
			alert("商品名称不能为空");
			return false;
		}

		if (pName.value.length > 20) {
			alert("商品名称不能超过20个字符");
			pName.focus();
			pName.select();
			return false;
		}

		return true;
	}

	window.onload = function() {

		var form = document.getElementById("product_form");
		form.onsubmit = function() {
			return validProName();

		}
	};
</script>
</head>

<body>
	<h1>新增商品</h1>
	<div id="error">
		<%
			Object obj = request.getAttribute("error");
			if (null != obj) {
				out.print(obj);
			}
		%>
	</div>
	<div id="input">

		<form id="inputForm" method="post" action="do.jsp">
			<input type="hidden" name="op" value="create"> <label></label>
			<table cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td class="t1">商品名称</td>
					<td><input type="text" name="proName" id="proName"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品单价</td>
					<td><input type="text" name="proPrice"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品库存</td>
					<td><input type="text" name="proAmout"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品分类</td>
					<td><select name="typeName">
							<option value="0">--请选择商品类型--</option>
							<% for(ProType p: ptlist){%>
							<option value="<%=p.getTypeId() %>"><%=p.getTypeName() %></option>
						      <%} %>
					</select></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品图片</td>
					<td><input type="file" name="proImage"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品描述</td>
					<td><textarea name="proDesc">--在此处输入商品的描述--</textarea></td>
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
