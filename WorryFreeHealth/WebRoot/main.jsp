<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主要内容区</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/css.css" type="text/css" rel="stylesheet" />
	<link href="css/main.css" type="text/css" rel="stylesheet" />
	<link rel="shortcut icon" href="images/main/favicon.ico" />
	<style>
	body{overflow-x:hidden; background:#f2f0f5; padding:15px 0px 10px 5px;}
	#main{ font-size:12px;}
	#main span.time{ font-size:14px; color:#528dc5; width:100%; padding-bottom:10px; float:left}
	#main div.top{ width:100%; background:url(images/main/main_r2_c2.jpg) no-repeat 0 10px; padding:0 0 0 15px; line-height:35px; float:left}
	#main div.sec{ width:100%; background:url(images/main/main_r2_c2.jpg) no-repeat 0 15px; padding:0 0 0 15px; line-height:35px; float:left}
	.left{ float:left}
	#main div a{ float:left}
	#main span.num{  font-size:30px; color:#538ec6; font-family:"Georgia","Tahoma","Arial";}
	.left{ float:left}
	div.main-tit{ font-size:14px; font-weight:bold; color:#4e4e4e; background:url(images/main/main_r4_c2.jpg) no-repeat 0 33px; width:100%; padding:30px 0 0 20px; float:left}
	div.main-con{ width:100%; float:left; padding:10px 0 0 20px; line-height:36px;}
	div.main-corpy{ font-size:14px; font-weight:bold; color:#4e4e4e; background:url(images/main/main_r6_c2.jpg) no-repeat 0 33px; width:100%; padding:30px 0 0 20px; float:left}
	div.main-order{ line-height:30px; padding:10px 0 0 0;}
	</style>
  </head>
  
  <body>
   <table width="99%" border="0" cellspacing="0" cellpadding="0" id="main">
   		<tr>
   			<td colspan="2" align="left" valign="top">
    		</td>
  		</tr>
  		<tr>
  			<td><img src="images/main/tu.jpg" width="1660,*" height="700,*"></td>
 	 	</tr>
  </table>

</body>
</html>
