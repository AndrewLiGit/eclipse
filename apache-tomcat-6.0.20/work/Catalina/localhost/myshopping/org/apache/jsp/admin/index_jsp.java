package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head >\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>后台系统</title>\r\n");
      out.write("<style type=\"text/css\" >\r\n");
      out.write("* { margin:0; padding:0; }\r\n");
      out.write("\tbody { text-align:center; }\r\n");
      out.write("\r\n");
      out.write("#continer { background:#000000; height:800px; width:auto }\r\n");
      out.write("#header { background: #CC0000; height:10%; width:auto;}\r\n");
      out.write("\r\n");
      out.write("#main {  height:90%;  overflow: hidden;border:1px solid #F00; }\r\n");
      out.write("#mavigater { float:left; width:20%; height:100%; background-color:#FFFF00 }\r\n");
      out.write("#content { float:left;  width:80%;height:100%; background: #CCCCCC}\r\n");
      out.write(".ul1 { margin-top:10px; }\r\n");
      out.write("\t.ul1 li { height:40px; border:2px ridge  #CCCCCC; margin:2px; line-height:40px;  }\r\n");
      out.write("\t  \r\n");
      out.write("\t.ul1 li:hover { background:#00FF00     }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("window.onload=function(){\r\n");
      out.write("var uName =document.getElementById(\"UserName\");\r\n");
      out.write("alert(\"欢迎你进入后台管理系统\");\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head >\r\n");
      out.write("<body >\r\n");
      out.write("<div id=\"continer\"  >\r\n");
      out.write("  <div id=\"header\" ><h1>欢迎进入后台管理系统</h1></div>\r\n");
      out.write("  <div id=\"main\">\r\n");
      out.write("    <div id=\"mavigater\" >\r\n");
      out.write("  <h1>我的权限 </h1>\r\n");
      out.write("  <ul class=\"ul1\">\r\n");
      out.write("   <li  ><a href=\"product/list.jsp\" target=\"frameid\"> 产品管理</a></li>\r\n");
      out.write("   <li ><a href=\"users/list.jsp\" target=\"frameid\">用户管理</a></li>\r\n");
      out.write("    <li ><a href=\"comment/list.jsp\" target=\"frameid\">评论管理</a></li>\r\n");
      out.write("   <li  ><a href=\"customer/list.jsp\" target=\"frameid\">客户管理</a></li>\r\n");
      out.write("   <li ><a href=\"protype/list.jsp\" target=\"frameid\">商品类型</a></li>\r\n");
      out.write("   \r\n");
      out.write("  </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"content\" >\r\n");
      out.write("    <iframe s   frameborder=\"0\"   height=\"100%\" width=\"100%\" name=\"frameid\"> </iframe>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
