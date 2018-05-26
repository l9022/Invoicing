<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<script src="/Invoicing/js/Stockorder.js"></script>
<script src="/Invoicing/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#stockorderdate' //指定元素
	});

</script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>新增进货单信息</title>
    <sx:head extraLocales="utf-8"/>
</head>
<body>
<br>
货物管理->进货单->新增
    <hr/>
    <br>
    <s:form action="stockorderAction_updateStockorder" method="post" onSubmit="return checkForm()" theme="simple">
        <table align="center"   >
        <s:hidden name="stockorder.id"></s:hidden>
		<s:hidden name="stockorder.code"></s:hidden>
			<tr>
				<td >订单编号</td>
				<td>
				    <s:textfield name="stockorder.code" id="code" onblur="checkCode()" disabled="true"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >供应商</td>
				<td >
				    <s:select list="clients" name="stockorder.client.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="clientnameMsg"></span></td>
			</tr>
			<tr>
				
				<td >货物名称</td>
				<td >
				    <s:select list="merchandises" name="stockorder.merchandise.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="merchandisenameMsg"></span></td>
			</tr>
			<tr>
				<td >货物数量</td>
				<td >
				    <s:textfield name="stockorder.merchandisenumber" id="merchandisenumber" onblur="checkAmount()"/>
				</td>
				<td ><span id="merchandisenumberMsg"></span></td>
			</tr>
			<tr>
				<td >经手人</td>
				<td >
				    <s:select list="employees" name="stockorder.employee.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="employeenameMsg"></span></td>
			</tr>
			<tr>
				<td >订单日期</td>
				<td >
				    <s:textfield name="stockorder.stockorderdate" id="stockorderdate" onblur="checkStockorderdate()"/>
				</td>
				<td><span id="stockorderdateMsg"></span></td>
			</tr>
			<tr>
				<td align="right"><s:submit value="提交"/></td>
				<td align="left"><input type="button" value="返回"/></td>
			</tr>
		</table>
    </s:form>   
</body>
</html>