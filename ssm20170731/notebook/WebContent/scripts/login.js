//我们封装所有关于登录和注册的处理
//页面一旦加载就要给它增加的单击事件
  $(function(){
	  //登录单击事件
	  $("#login").click(checkLogin);
	  //注册单击事件
	  $("#sig_in").click(registUser);
  });
  //账号 zhoujia
  //密码 123  也可以自己注册
  //console.log(xxx):测验代码
  function registUser(){
	  //获取用户输入的信息：
	  var name=$("#regist_username").val().trim();
	  var nick=$("#nickname").val().trim();
	  var password=$("#regist_password").val().trim();
	  var f_password=$("#final_password").val().trim();
	  var ok=true;
	  //结合html页面
	  if(name=""){
		  ok=false;
		  $("#warning_1").show();
		  $("#warning_1 span").html("用户名为空");
	  }  
	  if(password=""){
		  ok=false;
		  $("#warning_2").show();
		  $("#warning_2 span").html("密码为空");
	  } else if(password.length<6){
		  ok=false;
		  $("#warning_2").show();
		  $("#warning_2 span").html("密码长度不能小于6位！");
	  }
	  if(f_password=""){
		  ok=false;
		  $("#warning_3").show();
		  $("#warning_3 span").html("密码不能为空");
	  }
	  if(password!=f_password){
		  ok=false;
		  $("#warning_3").show();
		  $("#warning_3 span").html("两次密码不一致");
	  }
	  //ajax异步请求
	  if(ok){
		  $.ajax({
			  url:base_path+"/user/add.do",
			  type:"post",
			  data:{"name":name,"password":password,"nick":nick},
			  dataType:"json",
			  //回调函数
			  success:function(result){
				  //注册成功
				  if(result.status==0){
					  alert(result.msg);
					  $("#back").click();
				  }else if(result.status==1){					  
					  //用户名被占用
					  $("#warning_1").show();
					  $("#warning_1 span").html(result.msg);
				  }
			  },
			  //如果你需要错误提示
			  error:function(){
				  alert("注册异常");
			  }
		  })
	  }
  }  
  function checkLogin(){
	  var name=$("#count").val().trim();
	  var password=$("#password").val().trim();
	  var ok=true;
	  if(name=""){
		  ok=false;
		  $("#count_span").html("用户名为空");
	  }
	  if(password=""){
		  ok=false;
		  $("#password_span").html("密码为空");
	  }
	  //发送ajax请求到服务器
	  if(ok){
		  $.ajax({
			  //url:请求路径 //type：请求方式  //data:数据 //dataType:数据类型
			  url:base_path+"/user/login.do",
			  type:"post",
			  data:{"name":name,"password":password},
			  dataType:"json",
			  //回调函数
			  success:function(result){
				  if(result.status==0){
					  var user=result.data;//获取返回的user信息
					  //将用户名和密码保存在cookie里面
					  addCookie("uid",user.cn_user_id,2);
					  addCookie("uname",user.cn_user_name,2);
					  window.location.href="edit.html";//跳转到编辑页面
				  }else if(result.status==1){
					  $("#count_span").html("用户名错误");
				  }else if(result.status==2){
					  $("#password_span").html("密码错误");
				  }
			  },
			  error:function(){
				  alert("登陆异常");
			  }
			  
		  });
		  
	  }
	  
  }