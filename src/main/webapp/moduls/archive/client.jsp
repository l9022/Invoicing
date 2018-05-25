<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<script>
	function Jump(url) {
		document.location = url;
	}
	function Del() {
		var form1 = document.getElementById("f1");
		var es = form1.elements;//列举所有form1表单中的子元素
		var i;
		for (i = 0; i < es.length; i++) {
			if (es[i].type == "checkbox" && es[i].checked) {
				break;
			}
		}
		if (i == es.length) {
			alert("请选择要删除的记录！！");
		} else if (window.confirm("确定要删除所选的记录吗？")) {

			form1.action = "clientAction_delClient";
			form1.submit();

		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询客户信息</title>
</head>
<body>
	<s:form action="clientAction_findClient" method="post" id="f1">
		<table align="center">
			<tr>
				<td colspan="4" align="center">注册用户查询</td>
			</tr>
			<s:textfield name="client.code" label="客户编号"/>
			<s:textfield name="client.name" label="客户姓名"/>
			<tr>
			    <td></td>
			    <td align="right"><input type="submit" value="查询"/></td>
			    <td>
			        <input type="button" value="新增" 
			        onclick="Jump('/Invoicing/moduls/archive/saveClient.jsp')"/>
			    </td>
			    <td><input type="button" value="删除" onclick="Del()"/></td>
			</tr>	
		</table>
		<br>
		<table align="center" border="1">
			<thead>
			    <tr>
				    <td colspan="7" align="center">查询结果</td>
		        </tr>
			</thead>
			<thead>
			    <tr>
				    <td>选择</td>
				    <td>修改</td>
					<td>客户编号</td>
					<td>客户姓名</td>
					<td>客户地址</td>
					<td>客户电话</td>
					<td>客户邮箱</td>
			    </tr>
			</thead>
			<s:iterator value="clients">
				<tr>
				    <td><input type="checkbox" name="clientId" value='<s:property value="id"/>'/></td>
			        <td><a href='clientAction_findClientByCode?client.code=<s:property value="code"/>'>修改</a></td>
					<td><s:property value="code"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="address"/></td>
					<td><s:property value="telephone"/></td>
					<td><s:property value="email"/></td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>