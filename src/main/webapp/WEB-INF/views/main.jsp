<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="resources/js/jquery-3.3.1.min..js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
html,body,div,span,a,ul,li{margin:0; padding:0; outline:0;}
a{text-decoration:none; color:black;}
li{text-align:center; list-style:none;}
ul{font-size:0;}
#header{width:100%; height:200px; background:pink; text-align:center; line-height:200px;}
#header a{font-size:70px; font-weight:bolder;}

#nav{width:100%; height:100px;}
#nav ul{width:100%; height:100px; line-height:100px; display:flex;}
#nav li{width:20%; height:100px; border:none;}
#nav a{font-size:20px; font-weight:bolder; display:block; width:100%; height:100%; background-color:gray;}

#center{width:100%; height:1200px; border:1px solid black; background:blue;}
</style>
</head>
<body>
	<div id="header">
		<a href="#">JunOrder</a>
	</div>
	<div id="nav">
		<ul>
			<li><a id="cate_hot"href="#">HOT</a></li>
			<li><a id="cate_ice"href="#">ICE</a></li>
			<li><a id="cate_ade"href="#">ADE</a></li>
			<li><a id="cate_bread"href="#">BREAD</a></li>
			<li><a id="cate_desert" href="#">DESERT</a></li>
		</ul>
	</div>   
	<div id="center">
		
	</div>
	
<script type="text/javascript">
$(document).ready(function(){
	$("#nav").find("a").click(function(){
		var cate = $(this).attr("id").substring($(this).attr("id").lastIndexOf("_")+1);
		console.log(cate);
		var cate_nm = $(this).html();
		console.log(cate_nm);
		$("#nav").find("a").css({"background-color":"gray","border":"none"});
		$(this).css({"background-color":"white","border":"1px solid #D8D8D8","border-bottom":"none"});
		
		$.ajax({
			url : "selectListProduct",
			type : "get",
			dataType : "json",
			data : {
				cate_nm : cate
			},
			success : function(data){
				var data = data.productList;
				console.log(data);
			}
		})
		
	})
})
</script>
</body>
</html>