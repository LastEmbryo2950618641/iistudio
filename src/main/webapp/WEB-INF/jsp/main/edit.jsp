<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/525station/static/css/layui.css" media="all">
</head>
<body>
    <div class="one">用户名&nbsp;&nbsp;&nbsp;&nbsp;<p>${username}</p></div>
	<form class="layui-form layui-form-pane" action="">
		<div class="layui-form-item">
			<label class="layui-form-label">昵称</label>
			<div class="layui-input-inline">
				<input type="text" name="id" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码</label>
			<div class="layui-input-inline">
				<input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
			</div>
			
		</div>

		<div class="layui-form-item" pane="">
			<label class="layui-form-label">单选框</label>
			<div class="layui-input-block">
				<input type="radio" name="sex" value="男" title="男" checked="">
				<input type="radio" name="sex" value="女" title="女">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">邮箱</label>
				<div class="layui-input-inline">
					<input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">电话号码</label>
				<div class="layui-input-inline">
					<input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
				</div>
			</div>

		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">介绍</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<button class="layui-btn" lay-submit="" lay-filter="demo2">确认</button>
		</div>
	</form>
		<script src="./layui/layui.js" charset="utf-8"></script>
		<script type="text/javascript">
			layui.extend({
				admin: '{/}../../static/js/admin'
			});
			layui.use(['form', 'jquery', 'admin','layer'], function() {
				var form = layui.form,
					$ = layui.jquery,
					admin = layui.admin,
					layer = layui.layer;

				//自定义验证规则
				form.verify({
					nikename: function(value) {
						if(value.length < 5) {
							return '昵称至少得5个字符啊';
						}
					}
				});
				//页面初始化加载
				$(function(){
					setTimeout(function(){
						frameVal();
					},100);
				});  
				function frameVal(){
					var dataId = $('input[name="dataId"]').val();
					var index = parent.layer.getFrameIndex(window.name); 
				    parent.layui.jquery("#memberList tr").each(function(){
				    	if($(this).attr('data-id')==dataId){
				    		console.log($(this));
				    		var tdArr=$(this).children('td');
				    	    var username=$("#username").text();//用户名
				    		var nickname = tdArr.eq(1).text();// 昵称
				    		var pssword= tdArr.eq(2).text();//密码
							var sex = tdArr.eq(3).text(); //性别
							var email = tdArr.eq(4).text(); //邮箱
							var tel = tdArr.eq(5).text(); //电话
							var introduce = tdArr.eq(6).text(); //介绍
							var codeJson = {
							           "username": username,
							           "nickname":nickname,
							           "pssword":password,
							           "gender":sex,
							           "email":email,
							           "tel":tel,
							           "introduce":introduce
							        };
							        alert(codeJson.code);
							        var strJson = JSON.stringify(codeJson);
							        $.ajax ({
							          type: "POST",
							          url: "/525station/Administrator/update",
							          contentType: "application/json; charset=utf-8",
							          data: strJson,
							          dataType: "json",
							          success: function(message) {
							
							$('input[name="username"]').val(username);
							console.log("sex:"+sex);
							$('input[name="sex"][value="'+sex+'"]').attr("checked",true);
							$('input[name="phone"]').val(phone);
							$('input[name="email"]').val(email);
							$('input[name="address"]').val(address);
							form.render();
							
				    	}
				    });
				    }
				   
				
				//监听提交
				form.on('submit(add)', function(data) {
					console.log(data);
					//发异步，把数据提交给php
					layer.alert("增加成功", {
						icon: 6
					}, function() {
						// 获得frame索引
						var index = parent.layer.getFrameIndex(window.name);
						//关闭当前frame
						parent.layer.close(index);
					});
					return false;
				});

			});
		</script>
</body>
</html>