<%@page import="com.gssw.jd.pojo.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//获取首页显示的商品信息列表
	ProductDao pdao=new ProductDaoImpl();
	List<Product> list=pdao.read(1, 8);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>XXX网站</title>
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
                    	<label>用户名</label>
                        <input type="text" name="userName">
                        <label>密码</label>
                        <input type="password" name="userPass">
                        <input type="submit" value="登录">
                    </form>
                </div>
                <div id="login_success">
                	欢迎你：?<a href="#">退出</a>
                </div>
            </div>
        </div>
        <div id="adv1">
           2014世界500强完整榜单 <br/> 
                      广电总局如何整顿电视：限剧限娱限丑 <br/>
    
                       央视湖南卫视上广集团三家网站的未来命运？<br/>
                       新店开张，宜家豪气宣传：这辆地铁我包了！<br/>

        </div>
        <div id="center">
        	<div id="prolist">
        		<% for(Product p:list){ %>
        			<dl>
	                	<dt>
	                    	<img src="<%= p.getProImage()==null?"images/default1.png":p.getProImage() %>" width="100" height="100">
	                    </dt>
	                    <dd>
	                    	<ul>
	                        	<li><%= p.getProName() %></li>
	                            <li>&yen;<%= p.getProPrice() %></li>
	                            <li>
	                            	<a title="查看详情" href="detail.jsp?id=<%= p.getProId() %>"></a>
	                                <a title="放入购物车" href="#"></a>
	                            </li>
	                        </ul>
	                    </dd>
	                </dl>
        		<% } %>
        	
            </div>
            <div id="comments"></div>
        </div>
        <div id="footer">footer</div>
    </div>
</body>
</html>