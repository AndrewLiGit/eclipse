<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head >
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>后台系统</title>
<style type="text/css" >
* { margin:0; padding:0; }
	body { text-align:center; }

#continer { background:#000000; height:800px; width:auto }
#header { background: #CC0000; height:10%; width:auto;}

#main {  height:90%;  overflow: hidden;border:1px solid #F00; }
#mavigater { float:left; width:20%; height:100%; background-color:#FFFF00 }
#content { float:left;  width:80%;height:100%; background: #CCCCCC}
.ul1 { margin-top:10px; }
	.ul1 li { height:40px; border:2px ridge  #CCCCCC; margin:2px; line-height:40px;  }
	  
	.ul1 li:hover { background:#00FF00     }

</style>
<script type="text/javascript">


window.onload=function(){
var uName =document.getElementById("UserName");
alert("欢迎你进入后台管理系统");
};
</script>
		





</head >
<body >
<div id="continer"  >
  <div id="header" ><h1>欢迎进入后台管理系统</h1></div>
  <div id="main">
    <div id="mavigater" >
  <h1>我的权限 </h1>
  <ul class="ul1">
   <li  ><a href="product/list.jsp" target="frameid"> 产品管理</a></li>
   <li ><a href="users/list.jsp" target="frameid">用户管理</a></li>
    <li ><a href="comment/list.jsp" target="frameid">评论管理</a></li>
   <li  ><a href="customer/list.jsp" target="frameid">客户管理</a></li>
   <li ><a href="protype/list.jsp" target="frameid">商品类型</a></li>
   
  </ul>
  </div>
  <div id="content" >
    <iframe s   frameborder="0"   height="100%" width="100%" name="frameid"> </iframe>
  </div>
  
  </div>
  
</div>
   



</body>
</html>

