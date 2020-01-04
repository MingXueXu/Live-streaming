<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta charset="utf-8">
    <title>巴拉直播（balabala)</title>
    <link rel="stylesheet" href="css/base.css"/>
</head>
<body style="background-image: url(images/直播登录.jpg)">
</body>
    <link rel="stylesheet" href="index.css">
</head>
<body>
	<div class="container">
		<!-- 导航 -->
		<div class="nav">
			<ul>
				<li><a href="#">更多</a></li>
				<li><a href="#">我的</a></li>
				<li><a href="#">推荐</a></li>
				<li><a href="#">首页</a></li>
			</ul>
		</div>
		<!-- 主体内容 （登陆界面）-->
		<div class="main">
			<!-- 左侧信息栏 -->
			<div class="sideleft">
				<h1>海量视频   等你观看</h1>
				<h4>当学习与直播结合  又会有怎样的惊喜</h4>
				</br></br></br>
				<p>精品课堂、在线直播。</p>
				<p>打造不一样的学习平台。</p>
				<p>服务学生，创造更好的环境，为其提供及时高效服务。</p>
			</div>
			<!-- 右侧登陆界面 -->
			<div class="sideright">
				<div class="index">
					<form action="/userInfo/login">
						<p class="headline">用户登录</p>
						<p class="astyle">用户名：</p>
						<input type="text" name = "username" value="请输入您的手机号">
						<p class="astyle">密码：</p>
						<input type="text" name = "password" value="请输入密码">
						<button type="submit" value="登录" name="login" >登录</button>
						<#--  </br>
						<p class="bstyle"><input type="checkbox" name="rempas" />  记住密码</p>
						<p class="cstyle">忘记密码</p>
						</br></br>
						<p class="cstyle">没有账号？<a href="zhuce.html">立即注册</a></p>  -->
					</form>
				</div>
			</div>
		</div>
        <!-- 尾部 -->
		<div class="footer">
				<ul>
					<li><a href="#">关于我们</a></li>
					<li><a href="#">在线直播</a></li>
					<li><a href="#">高端学习平台</a></li>
					<li><a href="#">客服热线：000-8887633</a></li>
				</ul>
		</div>
	</div>
</body>
</html>

