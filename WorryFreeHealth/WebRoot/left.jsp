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
    
    <title>左边</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/css.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="js/sdmenu.js"></script>
	<script type="text/javascript">
	// <![CDATA[
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
	// ]]>
	</script>
	<style type=text/css>
	html{ SCROLLBAR-FACE-COLOR: #538ec6; SCROLLBAR-HIGHLIGHT-COLOR: #dce5f0; SCROLLBAR-SHADOW-COLOR: #2c6daa; SCROLLBAR-3DLIGHT-COLOR: #dce5f0; SCROLLBAR-ARROW-COLOR: #2c6daa;  SCROLLBAR-TRACK-COLOR: #dce5f0;  SCROLLBAR-DARKSHADOW-COLOR: #dce5f0; overflow-x:hidden;}
	body{overflow-x:hidden; background:url(images/main/leftbg.jpg) left top repeat-y #f2f0f5; width:194px;}
</style>
  </head>
  
  <body>
  <div id="left-top">
	<div><img src="images/main/member.gif" width="44" height="44" /></div>
    <span ><br>您好!<s:property value="#session.adminId" /></span>
	</div>
	<div style="float: left" id="my_menu" class="sdmenu">
    	<div class="collapsed">
	        <span>管理员管理</span>
	         <a href="changeAdmin.jsp" target="mainFrame" onFocus="this.blur()">修改信息</a>
        	 <!-- <a href="searchAdmin.jsp" target="mainFrame" onFocus="this.blur()">查询管理员</a>        
	              <a href="searchAllAdmin.action" target="mainFrame" onFocus="this.blur()">删除管理员</a>-->
      	</div>
    	<div>
	        <span>患者管理</span>
	    	<a href="searchPatient.jsp" target="mainFrame" onFocus="this.blur()">查询患者</a>
	    	<a href="examinThenSearchPatient.action" target="mainFrame" onFocus="this.blur()">审核患者</a>
	        <a href="deleteThenSearchPatient.action" target="mainFrame" onFocus="this.blur()">删除患者</a>
   		</div>
    <div>
        <span>医生管理</span>
	        <a href="searchDoctor.jsp" target="mainFrame" onFocus="this.blur()">查询医生</a>
	    	<a href="searchAllDoctor.action" target="mainFrame" onFocus="this.blur()">审核医生</a>
	        <a href="searchAllDoctorUsed.action" target="mainFrame" onFocus="this.blur()">删除医生</a>
    </div>
    <div>  
       	<span>科室管理</span>
       		<a href="searchDesk.jsp" target="mainFrame" onFocus="this.blur()">查询科室</a>
	    	<a href="addDesk.jsp" target="mainFrame" onFocus="this.blur()">新增科室</a>
	        <a href="searchAllDesk.action" target="mainFrame" onFocus="this.blur()">删除科室</a>
    </div>
    <div>
      		<span>医院管理</span>
	     	 <a href="searchHospital.jsp" target="mainFrame" onFocus="this.blur()">查询医院</a>
	    	 <a href="addHospital.jsp" target="mainFrame" onFocus="this.blur()">新增医院</a>
	         <a href="deleteThenSearchHospital.action" target="mainFrame" onFocus="this.blur()">删除医院</a>
   </div>
   <div>
        <span>订单管理</span>
     	<a href="searchOrderState.jsp" target="mainFrame" onFocus="this.blur()">查询订单状态</a>
    	<a href="deleteThenSearchOrderList.action" target="mainFrame" onFocus="this.blur()">删除订单</a>
      </div>
      <div>
        <span>咨询管理</span>
         <a href="searchMessageState.jsp" target="mainFrame" onFocus="this.blur()">查询咨询信息状态</a>
         <a href="examinThenSearchMessage.action" target="mainFrame" onFocus="this.blur()">审核咨询信息</a>
         <a href="deleteThenSearchMessage.action" target="mainFrame" onFocus="this.blur()">删除咨询信息</a>
      </div>
    </div>
  </body>
</html>

