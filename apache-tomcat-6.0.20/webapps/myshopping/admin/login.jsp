
<%@page import="com.gssw.jd.pojo.Users"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.dao.impl.UsersDaoImpl"%>
<%@page import="com.gssw.jd.dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录</title>
<style type="text/css">
	
	* { margin:0; padding:0; }
	table { margin-left:500px; margin-top:160px}
		
	table tr { height:20px; }
	table tr td.t2 { width:100px; padding:5px; text-align:right }
	table tr td.t1 { text-align:right; color:#990000; }
  

	table tr td input,select { width:200px; height:25px; }
	table tr td input.sub1 { width:50px; }
	
	table tr td textarea { width:300px; height:150px; text-align:left; }

</style>
<%	UsersDao pDao=new UsersDaoImpl();
List<Users> list=pDao.read(); %>
<script type="text/javascript">
	
	//验证商品名称是否有效
	function validUserName(){
		//客户端验证；
		var uName=document.getElementById("UserName");
	     	if(uName.value==""){
			alert("用户名不能为空");
			return false;
	
	}
	
		return true;
	}
		function validUserPass(){
		//客户端验证；
		var uPass=document.getElementById("UserPass");
	     	if(uPass.value==""){
			alert("密码不能为空");
			return false;
	
	}
	
		return true;
	}
	
	function loginCheck(){
		//客户端验证；
		var uName=document.getElementById("UserName");
		var uPass=document.getElementById("UserPass");
		var k=0;
	     	if(uName.value!="admin"|uPass.value!="111"){
			alert("用户名或密码错误");
			return false;
			} 
		
	
	}
	
	
	window.onload=function(){
		
		var form=document.getElementById("logform");
		form.onsubmit=function(){
			return validUserName()&&validUserPass()&&loginCheck( );
			
				
		}
		                    }; 
	</script>
	
</head>




<body     background="image/3.jpg">


	<form method="post" action="index.jsp" id="logform">
        <table width="350" height="204" border="0" cellpadding="0" cellspacing="0" ; background="image/login.jpg">
       
	  
             <tr>
            	<td width="75" height="65" class="t1">用户姓名</td>
                <td width="246" class="t2" ><input type="text" name="userName" id="UserName"></td>
                <td >...</td>
            </tr>
             <tr>
            	<td height="44" class="t1">客户密码</td>
                <td class="t2"><input type="password";  name="ProName" id="UserPass"></td>
                <td >...</td>
            </tr>
          
           
            
          
             <tr>
            	<td height="95"></td>
                <td class="t2"><input name="submit" type="submit" class="sub1" value="登录"   ></td>
                <td></td> 
        
      </table>
   	    <h6 class="sub1">&nbsp;</h6>
	</form>

	
</body>
</html>
