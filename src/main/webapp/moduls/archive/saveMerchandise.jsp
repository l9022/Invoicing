<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <script src="/Invoicing/js/Merchandise.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>新增商品信息</title>
</head>
<body>
档案管理->商品档案->新增
    <s:form action="merchandiseAction_saveMerchandise" method="post" onSubmit="return checkForm()" theme="simple">
        <table align="center"   >
			<tr>
				<td >商品编号:</td>
				<td>
				    <s:textfield name="merchandise.code" id="code" onblur="checkCode()"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >商品名称:</td>
				<td >
				   <s:textfield name="merchandise.name" id="name" onblur="checkName()"/> 
				</td>
				<td ><span id="nameMsg"></span></td>
			</tr>
			<tr>
				<td >商品单价:</td>
				<td >
				    <s:textfield name="merchandise.price" id="price" onblur="checkPrice()"/>
				</td>
				<td ><span id="priceMsg"></span></td>
			</tr>
			<tr>
				<td ><s:submit value="提交"/></td>
			</tr>
		</table>
    </s:form>   
</body>
</html>