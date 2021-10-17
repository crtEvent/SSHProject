/**
 * 
 */

$(document).ready(function(){
	
	// 거래처명검색
	$('input[name=company_name_keyword]').keyup(function() {
		$.ajax({
			url: "/ssh/company/search.do",
			type: 'post',
			data: {company_name_keyword : $('input[name=company_name_keyword]').val()},
			success: function(result){
				console.log(result);
				//var html = $('<tbody>').html(result);
				//var contents = html.find("tbody#ajaxReturnSearchCompanyList").html();
				//$("tbody#ajaxReturnSearchCompanyList").html();
				$("#returnSearchCompanyList").html(result);
			},
			error: function(){
				alert("company_name_keyword 검색 에러");
			}
		})
	})
})