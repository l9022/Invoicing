<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function Jump(url) {
		document.location = url;
	}
	function Del() {
		var form1=document.getElementById("f1");

		if(window.confirm("确定要删除吗？")){
			form1.action="employeeAction_delEmployee";
			form1.submit();
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询员工信息</title>
</head>
<body>
	<s:form action="employeeAction_findEmployee" method="post" id="f1">
		<table align="center">
			<tr>
				<td colspan="4" align="center">注册用户查询</td>
			</tr>
			<s:textfield name="employee.code" label="员工编号"/>
			<s:textfield name="employee.name" label="员工姓名"/>
			<tr>
			    <td></td>
			    <td align="right"><input type="submit" value="查询"/></td>
			    <td><input type="button" value="新增" onclick="Jump('/Invoicing/moduls/archive/saveEmployee.jsp')"/></td>
			    <td><input type="button" value="删除" onclick="Del()"/></td>
			</tr>	
		</table>
		<br>
		<table align="center" border="1">
			<thead>
			    <tr>
				    <td colspan="8" align="center">查询结果</td>
		        </tr>
			</thead>
			<thead>
			    <tr>
				    <td>选择</td>
				    <td>修改</td>
					<td>员工编号</td>
					<td>员工姓名</td>
					<td>员工生日</td>
					<td>员工性别</td>
					<td>员工电话</td>
					<td>员工邮箱</td>
			    </tr>
			</thead>
			<s:iterator value="employees">
				<tr>
				    <td><input type="checkbox" name="empId" value='<s:property value="id"/>'/></td>
			        <td><a href='employeeAction_findEmployeeByCode?employee.code=<s:property value="code"/>'>修改</a></td>
					<td><s:property value="code"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="birthday"/></td>
					<td><s:property value="sex"/></td>
					<td><s:property value="telephone"/></td>
					<td><s:property value="email"/></td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>