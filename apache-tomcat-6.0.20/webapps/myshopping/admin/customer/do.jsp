<%@page import="com.gssw.jd.pojo.Customer"%>
<%@page import="com.gssw.jd.dao.impl.CustomerDaoImpl"%>
<%@page import="com.gssw.jd.dao.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");	//设置请求的编码，保证获取中文有效；
	
	String op=request.getParameter("op");
	CustomerDao udo=new CustomerDaoImpl();
	
	if("del".equals(op)){
		String id=request.getParameter("id");	//获取请求中的参数的值；
		udo.delete(Integer.parseInt(id));
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
	}
	
	if("create".equals(op)){
		
		//获取表单的值
		String CustName=request.getParameter("CustName");
		String LoginPass=request.getParameter("CustPass");
		String CustMoney=request.getParameter("CustMoney");
		
		//封装成实体类对象
		Customer c=new Customer();
		c.setCustName(CustName);
		c.setCustPass(LoginPass);
	
		c.setCustMoney(Double.parseDouble(request.getParameter("CustMoney")));
		
		udo.create(c);
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
		
	}
	
	if("update".equals(op)){
		
		//获取表单的值
		String CustId=request.getParameter("CustId");
		String CustName=request.getParameter("CustName");
		String CustPass=request.getParameter("CustPass");
		String CustMoney=request.getParameter("CustMoney");
		
		//封装成实体类对象
		Customer c=new Customer();
		c.setCustId(Integer.parseInt(CustId));
		c.setCustName(CustName);
		c.setCustPass(CustPass);
		c.setCustMoney(Double.parseDouble(request.getParameter("CustMoney")));
		
		udo.update(c);
		response.sendRedirect("list.jsp");	//响应：重新定向；
		return;
		
	}
	
	
	
	

%>