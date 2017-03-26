<%@page import="com.gssw.jd.pojo.Product"%>
<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	request.setCharacterEncoding("UTF-8");

	String op=request.getParameter("op");
	ProductDao pdao=new ProductDaoImpl();

	if("create".equals(op)){
		
		String proName=request.getParameter("proName");
		String proPrice=request.getParameter("proPrice");
		
		System.out.print("test："+proPrice);
		
		String proAmount=request.getParameter("proAmount");
		String proImage=request.getParameter("proImage");
		String proTypeId=request.getParameter("proTypeId");
		String proDesc=request.getParameter("proDesc");
		
		//服务器验证
		
		//封装实体对象
		Product p=new Product();
		p.setProName(proName);
		p.setProPrice(Double.parseDouble(proPrice));
		p.setProAmout(Integer.parseInt(proAmount));
		p.setProImage(proImage);
		p.setProDesc(proDesc);
		p.setTypeId(Integer.parseInt(proTypeId));
		
		
		pdao.create(p);
		response.sendRedirect("list.jsp");
		return;
	}
	
	if("update".equals(op)){
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		String proPrice=request.getParameter("proPrice");
		String proAmount=request.getParameter("proAmount");
		String proImage=request.getParameter("proImage");
		String proTypeId=request.getParameter("proTypeId");
		String proDesc=request.getParameter("proDesc");
		
		//服务器验证
		
		//封装实体对象
		Product p=new Product();
		p.setProId(Integer.parseInt(proId));
		p.setProName(proName);
		p.setProPrice(Double.parseDouble(proPrice));
		p.setProAmout(Integer.parseInt(proAmount));
		p.setProImage(proImage);
		p.setProDesc(proDesc);
		p.setTypeId(Integer.parseInt(proTypeId));
		
		
		pdao.update(p);
		response.sendRedirect("list.jsp");
		return;
	}

%>
