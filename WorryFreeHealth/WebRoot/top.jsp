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
    
    <title>头部</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/css.css" type="text/css" rel="stylesheet" />
  </head>
  
 <body style="overflow-x:hidden;">
	<table width="100%" border="0" cellspacing="0" cellpadding="0" id="header">
 		<tr>
    		<td rowspan="2" align="left" valign="top" id="logo"><img src="images/main/logo.jpg" width="74" height="64"></td>
   		 	<td align="left" valign="bottom">
	    		<table width="100%" border="0" cellspacing="0" cellpadding="0">
	      			<tr>
	        			<td align="left" valign="bottom" id="header-name">无忧在线医疗网</td>
	        			<td align="right" valign="top" id="header-right">
	        				<a href="login.jsp" target="topFrame" onFocus="this.blur()" class="admin-out">注销</a>
	        				<a href="http://www.hnctcm.edu.cn/" target="_blank" onFocus="this.blur()" class="admin-index">网站首页</a>       	
	            			<span>
								<!-- 日历 -->
								<SCRIPT type=text/javascript src="js/clock.js"></SCRIPT>
								<SCRIPT type=text/javascript>showcal();</SCRIPT>
	           				 </span>
	      		  		</td>
	     			</tr>
	   			 </table>
   			</td>
 		 </tr>
  		 <tr>
    		<td align="left" valign="bottom">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="left" valign="top" id="header-admin">后台管理系统</td>
        <td align="left" valign="bottom" id="header-menu">
        <a href="leftAdmin.jsp" target="leftFrame" onFocus="this.blur()">管理员管理</a>
        <a href="leftPatient.jsp" target="leftFrame" onFocus="this.blur()">患者管理</a>
        <a href="leftDoctor.jsp" target="leftFrame" onFocus="this.blur()">医生管理</a>
        <a href="leftDesk.jsp" target="leftFrame" onFocus="this.blur()">科室管理</a>
        <a href="leftHospital.jsp" target="leftFrame" onFocus="this.blur()">医院管理</a>
        <a href="leftOrder.jsp" target="leftFrame" onFocus="this.blur()">订单管理</a>
        <a href="leftMessage.jsp" target="leftFrame" onFocus="this.blur()">咨询信息管理</a>
        </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
