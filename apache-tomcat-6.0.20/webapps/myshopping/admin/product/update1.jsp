<%@page import="com.gssw.jd.pojo.Product"%>
<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	ProductDao pdao = new ProductDaoImpl();
	Product product = pdao.read(Integer.parseInt(id));
	ProTypeDao ptdao = new ProTypeDaoImpl();
	List<ProType> ptlist=ptdao.read();
	 ProType pt=ptdao.read(product.getTypeId());
	 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品</title>
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
	<h1>修改商品</h1>
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
			<input type="hidden" name="id" value="<%=product.getProId()%>">
			<table cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td class="t1">商品名称</td>
					<td><input type="text" name="proName" id="proName"
						value="<%=product.getProName()%>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品单价</td>
					<td><input type="text" name="proPrice"
						value="<%=product.getProPrice()%>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品库存</td>
					<td><input type="text" name="proAmout"
						value="<%=product.getProAmout()%>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品分类</td>
					<td><select name="typeName">
							<option value="<%=pt.getTypeId() %>"><%=pt.getTypeName() %></option>
							<% for(ProType p: ptlist){%>
							<% if(!(p.getTypeName().equals( pt.getTypeName()))){%>
							<option value="<%=p.getTypeId() %>"><%=p.getTypeName() %></option>
						      <%} %>   <%}     %>
					</select></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品图片</td>
					<td><input type="file" name="proImage" value="<%=product.getProImage() %>"></td>
					<td>...</td>
				</tr>
				<tr>
					<td class="t1">商品描述</td>
					<td><textarea name="proDesc"
							value="<%=product.getProDesc()%>"></textarea></td>
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