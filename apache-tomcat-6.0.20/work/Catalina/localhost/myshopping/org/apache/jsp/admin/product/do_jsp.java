package org.apache.jsp.admin.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Product;
import com.gssw.jd.dao.impl.ProductDaoImpl;
import com.gssw.jd.dao.ProductDao;

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
      out.write("    \r\n");
      out.write("\r\n");

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


      out.write('\r');
      out.write('\n');
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
