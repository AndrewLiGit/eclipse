package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Product;
import java.util.List;
import com.gssw.jd.dao.impl.ProductDaoImpl;
import com.gssw.jd.dao.ProductDao;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//获取首页显示的商品信息列表
	ProductDao pdao=new ProductDaoImpl();
	List<Product> list=pdao.read(1, 8);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>XXX网站</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/layout.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("        \t<!-- logo -->\r\n");
      out.write("           \t<div id=\"logo\">logo层</div>\r\n");
      out.write("            <!-- login -->\r\n");
      out.write("            <div id=\"login\">\r\n");
      out.write("            \t<div id=\"login_input\">\r\n");
      out.write("                \t<form method=\"post\" action=\"#\">\r\n");
      out.write("                    \t<label>用户名</label>\r\n");
      out.write("                        <input type=\"text\" name=\"userName\">\r\n");
      out.write("                        <label>密码</label>\r\n");
      out.write("                        <input type=\"password\" name=\"userPass\">\r\n");
      out.write("                        <input type=\"submit\" value=\"登录\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"login_success\">\r\n");
      out.write("                \t欢迎你：?<a href=\"#\">退出</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"adv1\">\r\n");
      out.write("           2014世界500强完整榜单 <br/> \r\n");
      out.write("                      广电总局如何整顿电视：限剧限娱限丑 <br/>\r\n");
      out.write("    \r\n");
      out.write("                       央视湖南卫视上广集团三家网站的未来命运？<br/>\r\n");
      out.write("                       新店开张，宜家豪气宣传：这辆地铁我包了！<br/>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"center\">\r\n");
      out.write("        \t<div id=\"prolist\">\r\n");
      out.write("        \t\t");
 for(Product p:list){ 
      out.write("\r\n");
      out.write("        \t\t\t<dl>\r\n");
      out.write("\t                \t<dt>\r\n");
      out.write("\t                    \t<img src=\"");
      out.print( p.getProImage()==null?"images/default1.png":p.getProImage() );
      out.write("\" width=\"100\" height=\"100\">\r\n");
      out.write("\t                    </dt>\r\n");
      out.write("\t                    <dd>\r\n");
      out.write("\t                    \t<ul>\r\n");
      out.write("\t                        \t<li>");
      out.print( p.getProName() );
      out.write("</li>\r\n");
      out.write("\t                            <li>&yen;");
      out.print( p.getProPrice() );
      out.write("</li>\r\n");
      out.write("\t                            <li>\r\n");
      out.write("\t                            \t<a title=\"查看详情\" href=\"detail.jsp?id=");
      out.print( p.getProId() );
      out.write("\"></a>\r\n");
      out.write("\t                                <a title=\"放入购物车\" href=\"#\"></a>\r\n");
      out.write("\t                            </li>\r\n");
      out.write("\t                        </ul>\r\n");
      out.write("\t                    </dd>\r\n");
      out.write("\t                </dl>\r\n");
      out.write("        \t\t");
 } 
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"comments\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer\">footer</div>\r\n");
      out.write("    </div>\r\n");
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
