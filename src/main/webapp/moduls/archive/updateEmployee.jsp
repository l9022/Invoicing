<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改员工信息</title>
<script src="/Invoicing/js/Employee.js"></script>
<script src="/Invoicing/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#birthday' //指定元素
	});

</script>

</head>
<body>
档案管理->员工档案->修改
	<s:form action="employeeAction_updateEmployee" method="post" theme="simple">
		<table align="center"   >
		<s:hidden name="employee.id"></s:hidden>
		<s:hidden name="employee.code"></s:hidden>
			<tr>
				<td >员工编号</td>
				<td>
				    <s:textfield name="employee.code" id="code" onblur="checkCode()" disabled="true"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >员工名称</td>
				<td >
				   <s:textfield name="employee.name" id="name" onblur="checkName()"/> 
				</td>
				<td ><span id="nameMsg"></span></td>
			</tr>
			<tr>
				<td >员工生日</td>
				<td >
				    <s:textfield name="employee.birthday" id="birthday" onblur="checkBirthday()"/>
				</td>
				<td ><span id="birthdayMsg"></span></td>
			</tr>
			<tr>
				<td >性别</td>
				<td >
				    <s:if test="employee.sex=='男'">
						<select name="employee.sex">
							<option value="男" selected>男</option>
							<option value="女">女</option>
						</select>
					</s:if> 
					<s:else>
						<select name="employee.sex">
							<option value="男">男</option>
							<option value="女" selected>女</option>
						</select>
					</s:else>
				</td>
			</tr>
			<tr>
				<td >员工电话</td>
				<td >
				    <s:textfield name="employee.telephone" id="phone" onblur="checkPhone()"/>
				</td>
				<td><span id="phoneMsg"></span></td>
			</tr>
			<tr>
				<td >员工邮箱</td>
				<td >
				    <s:textfield name="employee.email" id="email" onblur="checkEmail()"/>
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