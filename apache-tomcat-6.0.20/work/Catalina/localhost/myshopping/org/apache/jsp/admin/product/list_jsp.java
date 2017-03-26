package org.apache.jsp.admin.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Product;
import java.util.List;
import com.gssw.jd.util.Pager;
import com.gssw.jd.dao.impl.ProductDaoImpl;
import com.gssw.jd.dao.ProductDao;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	ProductDao pdao=new ProductDaoImpl();
	Pager pager=new Pager();	

	int recordCount=pdao.total();
	pager.setRecordCount(recordCount);
	
	String pno=request.getParameter("p");
	pager.setPageNo(pno);
	
	pager.setUrl("list.jsp");
	
	List<Product> list=pdao.read(pager.getPageNo(), pager.getPageSize());


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>商品列表</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/table.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/pager.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"ctl\">\r\n");
      out.write("\t\t<h1>商品管理</h1>\r\n");
      out.write("\t\t<a href=\"create.jsp\">新增商品</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"data\">\r\n");
      out.write("\t\t");
 if(null==list||list.size()==0) { 
      out.write("\r\n");
      out.write("\t\t\t没有任何商品信息，请点击新增创建商品。\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t      <tr class=\"t1\">\r\n");
      out.write("\t\t        <td>商品编号</td>\r\n");
      out.write("\t\t        <td>商品名称</td>\r\n");
      out.write("\t\t        <td>所属类型</td>\r\n");
      out.write("\t\t        <td>价格</td>\r\n");
      out.write("\t\t        <td>图片</td>\r\n");
      out.write("\t\t        <td>库存</td>\r\n");
      out.write("\t\t        <td>基本操作</td>\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("\t\t      ");

		      	for(Product p:list){
		      
      out.write("\r\n");
      out.write("\t\t      \t <tr>\r\n");
      out.write("\t\t\t        <td>");
      out.print( p.getProId() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print( p.getProName() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print( p.getTypeName() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print( p.getProPrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td><img width=\"100px\" height=\"50px\" alt=\"\" src=\"");
      out.print( p.getProImage() );
      out.write("\"></td>\r\n");
      out.write("\t\t\t        <td>");
      out.print( p.getProAmout() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>\r\n");
      out.write("\t\t\t        \t<a href=\"update.jsp?id=");
      out.print( p.getProId() );
      out.write("\">修改</a>\r\n");
      out.write("\t\t\t            <a href=\"#\">删除</a>\r\n");
      out.write("\t\t\t        </td>\r\n");
      out.write("\t\t\t      </tr>\t\t\t\r\n");
      out.write("\t\t      ");
 } 
      out.write("\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"pager\" class=\"paging\">");
      out.print( pager.getHtml() );
      out.write("</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
