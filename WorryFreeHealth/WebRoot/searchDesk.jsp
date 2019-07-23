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
    
    <title>搜索-科室</title>
    
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
		#search{ font-size:12px; background:#548fc9; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF; float:left}
		#search form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
		#search form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:0 0px 0 10px; float:left; border:1px solid #FFF;}
		#search form input.text-but{height:24px; line-height:24px; width:55px; background:url(images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
		#search a.add{ background:url(images/main/add.jpg) no-repeat -3px 7px #548fc9; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF; float:right}
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
	</style>
  </head>
  
  <body>
  		<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
 		 <tr>
    		<td width="99%" align="left" valign="top">您的位置：科室管理&nbsp;&nbsp;>&nbsp;&nbsp;查询</td>
  		 </tr>
  		 <tr>
    		<td align="left" valign="top" >
            	<a href="main.jsp" target="mainFrame" onFocus="this.blur()" class="add">返回上一级</a>
    	    </td>
  		</tr>
  		<tr>
    		<td align="left" valign="top">
    			<table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
  				<tr>
   		 			<td width="90%" align="left" valign="middle">
	         			<form method="post" action="searchDesk">
	         				<span>科室：</span>
	        				<input type="text" name="deskId" value="" class="text-word">
	         				<input type="submit" value="查询" class="text-but">
	         			</form>
         			</td>
         				<td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a href="addDesk.jsp" target="mainFrame" onFocus="this.blur()" class="add">新增科室</a></td>
  					</tr>
				</table>
    		</td>
  		</tr>
  		<tr>
    		<td align="left" valign="top">
    		<s:set name="desk" value="#request.desk"></s:set> 
			<s:if test="null==#desk||#desk.isEmpty()">
					<center>
						<h3 style="color:red">没有找到相关信息!</h3>
					</center>
					</s:if> <s:else>
    			<table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
      				<tr>
 						<th align="center" valign="middle" class="borderright">科室编号</th>
        				<th align="center" valign="middle" class="borderright">科室名称</th>
        				<th align="center" valign="middle" class="borderright">科室联系方式</th>
        				<th align="center" valign="middle" class="borderright">科室级别</th>
        				<!--  <th align="center" valign="middle" class="borderright">科室所在医院</th> -->
        				<th align="center" valign="middle">操作</th>
      				</tr>
      				<s:iterator value="desk" id="desk" status="st">
     				<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
	       		 		<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#desk.deskId"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#desk.deskName"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#desk.deskTel"/></td>
	        			<td align="center" valign="middle" class="borderright borderbottom"><s:property value="#desk.deskLevel"/></td>
	        			<!--  <td align="center" valign="middle" class="borderright borderbottom">北京协和医院</td> -->
	        			<td align="center" valign="middle" class="borderbottom"><a href="updateDesk.action?deskId=<s:property value="#desk.deskId"/>" target="mainFrame" onFocus="this.blur()" class="add">编辑</a><span class="gray">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
	        				</span><a href="searchThenDeleteDesk.action?deskId=<s:property value="#desk.deskId"/>" target="mainFrame" onFocus="this.blur()" class="add">删除</a></td>
      				</tr>
      				</s:iterator>
  					<tr>
   						<td align="left" valign="middle" colspan="3" class="fenye"><s:property value="#request.count"/> 条数据 1/1 页&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">首页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">上一页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">下一页</a>&nbsp;&nbsp;<a href="#" target="mainFrame" onFocus="this.blur()">尾页</a></td>
  					</tr>
				</table>
				</s:else>
			</td>
		</tr>
	</table>
  </body>
</html>
