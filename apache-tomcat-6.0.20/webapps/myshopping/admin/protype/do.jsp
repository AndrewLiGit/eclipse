<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	//处理请求乱码
	request.setCharacterEncoding("UTF-8");
	
	String op=request.getParameter("op");
	
	ProTypeDao pdao=new ProTypeDaoImpl();
	
	//新增商品类型
	if("create".equals(op)){
		
		String proTypeName=request.getParameter("proTypeName");
		
		//判断该类型是否存在，如果存在不能添加；
		boolean isValid=pdao.isHasProType(proTypeName);
		if(isValid){
			request.setAttribute("error", "该类型已存在！");
			request.getRequestDispatcher("/admin/protype/create.jsp").forward(request, response);
			return;
		}
		
		
		//将请求的参数封装成实体对象
		ProType p=new ProType();
		p.setTypeName(proTypeName);
		
		//调用数据访问层执行操作
		
		int result=pdao.create(p);
		
		//页面响应(重定向/转发)
		response.sendRedirect("list.jsp");
		return;
	}
	
	//删除商品类型
	if("del".equals(op)){
		String id=request.getParameter("id");
		pdao.delete(Integer.parseInt(id));
		response.sendRedirect("list.jsp");
		return;
	}
	
	//修改商品类型
	if("update".equals(op)){
		
		String id=request.getParameter("id");
		String proTypeName=request.getParameter("proTypeName");
		
		//判断该类型是否存在，如果存在不能添加；
		boolean isValid=pdao.isHasProType(proTypeName);
		if(isValid){
			request.setAttribute("error", "该类型已存在！");
			request.getRequestDispatcher("/admin/protype/update.jsp").forward(request, response);
			return;
		}
		
		
		//将请求的参数封装成实体对象
		ProType p=new ProType();
		p.setTypeId(Integer.parseInt(id));
		p.setTypeName(proTypeName);
		
		//调用数据访问层执行操作
		
		int result=pdao.update(p);
		
		//页面响应(重定向/转发)
		response.sendRedirect("list.jsp");
		return;
	}
	
	


	

%>    
    