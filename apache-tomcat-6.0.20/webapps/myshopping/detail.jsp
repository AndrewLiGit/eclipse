<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@page import="com.gssw.jd.pojo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	ProductDao pdao = new ProductDaoImpl();
	Product p = pdao.read(Integer.parseInt(id));
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
<link rel="stylesheet" type="text/css" href="css/layout.css">
</head>
<body>
	<div id="container">
		<div id="header">
			<!-- logo -->
			<div id="logo">logo层</div>
			<!-- login -->
			<div id="login">
				<div id="login_input">
					<form method="post" action="#">
						<label>用户名</label> <input type="text" name="userName"> <label>密码</label>
						<input type="password" name="userPass"> <input
							type="submit" value="登录">
					</form>
				</div>
				<div id="login_success">
					欢迎你：?<a href="#">退出</a>
				</div>
			</div>
		</div>
		<div id="adv1">
			2014世界500强完整榜单 <br /> 广电总局如何整顿电视：限剧限娱限丑 <br /> 央视湖南卫视上广集团三家网站的未来命运？<br />
			新店开张，宜家豪气宣传：这辆地铁我包了！<br />
		</div>
		<div id="center">
			<div id="left">
				<img alt=""
					src="<%=p.getProImage() == null ? "images/default1.png" : p
					.getProImage()%>">
					<input type="button" value="返回" onclick="history.go(-1);" > 
			</div>
			<div id="right">
				<ul>
					<li>货号：<%=p.getProId()%></li>
					<li class="title1">商品名称：<%=p.getProName()%></li>
					<li>商品价格：&yen;<%=p.getProPrice()%></li>
					<li>库存：<%=p.getProAmout()%></li>
					<li class="desc1">商品描述：</li>
					<li><%=p.getProDesc()%></li>
				</ul>
				
			</div>
		</div>
		<div id="footer">footer</div>
	</div>
</body>
</html>