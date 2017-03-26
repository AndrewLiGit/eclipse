package org.apache.jsp.ueditor.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Properties;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.io.FileInputStream;
import ueditor.Uploader;

public final class imageUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("    \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            ");


request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");

//加载配置文件
Properties pro = new Properties();
String propertiesPath = request.getRealPath("/ueditor/jsp/config.properties");
Properties properties = new Properties();

try {
    properties.load( new FileInputStream( propertiesPath ) );
} catch ( Exception e ) {
    //加载失败的处理
    e.printStackTrace();
}

List<String> savePath = Arrays.asList( properties.getProperty("savePath").split( "," ) );


//获取存储目录结构
if ( request.getParameter( "fetch" ) != null ) {

    response.setHeader( "Content-Type", "text/javascript" );

    //构造json数据
    Iterator<String> iterator = savePath.iterator();

    String dirs = "[";
    while ( iterator.hasNext() ) {

        dirs += "'" + iterator.next() +"'";

        if ( iterator.hasNext() ) {
            dirs += ",";
        }

    }
    dirs += "]";
    response.getWriter().print( "updateSavePath( "+ dirs +" );" );
    return;

}

Uploader up = new Uploader(request);

//获取前端提交的path路径
String dir = request.getParameter( "dir" );

//普通请求中拿不到参数， 则从上传表单中拿
if ( dir == null ) {
	dir = up.getParameter("dir");
}

if ( dir == null || "".equals( dir ) ) {

    //赋予默认值
    dir = savePath.get( 0 );

    //安全验证
} else if ( !savePath.contains( dir ) ) {

    response.getWriter().print( "{'state':'\\u975e\\u6cd5\\u4e0a\\u4f20\\u76ee\\u5f55'}" );
    return;

}

up.setSavePath( dir );
String[] fileType = {".gif" , ".png" , ".jpg" , ".jpeg" , ".bmp"};
up.setAllowFiles(fileType);
up.setMaxSize(10000); //单位KB
up.upload();
response.getWriter().print("{'original':'"+up.getOriginalName()+"','url':'"+up.getUrl()+"','title':'"+up.getTitle()+"','state':'"+up.getState()+"'}");

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
