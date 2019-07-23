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
    
    <title>删除-医院</title>
    
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
	#searchmain{ font-size:12px;}
	#search{ font-size:12px; background:#548fc9; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF}
	#search form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
	#search form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:0 0px 0 10px; float:left; border:1px solid #FFF;}
	#search form input.text-but{height:24px; line-height:24px; width:55px; background:url(images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
	#search a.add{ background:url(images/main/add.jpg) no-repeat 0px 6px; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF}
	#search a:hover.add{ text-decoration:underline; color:#d2e9ff;}
	#main-tab{ border:1px solid #eaeaea; background:#FFF; font-size:12px;}
	#main-tab th{ font-size:12px; background:url(images/main/list_bg.jpg) repeat-x; height:32px; line-height:32px;}
	#main-tab td{ font-size:12px; line-height:40px;}
	#main-tab td a{ font-size:12px; color:#548fc9;}
	#main-tab td a:hover{color:#565656; text-decoration:underline;}
	.bordertop{ border-top:1px solid #ebebeb}
	.borderright{ border-right:1px solid #ebebeb}
	.borderbottom{ border-bottom:1px solid #ebebeb}
	.borderleft{ border-left:1px solid #ebebeb}
	.gray{ color:#dbdbdb;}
	td.fenye{ padding:10px 0 0 0; text-align:right;}
	.bggray{ background:#f9f9f9}
	#addinfo{ padding:0 0 10px 0;}
	td#xiugai{ padding:10px 0 0 0;}
	td#xiugai input{ width:100px; height:40px; line-height:30px; border:none; border:1px solid #cdcdcd; background:#e6e6e6; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#969696; float:left; margin:0 10px 0 0; display:inline; cursor:pointer; font-size:14px; font-weight:bold;}
	</style>
  </head>
  
  <body>
  	<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  		<tr>
   			<td width="99%" align="left" valign="top" id="addinfo">您的位置：医院管理&nbsp;&nbsp;>&nbsp;&nbsp;删除医院</td>
  		</tr>
   		<tr>
    		<td align="left" valign="top" >
    			<a href="main.jsp" target="mainFrame" onFocus="this.blur()" class="add">返回上一级</a>
    		</td>
  		</tr>
  		<tr>
    		<td align="left" valign="top">
    	<s:set name="hospital" value="#request.hospital"></s:set> 
  		<s:if test="null==#hospital||#hospital.isEmpty()">
  		<center>
  		<h3 style="color:red">没有找到相关信息!</h3>
  		</center>
  		</s:if> <s:else>    		
   				<table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
      				<tr>
 						<th align="center" valign="middle" class="borderright">医院编号</th>
        				<th align="center" valign="middle" class="borderright">医院名称</th>
        				<th align="center" valign="middle" class="borderright">医院联系方式</th>
        				<th align="center" valign="middle" class="borderright">医院官网</th>
        				<th align="center" valign="middle" class="borderright">医院地址</th>
        				<th align="center" valign="middle" class="borderright">医院类型</th>
        				<th align="center" valign="middle" class="borderright">医院级别</th>
        				<th align="center" valign="middle">操作</th>
      				</tr>
      				<s:iterator value="hospital" id="hospital" status="st">
     				<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
	       		 		<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalId"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalName"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalTel"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalWebsite"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalAdress"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalMajor"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#hospital.hospitalLevel"/></td>
	        			<td align="center" valign="middle" class="borderbottom"><a href="deleteHospital.action?hospitalId=<s:property value="#hospital.hospitalId"/>" target="mainFrame" onFocus="this.blur()" class="add">删除</a></td>
      				</tr>
      				</s:iterator>
  					<tr>
   						<td align="left" valign="middle" colspan="4" class="fenye"><s:property value="#request.count"></s:property>条数据 1/1 页&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">首页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">上一页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">下一页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">尾页</a></td>
  					</tr>
				</table>
				</s:else>
		</td>
	</tr>
	</table>
</body>
</html>
