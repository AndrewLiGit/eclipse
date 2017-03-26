<%@page import="com.gssw.jd.pojo.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.util.Pager"%>
<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ProductDao pdao=new ProductDaoImpl();
	Pager pager=new Pager();	

	int recordCount=pdao.total();
	pager.setRecordCount(recordCount);
	
	String pno=request.getParameter("p");
	pager.setPageNo(pno);
	
	pager.setUrl("list.jsp");
	
	List<Product> list=pdao.read(pager.getPageNo(), pager.getPageSize());

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>

<link rel="stylesheet" type="text/css" href="../css/table.css">
<link rel="stylesheet" type="text/css" href="../css/pager.css">

</head>
<body>
	<div id="ctl">
		<h1>商品管理</h1>
		<a href="create.jsp">新增商品</a>
	</div>
	<div id="data">
		<% if(null==list||list.size()==0) { %>
			没有任何商品信息，请点击新增创建商品。
		<% } else { %>
		
		<table cellpadding="0" cellspacing="0" border="0">
		      <tr class="t1">
		        <td>商品编号</td>
		        <td>商品名称</td>
		        <td>所属类型</td>
		        <td>价格</td>
		        <td>图片</td>
		        <td>库存</td>
		        <td>基本操作</td>
		      </tr>
		      <%
		      	for(Product p:list){
		      %>
		      	 <tr>
			        <td><%= p.getProId() %></td>
			        <td><%= p.getProName() %></td>
			        <td><%= p.getTypeName() %></td>
			        <td><%= p.getProPrice() %></td>
			        <td><img width="100px" height="50px" alt="" src="<%= p.getProImage() %>"></td>
			        <td><%= p.getProAmout() %></td>
			        <td>
			        	<a href="update.jsp?id=<%= p.getProId() %>">修改</a>
			            <a href="#">删除</a>
			        </td>
			      </tr>			
		      <% } %>
		     
		</table>
		<div id="pager" class="paging"><%= pager.getHtml() %></div>
		<% } %>
	</div>
</body>
</html>