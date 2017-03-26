<%@page import="com.gssw.jd.pojo.ProType"%>
<%@page import="java.util.List"%>
<%@page import="com.gssw.jd.dao.impl.ProTypeDaoImpl"%>
<%@page import="com.gssw.jd.dao.ProTypeDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//获取所有商品类型供选择使用；
	ProTypeDao tDao=new ProTypeDaoImpl();
	List<ProType> typelist=tDao.read();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增商品</title>
<link rel="stylesheet" type="text/css" href="../css/form.css">

<script type="text/javascript" charset="utf-8" src="../../ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="../../ueditor/ueditor.all.js"></script>
<script type="text/javascript">
		
		var editorImage;
	
		function render_insertImage(){
			editorImage=UE.getEditor("upload_ue");
			editorImage.ready(function(){
				editorImage.setDisabled();
				editorImage.hide();
				editorImage.addListener('beforeInsertImage',function(t,arg){
					var mypic=document.getElementById("ProImage");
					mypic.value=arg[0].src;
				});
			});
			
			
		}
		
		
		function upImage(){
			var d=editorImage.getDialog("insertimage");
			d.open();
		}
		
		
		window.onload=function(){
			render_insertImage();
			var btn=document.getElementById("btnProImage");
			btn.onclick=function(){
				upImage();
			};
		} 
	</script>
</head>
<body>
	<div id="title">
		<h1>新增商品</h1>
	</div>
	<div id="error"></div>
	<div id="input">
		<form id="productform" method="post" action="do.jsp">
        <input type="hidden" name="op" value="create">
        <table cellpadding="0" cellspacing="0" border="0">
            <tr>
            	<td class="t1">商品名称</td>
                <td>
                	<input type="text" id="ProName" name="proName">
                </td>
            </tr>
             <tr>
            	<td class="t1">商品单价</td>
                <td><input type="text" id="ProPrice" name="proPrice"></td>
            </tr>
             <tr>
            	<td class="t1">商品库存</td>
                <td><input type="text" name="proAmount"></td>
            </tr>
             <tr>
            	<td class="t1">商品分类</td>
                <td>
                	<select id="ProTypeId" name="proTypeId">
                		<option value="0">--请选择商品类型--</option>
                        <% for(ProType t:typelist){ %>
                        	<option value="<%= t.getTypeId() %>"><%= t.getTypeName() %></option>
                        <% } %>
                	</select>
                </td>
                
            </tr>
             <tr>
            	<td class="t1">商品图片</td>
                <td>
                	<script type="text/plain" id="upload_ue"></script>
                	<input type="text" id="ProImage" name="proImage">
                	<input type="button" class="subauto" id="btnProImage" value="选择商品图片">
                </td>
                
            </tr>
             <tr>
            	<td class="t1">商品描述</td>
                <td>
                	<script id="editor" name="proDesc" type="text/plain" style="width:500px;height:300px;"></script>
                	<script type="text/javascript">
				    	var ue = UE.getEditor("editor",{
				    			toolbars:[["source","undo","redo","insertunorderedlist","insertimage","time","date","emotion"]],
				    			initialContent: ""});
	    			</script>	
                </td>
                
            </tr>
             <tr>
            	<td></td>
                <td><input class="sub1" type="submit" value="保存"></td>
            </tr>
        </table>
   	</form>
	</div>
</body>
</html>