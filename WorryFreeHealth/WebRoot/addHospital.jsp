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
    
    <title>增加-医院</title>
    
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
	#addinfo a{ font-size:14px; font-weight:bold; background:url(images/main/addinfoblack.jpg) no-repeat 0 1px; padding:0px 0 0px 20px; line-height:45px;}
	#addinfo a:hover{ background:url(images/main/addinfoblue.jpg) no-repeat 0 1px;}
	</style>
<script type="text/javascript">
 //下面用于图片上传预览功能
 function setImagePreview(avalue) {
 
     var docObj=document.getElementById("doc");
    var imgObjPreview=document.getElementById("preview");
     //files属性：返回一个 Files 集合，由指定文件夹中包含的所有 File 对象组成，包括设置了隐藏和系统文件属性的文件。
     if(docObj.files &&docObj.files[0]){
         //火狐下，直接设img属性
         imgObjPreview.style.display = 'block';
         imgObjPreview.style.width = '429px';
         imgObjPreview.style.height = '280px'; 
         //imgObjPreview.src = docObj.files[0].getAsDataURL();
 
         //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式
 
        imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
     }else{
         //IE下，使用滤镜
         //
         docObj.select();
         var imgSrc = document.selection.createRange().text;
         var localImagId = document.getElementById("localImag");
         //必须设置初始大小
        localImagId.style.width = "429px";
         localImagId.style.height = "280px";
         //图片异常的捕捉，防止用户修改后缀来伪造图片    
         try{
       localImagId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
       localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
        }
        catch(e)
         {
       alert("您上传的图片格式不正确，请重新选择!");
        return false;
        }
        imgObjPreview.style.display = 'none';
         document.selection.empty();
    }
     return true;
}

</script>
  </head>
  
  <body>
    <table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  <tr>
    <td width="99%" align="left" valign="top">您的位置：医院管理&nbsp;&nbsp;>&nbsp;&nbsp;新增医院</td>
  </tr>
  <tr>
    <td align="left" valign="top" id="addinfo">
    <a  class="add">新增医院</a>
    </td>
  </tr>
   <tr>
    <td align="left" valign="top" >
    <a href="searchHospital.jsp" target="mainFrame" onFocus="this.blur()" class="add">返回上一级</a>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <form method="post" action="addHospitalMessage" name="addHospitalForm" enctype="multipart/form-data">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
         <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'" >
        <td align="right" valign="middle" class="borderright borderbottom bggray">图片预览：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <div id="localImag"> <img id="preview" src="" > </div></td>
     </tr>
     <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院图片：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="file" name="ahfb.upload" id="doc" onchange="javascript:setImagePreview();" class="text-word">
        </td>
       </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院编号：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalId" value="" class="text-word">
        </td>
        </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院名称：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalName" value="" class="text-word">
        </td>
        </tr>
        <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">联系方式：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalTel" value="" class="text-word">
        </td>
        </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院官网：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalWebsite" value="" class="text-word">
        </td>
       </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院地址：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalAddress" value="" class="text-word">
        </td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院类型：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalMajor" value="" class="text-word">
        </td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院级别：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalLevel" value="" class="text-word">
        </td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">挂号规则：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input type="text" name="ahfb.hospitalRegRule" value="" class="text-word">
        </td>
      </tr>
       <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">医院简介：</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <textarea name="ahfb.hospitalDescribe" rows="3" cols="20" class="text-word" style="width: 429px; height: 81px"><s:property value="#hospital.hospitalDescribe"/></textarea>
        </td>
      </tr>
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="right" valign="middle" class="borderright borderbottom bggray">&nbsp;</td>
        <td align="left" valign="middle" class="borderright borderbottom main-for">
        <input  type="submit" value="提交" class="text-but">
        <input  type="reset" value="重置" class="text-but"></td>
        </tr>
    </table>
    </form>
    </td>
    </tr>
</table>
  </body>
</html>

