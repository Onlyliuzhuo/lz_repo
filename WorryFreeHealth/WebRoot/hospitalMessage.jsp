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
    
    <title>查看医院信息</title>
    
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
		.bggray{ background:#f9f9f9; font-size:14px; font-weight:bold; padding:10px 10px 10px 0; width:120px;}
		.main-for{ padding:10px;}
		.main-for input.text-word{ width:310px; height:36px; line-height:36px; border:#ebebeb 1px solid; background:#FFF; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; padding:0 10px;}
		.main-for select{ width:310px; height:36px; line-height:36px; border:#ebebeb 1px solid; background:#FFF; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666;}
		.main-for input.text-but{ width:100px; height:40px; line-height:30px; border: 1px solid #cdcdcd; background:#e6e6e6; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#969696; float:left; margin:0 10px 0 0; display:inline; cursor:pointer; font-size:14px; font-weight:bold;}
		#addinfo a{ font-size:14px; font-weight:bold; background:url(images/main/replayblack.jpg) no-repeat 0 0px; padding:0px 0 0px 20px; line-height:45px;}
		#addinfo a:hover{ background:url(images/main/replayblue.jpg) no-repeat 0 0px;}
	</style>
  </head>
  
  <body>
  <s:set name="hospital" value="#request.hospital"/>
   <table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  <tr>
    <td width="99%" align="left" valign="top">您的位置：医院管理&nbsp;&nbsp;>&nbsp;&nbsp;查看医生详细信息</td>
  </tr>
  <tr>
    <td align="left" valign="top" id="addinfo">
    <a href="searchHospital.jsp" target="mainFrame" onFocus="this.blur()" class="add">返回上一级</a>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <s:iterator value="hospital" id="hospital" status="st">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
    	<tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院图片：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        	<img src="<s:property value="#hospital.hospitalPicture" />" style="height: 280px; width: 429px; "></td>
        </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院编号：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        	<input type="text" name="hopitalID" value="<s:property value="#hospital.hospitalId"/>" class="text-word" style="width: 429px; "/></td>
        </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院名称：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
			<input type="text" name="hopitalName" value="<s:property value="#hospital.hospitalName"/>" class="text-word" style="width: 429px; "/></td>
        </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院电话：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        	<input type="text" name="hopitalTel" value="<s:property value="#hospital.hospitalTel"/>" class="text-word" style="width: 429px; "/></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院官网：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
			<a href="<s:property value="#hospital.hospitalWebsite"/>"  target="_blank" onFocus="this.blur()"> <input type="text" name="hopitalWebsite" value="<s:property value="#hospital.hospitalWebsite"/>" class="text-word" style="width: 429px; "/></a></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院地址：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for" style="line-height:24px;">
			<input type="text" name="hopitalAdddress" value="<s:property value="#hospital.hospitalAdress"/>" class="text-word" style="width: 429px; "/></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院类型：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for" style="line-height:24px;">
			<input type="text" name="hopitalType" value="<s:property value="#hospital.hospitalMajor"/>" class="text-word" style="width: 429px; "/></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院级别：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for" style="line-height:24px;">
			<input type="text" name="hopitalLevel" value="<s:property value="#hospital.hospitalLevel"/>" class="text-word" style="width: 429px; "/></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">挂号规则：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for" style="line-height:24px;">
			<input type="text" name="hopitalRule" value="<s:property value="#hospital.hospitalRegRule"/>" class="text-word" style="width: 429px; "/></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院简介：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for" style="line-height:24px;">
			<textarea name="hopitalIntroduction" rows="3" cols="20" class="text-word" style="width: 429px; height: 81px"><s:property value="#hospital.hospitalDescribe"/></textarea></td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">操作：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for"><a href="SearchThenUpdateHospitalMessage.action?hospitalId=<s:property value="#hospital.hospitalId"/>" target="mainFrame" onFocus="this.blur()" class="add">修改信息</a></td>
      </tr>
    </table>
    </s:iterator>
    </td>
    </tr>
</table>
</body>
</html>
