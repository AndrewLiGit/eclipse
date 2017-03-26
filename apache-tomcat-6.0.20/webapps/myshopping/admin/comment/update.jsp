<%@page import="com.gssw.jd.dao.impl.CommentDaoImpl"%>
<%@page import="com.gssw.jd.dao.CommentDao"%>
<%@page import="com.gssw.jd.pojo.Comment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id=request.getParameter("id");
	CommentDao udo=new CommentDaoImpl();
	Comment c=udo.read(Integer.parseInt(id));
%>    
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改评论</title>
<style type="text/css">
*{ margin:0; padding:0; }
table tr { height:50px; }
table tr td { width:500px; padding:5px; }
table tr td.t1 { width:100px; text-align:right; }
table tr td input,select { width:200px; height:25px; }
table tr td input.rdo1 { width:30px; }
table tr td input.sub1 { width:50px; }
table tr td textarea { width:300px; height:150px; text-align:left; }
.error1 { background-color:#936; color:#FFF; border:1px solid #F00; }
</style>
</head>
<body>
	<h1>修改评论</h1>
	<div id="inputForm">
		<form id="CommentForm" method="post" action="do.jsp">
		<input type="hidden" name="op" value="update">
		<input type="hidden" name="id" value="<%= c.getCmtId() %>">
        <table cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td class="t1">商品编号</td>
                <td>
                	<input type="text" id="ProId" name="ProId" value="<%= c.getProId() %>">
                </td>
            </tr>
             <tr>
            	<td class="t1">客户编号</td>
                <td><input type="text" id="CustId" name="CustId" value="<%= c.getCustId() %>"></td>
            </tr>
             <tr>
            	<td class="t1">评论内容</td>
                <td>
                	<input type="text" id="Content" name="Content" value="<%= c.getContent() %>">
                	
                </td>
            </tr>
             <tr>
            	<td></td>
                <td>
                	<input class="sub1" type="submit" value="保存">
                	<input class="sub1" type="button" value="取消" onclick="history.go(-1);">	
                </td>
            
            </tr>
        </table>
   	</form>
	</div>
</body>
</html>