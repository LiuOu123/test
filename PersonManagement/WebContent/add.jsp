<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="GetAll?cao=add" method="post">
<table width="400px">
		<tr >
			<td colspan="2"><a style="color: red;text-align: center;margin-left:160px">添加人员</a></td>
		</tr>
		<tr>
			<td style="text-align: center">姓名：</td>
			<td><input type="text" name="name"><a style="color: red">*</a></td>
		</tr>
		<tr>
			<td style="text-align: center">性别：</td>
			<td><select name="sex">
			<option value="0">请选择</option>
			<option value="男">男</option>
			<option value="女">女</option>
			</select>
			<a style="color: red">*</a></td>
		</tr>
		<tr>
			<td style="text-align: center">年龄：</td>
			<td><input type="text" name="age"><a style="color: red">*</a></td>
		</tr>
		<tr>
			<td style="text-align: center">等级：</td>
			<td><select name="dengji">
			<option value="0">请选择</option>
			<option value="1级">1级</option>
			<option value="2级">2级</option>
			<option value="3级">3级</option>
			<option value="4级">4级</option>
			<option value="5级">5级</option>
			</select>
			<a style="color: red">*</a></td>
		</tr>
		<tr>
			<td style="text-align: center">部门：</td>
			<td><select name="bumen">
			<option value="0">请选择</option>
			<option value="支持部">支持部</option>
			<option value="工程质量部">工程质量部</option>
			<option value="开发部">开发部</option>
			</select>
			<a style="color: red">*</a></td>
		</tr>
		<tr>
			<td colspan="2"><input style="margin-left:160px" type="submit"  value="提交"></td>
		</tr>
	</table>
		</form>
	<script type="text/javascript">
		$(function() {
			$("tr:odd").css("background-color", "#00E000");
			$("tr:even").css("background-color", "#66FFFF");
		})
		
		$("form").submit(function(){
			var name=$("[name='name']").val();
			if(name==""){
				alert("姓名不能为空!!!")
				return false;
			}
			var sex=$("[name='sex']").val();
			if(sex=="0"){
				alert("性别不能为空!!!")
				return false;
			}
			var age=$("[name='age']").val();
			if(age==""){
				alert("年龄不能为空!!!")
				return false;
			}
			var dengji=$("[name='dengji']").val();
			if(dengji=="0"){
				alert("等级不能为空!!!")
				return false;
			}
			var bumen=$("[name='bumen']").val();
			if(bumen=="0"){
				alert("部门不能为空!!!")
				return false;
			}
			
			return true;
		})
	</script>
</body>
</html>