package org.apache.jsp.admin.comment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.dao.impl.CommentDaoImpl;
import com.gssw.jd.dao.CommentDao;
import com.gssw.jd.pojo.Comment;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String id=request.getParameter("id");
	CommentDao udo=new CommentDaoImpl();
	Comment c=udo.read(Integer.parseInt(id));

      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>修改评论</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*{ margin:0; padding:0; }\r\n");
      out.write("table tr { height:50px; }\r\n");
      out.write("table tr td { width:500px; padding:5px; }\r\n");
      out.write("table tr td.t1 { width:100px; text-align:right; }\r\n");
      out.write("table tr td input,select { width:200px; height:25px; }\r\n");
      out.write("table tr td input.rdo1 { width:30px; }\r\n");
      out.write("table tr td input.sub1 { width:50px; }\r\n");
      out.write("table tr td textarea { width:300px; height:150px; text-align:left; }\r\n");
      out.write(".error1 { background-color:#936; color:#FFF; border:1px solid #F00; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>修改评论</h1>\r\n");
      out.write("\t<div id=\"inputForm\">\r\n");
      out.write("\t\t<form id=\"CommentForm\" method=\"post\" action=\"do.jsp\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"op\" value=\"update\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print( c.getCmtId() );
      out.write("\">\r\n");
      out.write("        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品编号</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<input type=\"text\" id=\"ProId\" name=\"ProId\" value=\"");
      out.print( c.getProId() );
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">客户编号</td>\r\n");
      out.write("                <td><input type=\"text\" id=\"CustId\" name=\"CustId\" value=\"");
      out.print( c.getCustId() );
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">评论内容</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<input type=\"text\" id=\"Content\" name=\"Content\" value=\"");
      out.print( c.getContent() );
      out.write("\">\r\n");
      out.write("                \t\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<input class=\"sub1\" type=\"submit\" value=\"保存\">\r\n");
      out.write("                \t<input class=\"sub1\" type=\"button\" value=\"取消\" onclick=\"history.go(-1);\">\t\r\n");
      out.write("                </td>\r\n");
      out.write("            \r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("   \t</form>\r\n");
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
