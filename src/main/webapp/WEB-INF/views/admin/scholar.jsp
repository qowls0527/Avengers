<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
<title>관리자</title>
<!-- css초기화 -->
<link href="../resources/css/normalize.css" rel="stylesheet">
<!-- 부트스트랩 -->
<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<style>

#bodyWrap{
	width: 1024px;
	background-color: lightgray;
}
#commonHeader{
	width: 1024px;
	height : 60px;
	background-color: gray;
}
#content{
	width:1024px;
	height: 648px;
}

#commonFooter{
	width: 1024px;
	height : 60px;
	background-color: orange;
}

#mainTopLeft{
	width : 512px;
	height: 388.8px;
	background-color: red;
}
#mainTopRight{
	width : 512px;
	height: 388.8px;
	background-color: blue;
}
#mainBoardLeft{
	width : 512px;
	height: 259.2px;
	background-color: yellow;
}
#mainBoardRight{
	width : 512px;
	height: 259.2px;
	background-color: lightblue;
}


#loginForm{
	text-align: center;
	background-color: yellow;
}

#adminTopCategory{
	width: 1024px;
	height: 60px;
	background-color: green;
}

#adminLeftSide{
	width: 170.7px;
	height: 588px;
	background-color: yellow;
}

#adminRightSide{
	width: 853.3px;
	height: 588px;
	background-color: pink;
}
#adminRightSideUp{
	width: 853.3px;
	height: 196px;
	background-color: purple;
}
#adminRightSideCenter{
	width: 853.3px;
	height: 196px;
	background-color: lightblue;
}
#adminRightSideDown{
	width: 853.3px;
	height: 196px;
	background-color: blue;
}

</style>

<body>
	<div class="container" id="bodyWrap">
		<div class="row">
			<!-- 공통 Header -->
			<div class="col-xs-12" id="commonHeader">
				<img src="http://placehold.it/60x60" />
				~~님 자동로그아웃까지 남은시간30분 00초
				<input type="button" value="연장">
				<input type="button"value="로그아웃" onclick="location.href='../main.jsp'">
			</div>
			<!-- Content -->
			<div class="col-xs-12" id="content">


				<div class="row">
					<div class="col-xs-12" id="adminTopCategory">
						<button>MyPage</button>
<button onclick="location.href='professer.jsp'">교수관리</button>
						<button onclick="location.href='student.jsp'">학생관리</button>
						<button onclick="location.href='lecture.jsp'">강의관리</button>
						<button>게시판관리</button>
					</div>
					<div class="col-md-2" id="adminLeftSide">
						<input type="button" value="학생목록" onclick="location.href='student.jsp'">
						<input type="button" value="학생등록" onclick="location.href='studentInsert.jsp'">
						<input type="button" value="휴/복학" onclick="location.href='schoolStatus.jsp'">
						<input type="button" value="등록금" onclick="location.href='register.jsp'">
						<input type="button" value="장학금" onclick="location.href='scholar.jsp'">

					</div>

					<div class="col-md-10" id="adminRightSide">
						
						장학금 신청목록에 대해 볼수 있고 처리완료된 상태도 볼 수 있다.
						
						성적우수장학금 같은 처리는 어떻게 해야할까?

					</div>
				</div>


			</div>
			<!-- Footer -->
			<div class="col-xs-12" id="commonFooter">
				(c)Copyriget Avengers
			</div>
		</div>
	</div>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="../resources/js/jquery-3.2.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="../resources/js/bootstrap.min.js"></script>
</body>
</html>