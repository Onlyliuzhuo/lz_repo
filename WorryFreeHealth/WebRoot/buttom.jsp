<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>底部</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/css.css" type="text/css" rel="stylesheet" />
	<style>
		#footer{font-size:17px;}
		.footer_pad{padding:7px 9px 5px 9px;}
	</style>
  </head>
  
  <body style="overflow-x:hidden; background:url(images/main/bottombg.jpg) repeat-x top left;" >
	<table width="100%" border="0" cellspacing="0" cellpadding="0" id="footer">
  		<tr>
    		<td align="left" valign="middle" class="footer_pad">邮编:410000&nbsp;&nbsp;<a href="http://www.hnctcm.edu.cn/" target="_blank">湖南中医药大学版权所有-2017.10
  	</a> </td>
    		<td align="right" valign="middle" class="footer_pad"><img src="images/main/why.gif" width="12" height="12" alt="疑问图标" align="middle">&nbsp;&nbsp;	联系电话:15211146404</td>
  </tr>
</table>
</body>
</html>
