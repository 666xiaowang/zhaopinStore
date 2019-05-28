<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<script id="allmobilize" charset="utf-8"
	src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld" />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册-拉勾网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="拉勾网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在拉勾网" name="description">
<meta
	content="拉勾,拉勾网,拉勾招聘,拉钩, 拉钩网 ,互联网招聘,拉勾互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 拉勾官网, 拉勾百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招"
	name="keywords">

<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
	var ctx = "h";
	console.log(1);
</script>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css" />

<script src="style/js/jquery.1.10.1.min.js" type="text/javascript"></script>

<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script type="text/javascript" src="style/js/core.min.js"></script>

<script type="text/javascript">
	var youdao_conv_id = 271546;
</script>
<script type="text/javascript" src="style/js/conv.js"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
</head>
<body>
<body id="login_bg">
	<div class="login_wrapper">
		<div class="login_header">
			<a href="h/"><img src="style/images/logo_white.png" width="285"
				height="62" alt="拉勾招聘" /></a>
			<div id="cloud_s">
				<img src="style/images/cloud_s.png" width="81" height="52"
					alt="cloud" />
			</div>
			<div id="cloud_m">
				<img src="style/images/cloud_m.png" width="136" height="95"
					alt="cloud" />
			</div>
		</div>

		<input type="hidden" id="resubmitToken"
			value="9b207beb1e014a93bc852b7ba450db27" />
		<div class="login_box">
			<form id="loginForm"
				action="${pageContext.request.contextPath }/UserServlet?method=regist"
				method="post">
				<ul class="register_radio clearfix">
					<li>找工作 <input type="radio" value="0" name="type"
						checked="checked" />
					</li>
					<li>招人 <input type="radio" value="1" name="type" />
					</li>
				</ul>
				<input type="text" id="name" name="name" placeholder="请输入真实姓名" /> 
				<input type="text" id="email" name="email" placeholder="请输入邮箱地址" /> 
				<span class="error" style="display: none;" id="beError"></span>
				<input type="password" id="password" name="password" placeholder="请输入登录密码" />
				<ul class="profile_radio clearfix reset">
					<li class="current">男<em></em> <input type="radio" checked="checked" name="gender" value="男"></li>
					<li>女<em></em> <input type="radio" name="gender" value="女"></li>										
				</ul>	
				<input type="text" id="topDegree" name="topDegree" placeholder="请输入学历:大专|本科|硕士|博士|其他" />
				<input type="text" id="phoneno" name="phoneno" placeholder="请输入联系电话" />
				<input type="text" id="workyear" name="workyear" placeholder="告诉我们您的工作经验" />
				<input type="text" id="currentState" name="currentState" placeholder="当前状态" />
				
																				
				<label class="fl registerJianJu" for="checkbox">
				<input type="checkbox" id="checkbox" name="checkbox" class="checkbox valid" />我已阅读并同意
					<a href="h/privacy.html" target="_blank">《拉勾用户协议》</a>
				</label> <input type="submit" id="submitLogin" value="注 &nbsp; &nbsp; 册" />

				<!--  <input type="hidden" id="callback" name="callback" value=""/>
                <input type="hidden" id="authType" name="authType" value=""/>
                <input type="hidden" id="signature" name="signature" value=""/>
                <input type="hidden" id="timestamp" name="timestamp" value=""/> -->
			</form>
			<div class="login_right">
				<div>已有拉勾帐号</div>
				<a href="login.html" class="registor_now">直接登录</a>
				<div class="login_others">使用以下帐号直接登录:</div>
				<a href="h/ologin/auth/sina.html" target="_blank" class="icon_wb"
					title="使用新浪微博帐号登录"></a> <a href="h/ologin/auth/qq.html"
					class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录"></a>
			</div>
		</div>
		<div class="login_box_btm"></div>
	</div>

	<script type="text/javascript">
		$(document)
				.ready(
						function(e) {
							$('.register_radio li input').click(
									function(e) {
										$(this).parent('li')
												.addClass('current').append(
														'<em></em>').siblings()
												.removeClass('current').find(
														'em').remove();
									});
							$('.profile_radio li input').click(
									function(e) {
										$(this).parent('li')
												.addClass('current').append(
														'<em></em>').siblings()
												.removeClass('current').find(
														'em').remove();
									});

							$('#email').focus(function() {
								$('#beError').hide();
							});
							//验证表单
							$("#loginForm")
									.validate(
											{
												rules : {
													nickname : {
														required : true
													},
													email : {
														required : true,
														email : true
													},
													password : {
														required : true,
														rangelength : [ 6, 16 ]
													},
													checkbox : {
														required : true
													}
												},
												messages : {
													nickname : {
														required : "请输入您的昵称"
													},
													email : {
														required : "请输入常用邮箱地址",
														email : "请输入有效的邮箱地址，如：vivi@lagou.com"
													},
													password : {
														required : "请输入密码",
														rangelength : "请输入6-16位密码，字母区分大小写"
													},
													checkbox : {
														required : "请接受拉勾用户协议"
													}
												},
												errorPlacement : function(
														label, element) {
													if (element.attr("type") == "radio") {
														label
																.insertAfter(
																		$(
																				element)
																				.parents(
																						'ul'))
																.css(
																		'marginTop',
																		'-20px');
													} else if (element
															.attr("type") == "checkbox") {
														label
																.insertAfter(
																		$(
																				element)
																				.parent())
																.css('clear',
																		'left');
													} else {
														label
																.insertAfter(element);
													}
													;
												}
											});
						});
	</script>
</body>
</html>