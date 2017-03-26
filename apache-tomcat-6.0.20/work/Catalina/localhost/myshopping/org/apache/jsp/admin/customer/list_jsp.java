package org.apache.jsp.admin.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.gssw.jd.pojo.Customer;
import java.util.List;
import com.gssw.jd.dao.impl.CustomerDaoImpl;
import com.gssw.jd.dao.CustomerDao;

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

	CustomerDao pDao=new CustomerDaoImpl();

int pageSize=5;
int recordCount=pDao.total();
int pageCount=(int)Math.ceil((double)recordCount/pageSize);

int pageNo=1;	//页码

String pno=request.getParameter("pno");		//接收分页的页码参数

if(null!=pno){
	pageNo=Integer.parseInt(pno);
}

List<Customer> list=pDao.read(pageNo, pageSize);
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>客户列表</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\ta.noclick {color:#c0c0c0; background-color: #FFFFFF; }\r\n");
      out.write("\t\r\n");
      out.write("\ta { text-decoration:none; background-color:#00F; color:#FFF; padding:2px;  }\r\n");
      out.write("\ttable { font-size:12px; margin-top:5px; }\r\n");
      out.write("\t\r\n");
      out.write("\ttable tr td { width:100px; border:1px dotted #999; }\r\n");
      out.write("\t\r\n");
      out.write("\ttable tr td a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px; }\r\n");
      out.write("\t\r\n");
      out.write("\ttable tr td.w1 { width:200px; } \r\n");
      out.write("\ttable tr { height:30px;  }\r\n");
      out.write("\ttable tr:hover { background-color:#00F; color:#FFF; cursor:pointer; }\r\n");
      out.write("\r\n");
      out.write("\ttable tr.t1 { height:50px; text-align:center; background-color:#666; color:#FFF; }\r\n");
      out.write("\t\r\n");
      out.write("\ttable tr.t1:hover { background-color:#666;  color:#FFF;  }\r\n");
      out.write("\t\r\n");
      out.write("\t#pager span label { background-color:#00F; color:#FFF;   }\r\n");
      out.write("\t#pager input { width:70px; height: 20px; }\r\n");
      out.write("\t#pager input.btn { width:40px; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"ctl\"><a title=\"新增客户\" href=\"create.jsp\">新增客户</a></div>\r\n");
      out.write("\t<div id=\"data\">\r\n");
      out.write("\t");
 if(null!=list&&list.size()>0) { 
      out.write("\r\n");
      out.write("\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("      <tr class=\"t1\">\r\n");
      out.write("        <td>客户编号</td>\r\n");
      out.write("        <td>客户名称</td>\r\n");
      out.write("        <td>密码</td>\r\n");
      out.write("         <td>客户余额</td>\r\n");
      out.write("        <td>客户注册时间</td>\r\n");
      out.write("       \r\n");
      out.write("        <td>基本操作</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      ");

      	for(Customer c:list){
      
      out.write("\r\n");
      out.write("      \t<tr>\r\n");
      out.write("\t        <td>");
      out.print( c.getCustId() );
      out.write("</td>\r\n");
      out.write("\t        <td>");
      out.print( c.getCustName() );
      out.write("</td>\r\n");
      out.write("\t        <td>");
      out.print( c.getCustPass() );
      out.write("</td>\r\n");
      out.write("\t        <td>");
      out.print( c.getCustMoney() );
      out.write("</td>\r\n");
      out.write("\t        <td>");
      out.print( c.getCustLoginTime() );
      out.write("</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("\t        \t<a href=\"update.jsp?id=");
      out.print( c.getCustId() );
      out.write("\">修改</a>\r\n");
      out.write("\t            <a onclick=\"return confirm('真的要删除吗？');\" href=\"do.jsp?op=del&id=");
      out.print( c.getCustId() );
      out.write("\">删除</a>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("      \r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("</table>\r\n");
      out.write(" <div id=\"pager\">\r\n");
      out.write(" \r\n");
      out.write(" \t");
 if(pageNo==1) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"noclick\">第一页</a>\r\n");
      out.write("\t\t\t\t<a class=\"noclick\">上一页</a>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pno=1\">第一页</a>\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pno=");
      out.print( pageNo-1  );
      out.write("\" >上一页</a>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 if(pageNo==pageCount) { 
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"noclick\">下一页</a>\r\n");
      out.write("\t\t\t\t<a class=\"noclick\">最后一页</a>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pno=");
      out.print( pageNo+1  );
      out.write("\" >下一页</a>\r\n");
      out.write("\t\t\t\t<a href=\"list.jsp?pno=");
      out.print( pageCount  );
      out.write("\" >最后一页</a>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<span>每页<label>");
      out.print( pageSize );
      out.write("</label>记录/共<label>");
      out.print( recordCount );
      out.write("</label>记录</span>\r\n");
      out.write("\t\t\t<span>第<label>");
      out.print( pageNo );
      out.write("</label>页/共<label>");
      out.print( pageCount );
      out.write("</label>页</span>\r\n");
      out.write("\t\t\t跳转到<input type=\"text\" id=\"topager\" name=\"topager\">\r\n");
      out.write("\t\t\t<input class=\"btn\" type=\"button\" id=\"btnGo\" name=\"btnGo\" value=\"GO\">\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tvar btnGo=document.getElementById(\"btnGo\");\r\n");
      out.write("\t\t\t\tbtnGo.onclick=function(){\r\n");
      out.write("\t\t\t\t\tvar pno=document.getElementById(\"topager\");\r\n");
      out.write("\t\t\t\t\tif(pno.value==\"\"||isNaN(pno.value)){\r\n");
      out.write("\t\t\t\t\t\talert(\"请输入正确的页码数字\");\r\n");
      out.write("\t\t\t\t\t\tpno.focus();\r\n");
      out.write("\t\t\t\t\t\tpno.select();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//处理页码范围\r\n");
      out.write("\t\t\t\t\tvar _pno=");
      out.print( pageNo );
      out.write(";\r\n");
      out.write("\t\t\t\t\tvar _pcount=");
      out.print(pageCount );
      out.write(";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar _no=pno.value;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(_no<_pno){\r\n");
      out.write("\t\t\t\t\t\t_no=1;\r\n");
      out.write("\t\t\t\t\t} else if(_no>_pcount){\r\n");
      out.write("\t\t\t\t\t\t_no=_pcount;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"list.jsp?pno=\"+_no;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" </div>\r\n");
      out.write(" \r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t没有任何商品类型信息，请点击新增添加类型。\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
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
