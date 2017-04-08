/**
 * b_insert.js
 * 입력페이지
 */

$(document).ready(function (){
	console.log("b_insert.js 들어옴");
	
	/*
	 * 페이지 초기화
	 * */
	pageMethod.pageInit();
	

	

	
	/*
	 * 테스트용
	 * */
	//Range 생성 함수화
	makeRange(3);

	$("input[name=tsvalue]").change(function (){
//		console.log( $(this) );
//		console.log( $(this).attr("id") );
//		console.log( $(this).attr("id").split("_") );
		
		var idCount = $(this).attr("id").split("_");
		console.log("넣을 곳 : " +  JSON.stringify($("#tc_"+idCount[1])) );
		console.log("넣을 데이터 : " + $(this).val() );
		$("#tc_"+idCount[1]).text($(this).val());
	});
	
//	메서드화
	function makeRange(idx){
		var html = "";
		for (var int = 0; int < idx; int++) {
			html += 
				"<input type='range' min='-3' max='+3' value='0' step='0.1' id='tsvalue_"+int+"' name='tsvalue' style='background-color:orange'/>" +
				"<span id='tc_"+int+"'>0</span><br><br>";
		}
		$("#rangeDiv").empty();
		$("#rangeDiv").append(html);
	}

});

var pageMethod = {

		/**
		 * 페이지 초기화
		 */
		pageInit : function (){
			console.log("로그1");
			//이름 데이터 가져오기
			$.ajax({
				type: "post",
				url : "http://localhost:9001/dinner/getNames_select.do",
				//dataType : "json",
				contentType : "application/json; charset=utf-8",
				success : function (result){
					if(result != null || result != ""){
						console.log(result);
					} else {
						console.log("ajax result 값이 없습니다.");
					}
				},
			});
		},
		
		/**
		 * 이름 뿌리기
		 */
		nameSpreader : function (){
			
		},
		
		/*
		 * 오키 질문 테스트
		 * */
		showValue : function (newValue,paramId){
			document.getElementById("tc"+paramId).innerHTML=newValue;
		}




}