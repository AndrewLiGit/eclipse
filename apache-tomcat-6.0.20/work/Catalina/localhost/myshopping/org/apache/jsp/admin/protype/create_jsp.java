package org.apache.jsp.admin.protype;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>新增商品类型</title>\r\n");
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
      out.write("\twindow.onload=function(){\r\n");
      out.write("\t\tvar form=document.getElementById(\"inputForm\");\r\n");
      out.write("\t\tform.onsubmit=function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar proName=document.getElementById(\"productName\");\r\n");
      out.write("\t\t\tif(proName.value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"商品类型不能为空！\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>新增商品类型</h1>\r\n");
      out.write("\t<div id=\"error\">\r\n");
      out.write("\t\t");

			Object obj=request.getAttribute("error");
			if(null!=obj){
				out.print(obj);
			}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"input\">\r\n");
      out.write("\t\t<form id=\"inputForm\" method=\"post\" action=\"do.jsp\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"op\" value=\"create\">\r\n");
      out.write("\t\t\t<label>商品类型</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"proTypeName\" name=\"proTypeName\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"保存\"> \r\n");
      out.write("\t\t\t<input type=\"button\" value=\"取消\" onclick=\"history.go(-1);\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
