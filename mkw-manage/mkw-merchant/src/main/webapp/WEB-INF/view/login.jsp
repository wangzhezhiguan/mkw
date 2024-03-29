<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>美客威管理系统</title>
		<script type="text/javascript">
			/* 避免ifream出现登录页面 */
			if (top.location.href != self.location.href) {
				top.location.href = "${basePath }";
			}
		</script>
		<link rel="stylesheet" href="${basePath }/static/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="${basePath }/static/plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${basePath }/static/css/login.css" />
	</head>

	<body class="beg-login-bg">
		<div class="beg-login-box">
			<!-- <header>
				<h1>客户端</h1>
			</header> -->
			<div class="beg-login-main">
				<h1>企业版</h1>
				<form>
					<div class="layui-form-item">
						<label class="beg-login-icon">
	                        <i class="layui-icon">&#xe612;</i>
	                    </label>
						<input type="text" id="loginName" autocomplete="off" placeholder="请输入账号" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
	                        <i class="fa fa-key" aria-hidden="true"></i>
	                    </label>
						<input type="password" id="loginPass" autocomplete="off" placeholder="请输入密码" class="layui-input">
					</div>
					<button class="layui-btn login_btn" type="button" id="loginBtn" lay-filter="login">登录</button>
				</form>
			</div>
			<footer>
				<p>美客威管理系统</p>
			</footer>
		</div>
		<script type="text/javascript" src="${basePath }/static/plugins/layui/layui.js?r=${random }"></script>
		<script type="text/javascript" src="${basePath }/static/js/command.js?r=${random }"></script>
		<script type="text/javascript" src="${basePath }/static/module/login.js?r=${random }"></script>
	</body>

</html>