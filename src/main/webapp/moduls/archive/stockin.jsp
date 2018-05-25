<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<script src="/Invoicing/js/laydate/laydate.js"></script>
<script type="text/javascript">
	//执行一个laydate实例
	laydate.render({
		elem : '#stockindate' //指定元素
	});
	
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

			form1.action = "stockinAction_delStockin";
			form1.submit();

		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进货单</title>
</head>
<body>
	<s:debug></s:debug>
	进货管理->进货单
	<p>
	<s:form id="f1" action="stockinAction_findStockin" method="get" theme="simple">
	    <table align="center">
	        <tr>
	            <td>进货单编号</td>
	            <td><input type="text" name="stockin.code" /></td>
	            <td>货物名称</td>
	            <td>
					<s:select list="merchandises" name="stockin.merchandise.id"
						listKey="id" listValue="name" emptyOption="true">
					</s:select>
	            </td>
	            <td></td>
	            <td></td>
	        </tr>
	        <tr>
	            <td>进货日期</td>
	            <td><input type="text" name="stockin.stockindate" id="stockindate"></td>
	            <td>供应商</td>
	            <td>
					<s:select list="clients" name="stockin.client.id"
						listKey="id" listValue="name" emptyOption="true">
					</s:select>
	            </td>
	            <td>经手人</td>
	            <td>
					<s:select list="employees" name="stockin.employee.id"
						listKey="id" listValue="name" emptyOption="true">
					</s:select>
	            </td>
	        </tr>
	        <tr>
	            <td colspan="2"></td>
	            <td align="right"><input type="submit" value="查找"></td>
	            <td align="center">
				    <input type="button" value="新增" 
				    onclick="Jump('<%=basePath%>stockinAction_prepSaveStockin')">
	            </td>
	            <td><input type="button" value="删除" onclick="Del()" /></td>
	        </tr>
	    </table>
		

		<hr />
		<table border="1" align="center">
			<tr>
				<th>选择</th>
				<th>修改</th>
				<th>进货单编号</th>
				<th>供应商</th>
				<th>货物名称</th>
				<th>货物数量</th>
				<th>货物单价（元）</th>
				<th>货物金额（元）</th>
				<th>进货日期</th>
				<th>经手人</th>
			</tr>
			<s:iterator value="stockins">
				<tr>
					<td><input type="checkbox" name="stockinId"
						value='<s:property value="id" />'></td>
					<td><a
						href='stockinAction_findStockinByCode?stockin.code=<s:property value="code"/>'>修改</a></td>
					<td><s:property value="code" /></td>
					<td><s:property value="client.name" /></td>
					<td><s:property value="merchandise.name" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="price" /></td>
					<td><s:property value="money" /></td>
					<td><s:property value="stockindate" /></td>
					<td><s:property value="employee.name" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>