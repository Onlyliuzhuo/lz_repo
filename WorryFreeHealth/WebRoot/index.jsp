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
    
    <title>无忧在线医疗网</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="shortcut icon" href="images/favicon.ico" />
	<link href="css/css.css" type="text/css" rel="stylesheet" />
	<!-- 框架样式 -->
	<frameset rows="95,*,30" cols="*" frameborder="no" border="0" framespacing="0">
		<!--top样式-->
		<frame src="top.jsp" name="topframe" scrolling="no" noresize id="topframe" title="topframe" />
		<!--contact样式-->
		<frameset id="attachucp" framespacing="0" border="0" frameborder="no" cols="194,12,*" rows="*">
			<frame scrolling="auto"  name="leftFrame" src="left.jsp"></frame>
			<frame id="leftbar" scrolling="no" name="switchFrame" src="swich.jsp"></frame>
			<frame scrolling="auto"  name="mainFrame" src="main.jsp"></frame>
	</frameset>
	<!--bottom样式-->
		<frame src="buttom.jsp" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" title="bottomFrame" />
	</frameset><noframes></noframes>
	<!--不可以删除-->
  </head>
  
  <body>

  </body>
</html>
