package org.apache.jsp.admin.protype;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.ProType;
import com.gssw.jd.dao.impl.ProTypeDaoImpl;
import com.gssw.jd.dao.ProTypeDao;

public final class do_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


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
	
	


	


      out.write("    \r\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
