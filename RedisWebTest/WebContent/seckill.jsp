<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>秒杀</title>
<link href="static/bs/css/bootstrap.min.css" rel="stylesheet" />
<script  type="text/javascript" src="static/jquery/jquery-3.1.0.js"></script>
<script  src="static/bs/js/bootstrap.min.js"   ></script>
</head>
<body style="padding:20px;">
<h1>iPhoneX !!!  1元秒杀！！！
</h1>


<form id="msform" action="secKillServlet">
	<input type="hidden" id="prodid" name="prodid" value="1001">
	<button type="button" class="btn btn-success" id="miaosha_btn" name="seckill_btn">秒杀点我</button>
</form>

</body>

<script  type="text/javascript">
$(function(){
	$("#miaosha_btn").click(function(){	 
		var url=$("#msform").attr("action");
	     $.post(url,$("#msform").serialize(),function(data){
     		if(data=="false"){
    			alert("抢光了" );
    			$("#miaosha_btn").attr("disabled",true);
    		}
		} );    
	})
})
</script>
</html>