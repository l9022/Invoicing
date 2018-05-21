<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script src="/Invoicing/js/Client.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>修改客户信息</title>
</head>
<body>
档案管理->客户档案->修改
	<s:form action="clientAction_updateClient" method="post" theme="simple">
		<table align="center"   >
		<s:hidden name="client.id"></s:hidden>
		<s:hidden name="client.code"></s:hidden>
			<tr>
				<td >客户编号</td>
				<td>
				    <s:textfield name="client.code" id="code" onblur="checkCode()" disabled="true"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >客户名称</td>
				<td >
				   <s:textfield name="client.name" id="name" onblur="checkName()"/> 
				</td>
				<td ><span id="nameMsg"></span></td>
			</tr>
			<tr>
				<td >客户地址</td>
				<td >
				    <s:textfield name="client.address" id="address" onblur="checkAddress()"/>
				</td>
				<td ><span id="addressMsg"></span></td>
			</tr>
			<tr>
				<td >客户电话</td>
				<td >
				    <s:textfield name="client.telephone" id="phone" onblur="checkPhone()"/>
				</td>
				<td><span id="phoneMsg"></span></td>
			</tr>
			<tr>
				<td >客户邮箱</td>
				<td >
				    <s:textfield name="client.email" id="email" onblur="checkEmail()"/>
				</td>
				<td><span id="emailMsg"></span></td>
			</tr>
			<tr>
				<td ><s:submit value="提交"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>