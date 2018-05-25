<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
<script type="text/javascript">
	
	function redirect(url) {
		document.location = url;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进销存管理系统</title>
</head>
<body>

    <ul>
        <li><b>档案管理</b></li>
        <ul>
            <li>
                <input type="button" value="员工档案" 
					    onclick="redirect('<%=basePath%>employeeAction_findEmployee')">
            </li>
            <li>
                <input type="button" value="客户档案" 
					    onclick="redirect('<%=basePath%>clientAction_findClient')">
            </li>
            <li>
                <input type="button" value="商品档案" 
					    onclick="redirect('<%=basePath%>merchandiseAction_findMerchandise')">
            </li>
        </ul>
        <li><b>销售管理</b></li>
        <ul>
            <li>
                <input type="button" value="订货单" 
					    onclick="redirect('<%=basePath%>stockorderAction_findStockorder')">
            </li>
        </ul>
        <li><b>进货管理</b></li>
        <ul>
            <li>
                <input type="button" value="进货单" 
					    onclick="redirect('<%=basePath%>stockinAction_findStockin')">
            </li>
        </ul>
    </ul>
</body>
</html>