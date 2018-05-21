<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<script src="/Invoicing/js/Employee.js"></script>
<script src="/Invoicing/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#birthday' //指定元素
	});

</script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>新增员工信息</title>
    <sx:head extraLocales="utf-8"/>
</head>
<body>
档案管理->员工档案->新增
    <s:form action="employeeAction_saveEmployee" method="post" onSubmit="return checkForm()" theme="simple">
        <table align="center"   >
			<tr>
				<td >员工编号</td>
				<td>
				    <s:textfield name="employee.code" id="code" onblur="checkCode()"/>
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
				    <select name="employee.sex">
					    <option value="男" >男</option>
					    <option value="女">女</option>
				    </select>
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