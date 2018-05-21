<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    
<title>成功页面</title>
</head>
<SCRIPT LANGUAGE="JavaScript">
var time = 5; //时间,秒
var timelong = 0;
	function diplaytime(){ //时间递减
		document.all.his.innerHTML = time -timelong ;
		timelong ++;
	}
	function redirect(){ //跳转页
		//history.back();
		window.location.href='<s:property value="finish_Url"/>';//指定要跳转到的目标页面
	}
	timer = setInterval('diplaytime()', 1000);//显示时间
	timer = setTimeout('redirect()', time * 1000); //跳转
</SCRIPT>
<body>
    <div align="center">
        <font color="#f70075">
	        <a href='<s:property value="finish_Url"/>'>
	        <br>
	        <br>
	        操作完成！5秒后自动返回到查询页面或点此立即返回。
	        </a>        
        </font>
    </div> 
</body>
</html>