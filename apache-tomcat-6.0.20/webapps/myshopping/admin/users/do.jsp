<%@page import="com.gssw.jd.pojo.Users"%>
<%@page import="com.gssw.jd.dao.impl.UsersDaoImpl"%>
<%@page import="com.gssw.jd.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//处理请求乱码
	request.setCharacterEncoding("UTF-8");

	String op = request.getParameter("op");

UsersDao pdao = new UsersDaoImpl();

	//String proName = request.getParameter("proName");

	//新增商品类型
	if ("create".equals(op)) {
		String userName = request.getParameter("userName");
	
		
		String userPass = request.getParameter("userPass");
		
		int isAdmin = Integer.parseInt(request
				.getParameter("isAdmin"));

	Users p = new Users();
		p.setUserName(userName);
		p.setUserPass(userPass);
		p.setIsAdmin(isAdmin);
	

		//判断该类型是否存在，如果存在不能添加；
	/* 	boolean isValid = pdao.isHasProName(proName);
		if (isValid) {
			request.setAttribute("error", "该类型已存在！");
			request.getRequestDispatcher("/admin/product/create.jsp")
					.forward(request, response);
			return;
		} */

		//将请求的参数封装成实体对象

		//调用数据访问层执行操作

		int result = pdao.create(p);

		//页面响应(重定向/转发)
		response.sendRedirect("list.jsp");
		return;
	}

	//删除商品类型
	if ("del".equals(op)) {
		String id = request.getParameter("id");
		pdao.delete(Integer.parseInt(id));
		response.sendRedirect("list.jsp");
		return;
	}

	//修改商品类型
	if ("update".equals(op)) {
String userName = request.getParameter("userName");
	
		
		String userPass = request.getParameter("userPass");
		
		int isAdmin = Integer.parseInt(request
				.getParameter("isAdmin"));

		Users p = new Users();
		p.setUserName(userName);
		p.setUserPass(userPass);
		p.setIsAdmin(isAdmin);
		

		String id = request.getParameter("id");
		//判断该类型是否存在，如果存在不能添加；
		/* boolean isValid = pdao.isHasProName(proName,1);
		if (isValid&&p.getProName()!="") {
			request.setAttribute("error", "该商品已存在！");
			request.getRequestDispatcher("/admin/product/update.jsp")
					.forward(request, response);
			return;
		} */

		//将请求的参数封装成实体对象

		p.setUserId(Integer.parseInt(id));

		//调用数据访问层执行操作

		int result = pdao.update(p);

		//页面响应(重定向/转发)
		response.sendRedirect("list.jsp");
		return;
	}
%>
