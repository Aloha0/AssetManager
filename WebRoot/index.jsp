<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Index</title>
    <%@include file="/header.html" %>
        
</head>
<%String side_bar_page = basePath+"side_bar.jsp"; %>
<body class="nav-md pace-done">
    <div class="container body" >
		<jsp:include page="/side_bar.jsp" flush="true"/> 
		<jsp:include page="/top_bar.jsp" flush="true"/> 
		
        <div class="right_col" role="main" style="min-height: 960px">
        
        	欢迎！
	         <div id="toolbar">
	            <button id="button" onclick="show()" class="btn btn-default">getRowByUniqueId</button>
	        </div>
	        <table id="table"
	               data-toggle="table"
	               data-toolbar="#toolbar"
	               data-height="460"
	               data-unique-id="id"
	               data-url="data.json">
	            <thead>
	            <tr>
	                <th data-field="id">ID</th>
	                <th data-field="name">Item Name</th>
	                <th data-field="price">Item Price</th>
	            </tr>
	            </thead>
	        </table>

        </div>
    </div>
    
    <%@include file="footer.html" %>
    <script>
	    var $table = $('#table'),
	        $button = $('#button');


		function show(index) {
            alert('getRowByUniqueId: ' + JSON.stringify($table.bootstrapTable('getRowByUniqueId', index)));
        }
   
	</script>
</body>



</html>