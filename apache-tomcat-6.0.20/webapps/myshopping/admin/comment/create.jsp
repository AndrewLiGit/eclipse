<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增评论</title>
<style type="text/css">
*{ margin:0; padding:0; }
table tr { height:50px; }
table tr td { width:500px; padding:5px; }
table tr td.t1 { width:100px; text-align:right; }
table tr td input,select { width:200px; height:25px; }
table tr td input.rdo1 { width:30px; }
table tr td input.sub1 { width:50px; }
table tr td textarea { width:300px; height:150px; text-align:left; }
.error1 { background-color:#936; color:#FFF; border:1px solid #F00; }
</style>
</head>
<body>
	<h1>新增评论</h1>
	<div id="inputForm">
		<form id="CommentForm" method="post" action="do.jsp">
		<input type="hidden" name="op" value="create">
        <table cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td class="t1">商品编号</td>
                <td>
                	<input type="text" id="ProId" name="ProId">
                </td>
            </tr>
             <tr>
            	<td class="t1">客户编号</td>
                <td><input type="text" id="CustId" name="CustId"></td>
            </tr>
             <tr>
            	<td class="t1">评论内容</td>
                <td>
                	<input type="text" id="Content" name="Content">
                </td>
            </tr>
            
            <tr>
            	<td class="t1">评论时间</td>
                <td>
                	<input type="text" id="CmtTime" name="CmtTime">
                </td>
            </tr>
            
            
            
             <tr>
            	<td></td>
                <td>
                	<input class="sub1" type="submit" value="保存">
               		<input class="sub1" type="button" value="取消" onclick="history.go(-1);">
               	</td>
            </tr>
        </table>
   	</form>
	</div>
</body>
</html>