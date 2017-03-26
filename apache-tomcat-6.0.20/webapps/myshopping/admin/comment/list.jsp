<%@page import="com.gssw.jd.pojo.Comment"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.dao.impl.CommentDaoImpl"%>
<%@page import="com.gssw.jd.dao.CommentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%


	CommentDao pDao=new CommentDaoImpl();
int pageSize=2;
int recordCount=pDao.total();
int pageCount=(int)Math.ceil((double)recordCount/pageSize);

int pageNo=1;	//页码

String pno=request.getParameter("pno");		//接收分页的页码参数

if(null!=pno){
	pageNo=Integer.parseInt(pno);
}

List<Comment> list=pDao.read(pageNo, pageSize);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>评论列表</title>
<style type="text/css">

		a.noclick {color:#c0c0c0; background-color: #FFFFFF; }
	
	a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px;  }
	table { font-size:12px; margin-top:5px; }
	
	table tr td { width:100px; border:1px dotted #999; }
	
	table tr td a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px; }
	
	table tr td.w1 { width:200px; } 
	table tr { height:30px;  }
	table tr:hover { background-color:#00F; color:#FFF; cursor:pointer; }

	table tr.t1 { height:50px; text-align:center; background-color:#666; color:#FFF; }
	
	table tr.t1:hover { background-color:#666;  color:#FFF;  }
	
	#pager span label { background-color:#00F; color:#FFF;   }
	#pager input { width:70px; height: 20px; }
	#pager input.btn { width:40px; }
	
</style>
</head>

<body>
	<div id="ctl"><a title="新增评论" href="create.jsp">新增评论</a></div>
		<div id="data">
		
		<% if(null!=list&&list.size()>0) { %>
	<table cellpadding="0" cellspacing="0" border="0">
      <tr class="t1">
      	 <td>评论编号</td>
        <td>商品编号</td>
        <td>客户编号</td>
        <td>评论内容</td>
        <td>评论时间</td>
        <td>基本操作</td>
      </tr>
      
      <%
      	for(Comment c:list){
      %>
      	<tr>
	        <td><%= c.getCmtId() %></td>
	        <td><%= c.getProId() %></td>
	        <td><%= c.getCustId() %></td>
	        <td><%= c.getContent() %></td>
	        <td><%= c.getCmtTime() %></td>
	        <td>
	        	<a href="update.jsp?id=<%= c.getCmtId() %>">修改</a>
	            <a onclick="return confirm('真的要删除吗？');" href="do.jsp?op=del&id=<%= c.getCmtId() %>">删除</a>
	        </td>
	      </tr>
      
      <% } %>
      
      
</table>
<div id="pager">
		
			<% if(pageNo==1) { %>
				<a class="noclick">第一页</a>
				<a class="noclick">上一页</a>
			<% } else { %>
				<a href="list.jsp?pno=1">第一页</a>
				<a href="list.jsp?pno=<%= pageNo-1  %>" >上一页</a>
			<% } %>
			
			<% if(pageNo==pageCount) { %>
				<a class="noclick">下一页</a>
				<a class="noclick">最后一页</a>
			<% } else { %>
				<a href="list.jsp?pno=<%= pageNo+1  %>" >下一页</a>
				<a href="list.jsp?pno=<%= pageCount  %>" >最后一页</a>
			<% } %>
			
			<span>每页<label><%= pageSize %></label>记录/共<label><%= recordCount %></label>记录</span>
			<span>第<label><%= pageNo %></label>页/共<label><%= pageCount %></label>页</span>
			跳转到<input type="text" id="topager" name="topager">
			<input class="btn" type="button" id="btnGo" name="btnGo" value="GO">
			<script type="text/javascript">
				var btnGo=document.getElementById("btnGo");
				btnGo.onclick=function(){
					var pno=document.getElementById("topager");
					if(pno.value==""||isNaN(pno.value)){
						alert("请输入正确的页码数字");
						pno.focus();
						pno.select();
						return false;
					}
					
					//处理页码范围
					var _pno=<%= pageNo %>;
					var _pcount=<%=pageCount %>;
					
					var _no=pno.value;
					
					if(_no<_pno){
						_no=1;
					} else if(_no>_pcount){
						_no=_pcount;
					}
					
					window.location.href="list.jsp?pno="+_no;
					
				}
			</script>
		</div>
	
		<% } else { %>
			没有任何商品类型信息，请点击新增添加类型。
		<% } %>
		
	</div>
	

</body>
</html>