<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String msg=(String)request.getAttribute("msg");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<title>Login Page</title>
	<link rel="shortcut icon" href="/favicon.ico">
	<link rel="stylesheet" href="css/LoginwithCodestyle.css">
	
	
	
	<script type="text/javascript">
		function validate() {
			var adminNo = document.f1.adminNo.value;
			var adminPwd = document.f1.adminPwd.value;
			if(adminNo == "") {
				alert("请输入账号");
				return;
			}
			if(adminPwd == "") {
				alert("请输入密码");
				return;
			}
			var request = getRequest();
			var t1 = document.getElementById("validateImg").value;
			request.open("get","valiadteByImg?num="+t1);
			request.onreadystatechange = function () {
				
				if(request.readyState == 4) {
					var data = request.responseText;
					if(data != "OK") {
						alert(data);
						return;
					}
					document.f1.submit();
				}
			};
			request.send(null);
	//document.f1.submit();
		}
		
		function changerImg() {
			document.getElementById("img1").src="<%=path%>/text?timestm="+new Date().getTime();
		}
		
		function getRequest() {
			var reqs = [
							function(){return new XMLHttpRequest();},
							function(){return new ActiveXObject("Msxml2.XMLHTTP");},
							function(){return new ActiveXObject("Msxml3.XMLHTTP");}
						];
			for(var i = 0;i < reqs.length;i++) {
				try {
					
					var temp = reqs[i]();
					return temp;
				}catch(e) {
					continue;
				}
			}
		}
	</script>

</head>


<body background="image/backGround.png">
<s:form  name="f1" method="post">
		<fieldset>		
			<legend>Log in</legend>			
			<label for="login">帐号</label>
			<input id=AccountandPw  type="text" id="login" name="adminNo"/>
			
			<div class="clear"></div>
			
			<label for="password">密码</label>
			<input  id=AccountandPw type="password" id="password" name="adminPwd"/>
			<div class="clear"></div>
			<%if(msg!=null){
				%>
				<center>
				<font color="red"><%=msg%></font>
				</center>
				<% 
				}
				%>
			
            
             <a href="javascript:changerImg()" >
             <img id="img1" alt="验证码" src="<%=path%>/text?timestm="+<%=new java.util.Date().getTime() %>>
             </a>	
            
            <label style="">验证码</label>
            
            <input  style="text" id="validateImg" name="validateImg">&nbsp;&nbsp;&nbsp;&nbsp;
           	<input type="button"  class="button"  name="commit" value="登    录" onclick="validate()"/>	&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="ForgetPassword.jsp" >忘记密码?</a>&nbsp;&nbsp;&nbsp;&nbsp;
            
            <a href="UserRegister.jsp" class="">注册</a>
            
		</fieldset>
	</s:form>
<br/><br/>
<br/>
<br/>
<br/>
<br/>
</body>
</html>