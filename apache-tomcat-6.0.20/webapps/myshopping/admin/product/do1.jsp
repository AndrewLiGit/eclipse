<%@page import="com.gssw.jd.pojo.Product"%>
<%@page import="com.gssw.jd.dao.impl.ProductDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//处理请求乱码
	request.setCharacterEncoding("UTF-8");

	String op = request.getParameter("op");

	ProductDao pdao = new ProductDaoImpl();

	//String proName = request.getParameter("proName");

	//新增商品类型
	if ("create".equals(op)) {
		String proName = request.getParameter("proName");
		Double proPrice = Double.parseDouble(request
				.getParameter("proPrice"));
		int typeName = Integer.parseInt(request
				.getParameter("typeName"));
		String proDesc = request.getParameter("proDesc");
		String proImage = request.getParameter("proImage");
		int proAmout = Integer.parseInt(request
				.getParameter("proAmout"));

		Product p = new Product();
		p.setProName(proName);
		p.setTypeId(typeName);
		p.setProPrice(proPrice);
		p.setProDesc(proDesc);
		p.setProImage(proImage);
		p.setProAmout(proAmout);

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
		String proName = request.getParameter("proName");
		Double proPrice = Double.parseDouble(request
				.getParameter("proPrice"));
		int typeName = Integer.parseInt(request
				.getParameter("typeName"));
		String proDesc = request.getParameter("proDesc");
		String proImage = request.getParameter("proImage");
		int proAmout = Integer.parseInt(request
				.getParameter("proAmout"));

		Product p = new Product();
		p.setProName(proName);
		p.setTypeId(typeName);
		p.setProPrice(proPrice);
		p.setProDesc(proDesc);
		p.setProImage(proImage);
		p.setProAmout(proAmout);

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

		p.setProId(Integer.parseInt(id));

		//调用数据访问层执行操作

		int result = pdao.update(p);

		//页面响应(重定向/转发)
		response.sendRedirect("list.jsp");
		return;
	}
%>
