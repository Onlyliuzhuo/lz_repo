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
    
    <title>后台管理登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/alogin.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  <s:form id="form1"  action="adminLogin" method="post">
  	<div class="Main">
    	<br><ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB"><span></span><img src="images/login/logo.jpg" alt="" style="width: 201px; height: 169px"></li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li>
	                    <span class="left login-text">账号：</span>
	             		<span style="left">
	                    	<input  type="text" class="txt" name="adminID"/>  
	         		 	</span>
	                    <!--  布局全错<span style="left"> <s:textfield  name="adminID" class="txt"></s:textfield> </span>-->
                    </li>
                    <li>
                    	<span class="left login-text">密码：</span> 
                    	<span style="left">
                       		<input type="password" class="txt" name="adminPassword" />  
                   		</span>
                   	</li>
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="btn"><input type="submit" value="登录" class="txt1"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" class="txt1"/></span></li>
            <li class="middle_D"></li>
            <li class="bottom_A"></li>
            <li class="bottom_B"><center>
  			湖南中医药大学版权所有-2017.10<br>
  			邮编:410000<br>
  			联系电话:88899966
  	</center></li>
        </ul>
        </div>
  </s:form>
  </body>
</html>
