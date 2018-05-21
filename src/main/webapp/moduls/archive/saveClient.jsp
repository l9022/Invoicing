<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <script src="/Invoicing/js/Client.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>新增客户信息</title>
</head>
<body>
档案管理->客户档案->新增
    <s:form action="clientAction_saveClient" method="post" onSubmit="return checkForm()" theme="simple">
        <table align="center"   >
			<tr>
				<td >客户编号</td>
				<td>
				    <s:textfield name="client.code" id="code" onblur="checkCode()"/>
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