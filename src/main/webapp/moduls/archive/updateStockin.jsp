<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<script src="/Invoicing/js/Stockin.js"></script>
<script src="/Invoicing/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#stockindate' //指定元素
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
    <s:form action="stockinAction_updateStockin" method="post" onSubmit="return checkForm()" theme="simple">
        <table align="center"   >
        <s:hidden name="stockin.id"></s:hidden>
		<s:hidden name="stockin.code"></s:hidden>
			<tr>
				<td >进货单编号</td>
				<td>
				    <s:textfield name="stockin.code" id="code" onblur="checkCode()" disabled="true"/>
				</td>
				<td ><span id="codeMsg"></span></td>
			</tr>
			<tr>
				<td >供应商</td>
				<td >
				    <s:select list="clients" name="stockin.client.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="clientnameMsg"></span></td>
			</tr>
			<tr>
				
				<td >货物名称</td>
				<td >
				    <s:select list="merchandises" name="stockin.merchandise.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="merchandisenameMsg"></span></td>
			</tr>
			<tr>
				<td >进货数量</td>
				<td >
				    <s:textfield name="stockin.amount" id="amount" onblur="checkAmount()"/>
				</td>
				<td ><span id="amountMsg"></span></td>
			</tr>
			<tr>
				<td >货物单价（元）</td>
				<td >
				    <s:textfield name="stockin.price" id="price" onblur="checkPrice()"/>
				</td>
				<td><span id="priceMsg"></span></td>
			</tr>
			<tr>
				<td >货物总金额（元）</td>
				<td >
				    <s:textfield name="stockin.money" id="money" onblur="checkMoney()"/>
				</td>
				<td><span id="moneyMsg"></span></td>
			</tr>
			<tr>
				<td >经手人</td>
				<td >
				    <s:select list="employees" name="stockin.employee.id"
				        listKey="id" listValue="name" emptyOption="true"/>
				</td>
				<td ><span id="employeenameMsg"></span></td>
			</tr>
			<tr>
				<td >进货日期</td>
				<td >
				    <s:textfield name="stockin.stockindate" id="stockindate" onblur="checkStockindate()"/>
				</td>
				<td><span id="stockindateMsg"></span></td>
			</tr>
			<tr>
				<td align="right"><s:submit value="提交"/></td>
				<td align="left"><input type="button" value="返回"/></td>
			</tr>
		</table>
    </s:form>   
</body>
</html>