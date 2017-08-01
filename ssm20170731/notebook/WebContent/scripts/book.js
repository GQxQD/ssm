/**本页面封装关于笔记本的处理*/
//直接加载笔记本列表
function loadUserBooks(){
	//获取请求参数
	var userId=getCookie("uid");
	//检查格式
	if(userId==null){
		window.location.href="log_in.html";	
	}else{
		//异步请求ajax
		$.ajax({
			url:base_path+"/book/load.do",
			type:"post",
			data:{"userId":userId},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					//返回笔记本集合
					var books=result.data;
					for(var i=0;i<books.length;i++){
						var bookId=books[i].cn_notebook_id;
						var bookName=books[i].cn_notebook_name;
						//创建笔记本列表
						createBookLi(bookId,bookName);
					}
				}
			},
			error:function(){
				alert("加载笔记本异常")
			}
		})		
	}
}
//根据用户笔记本数量不同，createBookLi创建笔记本列表展示
function createBookLi(bookId,bookName){
	//构建笔记本列表元素（li)
	var sli="";
	sli+='<li class="online">';
	sli+=   '<a>';
	sli+=      '<i class="fa fa-book" title="online" rel="tooltip-bottom">';
	sli+=       '</i>'+bookName;
	sli+=   '</a>';
	sli+='</li>';
	//将bookId绑定到li元素上
	var $li=$(sli);
	$li.data("bookId",bookId);
	$("#book_ul").append($li);
}
//确定创建笔记本
function createBook(){
	//获取请求参数
	var userId=getCookie("uid");
	var bookName=$("#input_notebook");
	var ok=true;
	if(bookName==""){
		$("#notebook_span").html("笔记本名称不能为空");
		ok=false;
	}
	if(userId==null){
		window.location.href="log_in.html";
		ok=false;
	}
	if(ok){
		$.ajax({
			url:base_path+"/book/add.do",
			type:"post",
			data:{"userId":userId,"bookName":bookName},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					//关闭小弹框
					closeAlertWindow();
					var bookId=result.data.cn_notebook_id;
					var bookName=result.data.cn_notebook_name;
					createBookLi(bookId,bookName);
					//提示用户ok了
					alert(result.msg);
				}
			},
			error:function(){
				alert("创建失败");
			}
		});
	}
}
//修改笔记本名字（update)
function updateBookName(){
	//获取值
	
	var bookName=$("#input_notebook_rename").val();
	var $li=$("#book_ul a.checked").parent();
	var bookId=$li.data("bookId");
	var ok=true;
	if(bookId==null){
		window.location.href="log_in.html";
		ok=false;
	}
	if(bookName==""){
		$("#rename_span").html("您的笔记本名称为空");
		ok=fasle;
	}
	if(ok){
		$.ajax({
			url:base_path+"/book/rename.do",
			type:"post",
			data:{"bookId":bookId,"bookName":bookName},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					$("#book_ul a.checked").html(
							'<i class="fa fa-book" title="online" rel="tooltip-bottom"></li>'+bookName);
					//提示用户
					alert(result.msg);
					
				}
			},
			error:function(){
				alert("修改笔记本失败");
			}
		});
	}
}











