/**
 * 
 */

function ajax(url,type,dataType,data,callback,error){
	$.ajax({
		url : url,
		type : type,
		dataType : dataType,
		data : data,
		success : callback,
		error : error
	})
}

var ajaxError = function(error){
	alert("에러가 발생했습니다. 관리자에게 문의하세요.")
}