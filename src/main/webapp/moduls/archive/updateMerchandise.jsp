<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script src="/Invoicing/js/Merchandise.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>修改商品信息</title>
</head>
<body>
档案管理->商品档案->修改
	<s:form action="merchandiseAction_updateMerchandise" method="post" theme="simple">
		<table align="center"   >
		<s:hidden name="merchandise.id"></s:hidden>
		<s:hidden name="merchandise.code"></s:hidden>
			<tr>
				<td >商品编号</td>
				<td>
				    <s:textfield name="merchandise.code" id="code" onblur="checkCode()" disabled="true"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >商品名称</td>
				<td >
				   <s:textfield name="merchandise.name" id="name" onblur="checkName()"/> 
				</td>
				<td ><span id="nameMsg"></span></td>
			</tr>
			<tr>
				<td >商品单价</td>
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