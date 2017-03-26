<%@page import="com.gssw.jd.pojo.Comment"%>
<%@page import="com.gssw.jd.dao.impl.CommentDaoImpl"%>
<%@page import="com.gssw.jd.dao.CommentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");	//设置请求的编码，保证获取中文有效；
	
	String op=request.getParameter("op");
	CommentDao udo=new CommentDaoImpl();
	
	if("del".equals(op)){
		String id=request.getParameter("id");	//获取请求中的参数的值；
		udo.delete(Integer.parseInt(id));
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
	}
	
	if("create".equals(op)){
		
		//获取表单的值
	int  ProId=Integer.parseInt(request.getParameter("ProId"));
		int CustId= Integer.parseInt(request.getParameter("CustId"));
		String Content=request.getParameter("Content");
		String CmtTime=request.getParameter("CmtTime");
		
		//封装成实体类对象
		Comment c=new Comment();
		c.setProId(ProId);
		c.setCustId(CustId);
		c.setContent(Content);
		
		
		udo.create(c);
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
		
	}
	
	if("update".equals(op)){
		
		//获取表单的值
		String CmtId=request.getParameter("id");
		int  ProId=Integer.parseInt(request.getParameter("ProId"));
		int CustId= Integer.parseInt(request.getParameter("CustId"));
		String Content=request.getParameter("Content");
		String CmtTime=request.getParameter("CmtTime");
		
		
		//封装成实体类对象
		Comment c=new Comment();
		c.setCmtId(Integer.parseInt(CmtId));
		c.setProId(ProId);
		c.setCustId(CustId);
		c.setContent(Content);
		
		
		udo.update(c);
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
		
	}
	
	
	
	

%>