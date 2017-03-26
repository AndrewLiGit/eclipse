<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>类型列表</title>
<style type="text/css">

	a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px;  }
	table { font-size:12px; margin-top:5px; }
	
	table tr td { width:100px; border:1px dotted #999; }
	
	table tr td a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px; }
	
	table tr td.w1 { width:200px; } 
	table tr { height:30px;  }
	table tr:hover { background-color:#00F; color:#FFF; cursor:pointer; }

	table tr.t1 { height:50px; text-align:center; background-color:#666; color:#FFF; }
	
	table tr.t1:hover { background-color:#666;  color:#FFF;  }
	
</style>
</head>
<body>
	
		<a href="create.jsp">新增类型</a>
		<table cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td>类型编号</td>
				<td>类型名称</td>
				<td>操作</td>
			</tr>
		
			<%
				ProTypeDao pDao=new ProTypeDaoImpl();
				List<ProType> list=pDao.read();
				for(ProType p:list){
			%>
				<tr>
					<td><%= p.getTypeId() %></td>
					<td><%= p.getTypeName() %></td>
					<td>
						<a href="update.jsp?id=<%= p.getTypeId()  %>">修改</a>
						<a onclick="return confirm('真的要删除吗?');" href="do.jsp?op=del&&id=<%= p.getTypeId()  %>">删除</a>
					</td>
				</tr>
			<% } %>
	
		</table>
	

</body>
</html>