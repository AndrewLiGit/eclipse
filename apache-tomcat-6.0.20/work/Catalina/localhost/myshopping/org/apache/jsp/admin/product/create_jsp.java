package org.apache.jsp.admin.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.ProType;
import java.util.List;
import com.gssw.jd.dao.impl.ProTypeDaoImpl;
import com.gssw.jd.dao.ProTypeDao;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//获取所有商品类型供选择使用；
	ProTypeDao tDao=new ProTypeDaoImpl();
	List<ProType> typelist=tDao.read();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>新增商品</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/form.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"../../ueditor/ueditor.config.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"../../ueditor/ueditor.all.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar editorImage;\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction render_insertImage(){\r\n");
      out.write("\t\t\teditorImage=UE.getEditor(\"upload_ue\");\r\n");
      out.write("\t\t\teditorImage.ready(function(){\r\n");
      out.write("\t\t\t\teditorImage.setDisabled();\r\n");
      out.write("\t\t\t\teditorImage.hide();\r\n");
      out.write("\t\t\t\teditorImage.addListener('beforeInsertImage',function(t,arg){\r\n");
      out.write("\t\t\t\t\tvar mypic=document.getElementById(\"ProImage\");\r\n");
      out.write("\t\t\t\t\tmypic.value=arg[0].src;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction upImage(){\r\n");
      out.write("\t\t\tvar d=editorImage.getDialog(\"insertimage\");\r\n");
      out.write("\t\t\td.open();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.onload=function(){\r\n");
      out.write("\t\t\trender_insertImage();\r\n");
      out.write("\t\t\tvar btn=document.getElementById(\"btnProImage\");\r\n");
      out.write("\t\t\tbtn.onclick=function(){\r\n");
      out.write("\t\t\t\tupImage();\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t} \r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"title\">\r\n");
      out.write("\t\t<h1>新增商品</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"error\"></div>\r\n");
      out.write("\t<div id=\"input\">\r\n");
      out.write("\t\t<form id=\"productform\" method=\"post\" action=\"do.jsp\">\r\n");
      out.write("        <input type=\"hidden\" name=\"op\" value=\"create\">\r\n");
      out.write("        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品名称</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<input type=\"text\" id=\"ProName\" name=\"proName\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品单价</td>\r\n");
      out.write("                <td><input type=\"text\" id=\"ProPrice\" name=\"proPrice\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品库存</td>\r\n");
      out.write("                <td><input type=\"text\" name=\"proAmount\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品分类</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<select id=\"ProTypeId\" name=\"proTypeId\">\r\n");
      out.write("                \t\t<option value=\"0\">--请选择商品类型--</option>\r\n");
      out.write("                        ");
 for(ProType t:typelist){ 
      out.write("\r\n");
      out.write("                        \t<option value=\"");
      out.print( t.getTypeId() );
      out.write('"');
      out.write('>');
      out.print( t.getTypeName() );
      out.write("</option>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                \t</select>\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品图片</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<script type=\"text/plain\" id=\"upload_ue\"></script>\r\n");
      out.write("                \t<input type=\"text\" id=\"ProImage\" name=\"proImage\">\r\n");
      out.write("                \t<input type=\"button\" class=\"subauto\" id=\"btnProImage\" value=\"选择商品图片\">\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td class=\"t1\">商品描述</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<script id=\"editor\" name=\"proDesc\" type=\"text/plain\" style=\"width:500px;height:300px;\"></script>\r\n");
      out.write("                \t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t    \tvar ue = UE.getEditor(\"editor\",{\r\n");
      out.write("\t\t\t\t    \t\t\ttoolbars:[[\"source\",\"undo\",\"redo\",\"insertunorderedlist\",\"insertimage\",\"time\",\"date\",\"emotion\"]],\r\n");
      out.write("\t\t\t\t    \t\t\tinitialContent: \"\"});\r\n");
      out.write("\t    \t\t\t</script>\t\r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("             <tr>\r\n");
      out.write("            \t<td></td>\r\n");
      out.write("                <td><input class=\"sub1\" type=\"submit\" value=\"保存\"></td>\r\n");
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
