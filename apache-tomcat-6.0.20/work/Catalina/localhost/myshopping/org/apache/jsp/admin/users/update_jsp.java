package org.apache.jsp.admin.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Users;
import com.gssw.jd.dao.impl.UsersDaoImpl;
import com.gssw.jd.dao.UsersDao;

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

	String id = request.getParameter("id");
	UsersDao pdao = new UsersDaoImpl();
	Users users = pdao.read(Integer.parseInt(id));

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>修改用户</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td.t1 {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td input,select {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td input.sub1 {\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr td textarea {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 150px;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#error {\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tvar form = document.getElementById(\"inputForm\");\r\n");
      out.write("\t\tform.onsubmit = function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar proName = document.getElementById(\"proTypeName\");\r\n");
      out.write("\t\t\tif (proName.value == \"\") {\r\n");
      out.write("\t\t\t\talert(\"商品类型不能为空！\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>修改用户</h1>\r\n");
      out.write("\t<div id=\"error\">\r\n");
      out.write("\t\t");

			Object obj = request.getAttribute("error");
			if (null != obj) {
				out.print(obj);
			}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t<form id=\"inputForm\" method=\"post\" action=\"do.jsp\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"op\" value=\"update\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(users.getUserId());
      out.write("\">\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"t1\">用户名</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userName\" id=\"userName\" value=\"");
      out.print(users.getUserName());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td>...</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"t1\">用户密码</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userPass\" value=\"");
      out.print(users.getUserPass());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td>...</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"t1\">注册时间</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"loginTime\"></td>\r\n");
      out.write("\t\t\t\t\t<td>...</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"t1\">是否为管理员</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"isAdmin\"  >\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">--普通用户--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">管理员</option>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t<td>...</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><input class=\"sub1\" type=\"submit\" value=\"保存\"> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"button\" value=\"取消\" onclick=\"history.go(-1);\"></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
