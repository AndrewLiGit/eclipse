<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理首页</title>
<style type="text/css">
	* { margin:0; padding:0; }
	body { text-align:center; }
	
   div{ background: #CC0000; height:15%; width:auto; }
     div h1{ margin-top:0px;height:50px }
	a { text-decoration:none; background-color:#00F; color:#FFF; padding:2px;  }
	table { font-size:20px; align:center; margin-left:450px; margin-top:160px; border:2px }
	
	table tr td { width:100px; border:2px dotted #999; }
	

	
	table tr td { width:200px;height:40px; } 
	
	table tr:hover { background-color:#00F; color:#FFF; cursor:pointer; }

	

	
</style>
</head>

<body  background="image/3.jpg">
    <div><h1>你正在进行用户注册</h1>
    </div>
	<form method="POST" action="#">
<table>
<tr>
 <td>用户名：</td>
 <td><input type=text name="namae"></td>
</tr>
<tr>
 <td>密码：</td>
 <td><input type=password name="passwd"></td>
</tr>


<tr>
 <td>性别：</td>
 <td>
  <input type=radio name="seibetsu" value="male" checked>男
  <input type=radio name="seibetsu" value="female">女
 </td>
</tr>
 <tr>
<td>邮箱</td>
 <td><input type=text  name="email"></td>
</tr>
<tr>
 <td></td>
 <td>
  <input type=submit value="注册">
  <input type=reset value="取消">
 </td>
</tr>
</table>
</form>
</body>
</html>
