<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" width="500px">
		<tr>
			<td colspan="7">人员列表</td>
		</tr>
		<tr style="text-align: center">
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>等级</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.list}" var="l">
			<tr style="text-align: center">
				<td>${l.id }</td>
				<td>${l.name }</td>
				<td>${l.sex }</td>
				<td>${l.age }</td>
				<td>${l.rank }</td>
				<td>${l.department }</td>
				<td><a href="javascript:void(0)" onclick="del(${l.id })" style="text-decoration: none">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<form action="add.jsp" method="post">
		<input style="margin-left: 200px" type="submit" value="添加人员">
	</form>
	<script type="text/javascript">
		$(function() {
			$("tr:odd").css("background-color", "#00E000");
			$("tr:even").css("background-color", "#66FFFF");
		})
		
		function del(id){
			var flag=confirm("确定要删除吗？");
			if(flag){
				$.get("GetAll?cao=del","id="+id,function(data){
					if(data=="true"){
						alert("删除成功");
						location.href="GetAll";
					}else{
						alert("删除失败");
					}
				})
			}
		}
	</script>
</body>
</html>