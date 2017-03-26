package org.apache.jsp.admin.comment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Comment;
import com.gssw.jd.dao.impl.CommentDaoImpl;
import com.gssw.jd.dao.CommentDao;

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
