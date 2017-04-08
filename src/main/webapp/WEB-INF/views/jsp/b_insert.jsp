<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>야식자</title>
		<script type="text/javascript" src="resources/a_common/js/commonSource.js"></script>
		<script type="text/javascript" src="resources/b_insert/js/b_insert.js"></script>
	</head>
	
	<body>
		<div class="wrapper">
			<div id="container">
				<p style="display:none">출력 테스트</p>
				<p style="display:none">넘어온 값 :  ${data}</p>
				
				<section class="mgt20">
					<div style="margin-left:auto; margin-right:auto" id="selectDay">
						<div style="display:inline ">
							<h2 class="titletxt">일자 선택</h2>
						</div>
						<div style="display:inline;width:auto;height:40px"  >
							<input type="date" name="" id="" />
							<a href="" class="ui-link" >
								<img alt="재조회" width="30px" height="auto" src="resources/a_common/img/reload_btn.png" >
							</a>
						</div>
					</div>
				</section>
				
				<section class="tblSection mgt20">
					<h2 class="" style="text-align:left;font-size:1em;font-weight:700;">사람 선택</h2>
					<table class="basictblR">
						<caption>먹은사람</caption>
						<colgroup>
							<col width="25%">
							<col width="25%">
							<col width="25%">
							<col width="25%">
						</colgroup>
						<tbody id="users">
							<tr><th>이름</th><td>이름</td><th>이름</th><td>이름</td></tr>
							<tr><td>길동</td><th>길동</th><td>길동</td><th>길동</th></tr>
							<tr><th>개똥</th><td>개똥</td><th>개똥</th><td>개똥</td></tr>
						</tbody>
					</table>
				</section>
				
				<section class="mgt30">
					<table class="basictblR">
						<caption>계산</caption>
						<colgroup>
							<col width="30%">
							<col width="70%">
						</colgroup>
						<tbody id="calc">
							<tr>
								<th>금액입력</th>
								<td><input type="number" min="0" name="" id="" /></td>
							</tr>
						</tbody>
					</table>
				</section>
				
				<section class="infoSection mgt25">
					<div class="txtcnt">
						<a id="submitProcess" style="width:100px; height:auto" href="" class="btn">전 송</a>
					</div>
				</section>


				<!-- 테스트용 -->
				<!-- jsp 에서 javascript 사용하고 있습니다.
				type=range 로 해서 슬라이드 바 여러개 만들고 슬라이드 바에 입력하는 값만큼 보여주기 위해 
				함수를 만들어 쓰려고 합니다.  위 코드는 슬라이더 하나만 만든건데..
				여러개 만들고 같은 함수를 사용할 시, 각 id 로 어떻게 다른 값을 보내야할 지 모르겠습니다. 
				ㅠㅠ 도와주세요.. -->
				<br><h2><b>시험테스트</b></h2>		
				<br><h3>&nbsp;&nbsp;Range 생성 함수화</h3><br>
				<div id="rangeDiv">
<!-- 					<input type="range" min="-3" max="+3" value="0" step="0.1" name="tsvalue" style="background-color:orange"/> -->
<!-- 					<span id="tc">0</span><br> -->
				</div>
				
				<br><br><h3>&nbsp;&nbsp;Range 함수 여러 id 받기</h3><br>
				<input type="range" id="1" min="-3" max="+3" value="0" step="0.1" onchange="pageMethod.showValue(this.value,this.id)" name = "tsvalue" style="background-Color:green"/>
				<span id="tc1">0</span><br><br>
				
				<input type="range" id="2" min="-3" max="+3" value="0" step="0.1" onchange="pageMethod.showValue(this.value,this.id)" name = "tsvalue" style="background-Color:green"/>
				<span id="tc2">0</span><br><br>
				
				<input type="range" id="3" min="-3" max="+3" value="0" step="0.1" onchange="pageMethod.showValue(this.value,this.id)" name = "tsvalue" style="background-Color:green"/>
				<span id="tc3">0</span><br><br>
				
				<!-- <script type="text/javascript">
					function showValue(newValue,paramId){
						document.getElementById("tc"+paramId).innerHTML=newValue;
					}
				</script> -->	

				
			</div>
		</div>
	</body>
</html>
