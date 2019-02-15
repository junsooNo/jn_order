<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="resources/js/jquery-3.3.1.min..js"></script>
<script type="text/javascript" src="resources/js/common.js"></script>

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

#center{width:100%; height:1200px; border:1px solid black;}
#center div:first-child {width:90%; height:90%; margin:5% 5%; border:1px solid black; overflow-y:scroll;}
#center table{width:100%;}
#center table td{text-align:center; width:33.33%; height:300px;}
</style>
</head>
<body>
	<div id="header">
		<a href="#">JunOrder</a>
	</div>
	<div id="nav">
		<ul>
			<c:forEach var="categoryList" items="${categoryList }">
				<li><a id="cate_${categoryList.cate_no }"href="#">${categoryList.cate_nm }</a></li>
			</c:forEach>
		</ul>
	</div>   
	<div id="center">
		<div>
			<table id="product_list">
			
			</table>
		</div>
	</div>
	
<script type="text/javascript">
$(document).ready(function(){
	
	/*
	*카테코리 클릭 시 이벤트
	*/
	$("#nav").find("a").click(function(){
		var cate_no = $(this).attr("id").substring($(this).attr("id").lastIndexOf("_")+1);
		$("#nav").find("a").css({"background-color":"gray","border":"none"});
		$(this).css({"background-color":"white","border":"1px solid #D8D8D8","border-bottom":"none"});
		console.log(cate_no)
		var data = {cate_no : cate_no}
		ajax("selectListProduct","get","json",data,function(data){
			var productList = data.productList;
			console.log(data);
			var html = "";
			$.each(productList,function(i){
				if(i % 3 == 0){
					html += "<tr>";
				}
				html += "<td id='product_"+productList[i].product_no+"' style='position:relative;'>";
				html += 	"<img src='resources/product_image/"+productList[i].product_image+"' style='width:100%; height:100%;'>";
				html += 	"<div style='position:absolute; width:100%; height:100px; bottom:0; background-color:white; opacity:0.5;'>";  
				html += 		"<p style='font-size:20px; font-weight:bolder;'>"+productList[i].product_nm+"</p>";
				html += 		"<p style='font-size:20px; font-weight:bolder;'>"+productList[i].product_price_str+"</p>";
				html += 	"</div>";
				html += "</td>";
			})
			$("#product_list").html(html)
		},
		function(error){
			alert("error...")
		})
		
	})
	
	// 상품 정보 가져오기
	$(document).on("click","td[id*='product_']",function(){
		var product_no = $(this).attr("id").substring($(this).attr("id").lastIndexOf("_")+1);
		console.log(product_no);
		var data = {product_no : product_no};
		ajax("selectOneProduct","get","json",data,function(data){
			var productInfo = data.productInfo;
			console.log(productInfo)
			
			var html = "";
			html += "<div id='product_info_body' style='width:80%; height:1000px; border:1px solid black; position:fixed; top:20%; left:10%; background-color:white;'>";
			html += 	"<div style='width:100%; height:10%; border-bottom:1px solid black;'>";
			html += 		"<a href='#' id='close_btn' style='width:100px; height:100%; float:right; text-align:center; line-height:100px;'>";
			html += 			"<span style='font-size:60px;'>X</span>";
			html += 		"</a>";
			html += 	"</div>";
			html += 	"<div style='width:100%; height:70%;'>";
			html += 		"<div style='width:90%; height: 90%; margin:5% 5%; border:1px solid black; border-radius:20px 20px 20px 20px; position:relative;'>";
			html += 			"<img src='resources/product_image/"+productInfo.product_image+"' style='width:100%; height:100%;'>";
			html += 			"<div style='width:100%; height:30%; background-color:white; opacity:0.5; position:absolute; bottom:0; text-align:center;'>";
			html += 				"<p style='font-size:60px; font-weight:bolder; opacity:1;'>"+productInfo.product_nm+"</p>";
			html += 			"</div>";
			html += 			"<p style='font-size:60px; font-weight:bolder;'>"+productInfo.product_price_str+"</p>"; 
			html += 		"</div>";
			html += 	"</div>";
			html += "</div>";
			$("body").append(html)
		},
		ajaxError)
	})
	
	$(document).on("click","#close_btn",function(){
		$("#product_info_body").remove();
	})
})
</script>
</body>
</html>