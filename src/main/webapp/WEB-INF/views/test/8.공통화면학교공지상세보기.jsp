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
<title>8.공통화면학교공지상세보기</title>
<!-- css초기화 -->
<link href="resources/css/normalize.css" rel="stylesheet">
<!-- 부트스트랩 -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<!-- 공통 Header -->
			<div class="col-xs-12">
				<img src="http://placehold.it/60x60" /> ~~님 자동로그아웃까지 남은시간30분 00초 <input
					type="button" value="연장"> <input type="button" value="로그아웃">
			</div>
			<!-- Content -->
			<div class="col-xs-12">
				<div class="container">
					<div class="row">
						<div class="col-xs-12">
						<input type="button" value="MyPage">
			   				<input type="button" value="교수관리">
			   				<input type="button" value="학생관리">
			  				<input type="button" value="HelpDesk">
						</div>
						<div class="col-md-2">학교공지, 학과공지, 포털소식, 학사일정
						Q&A, FAQ
						
						</div>
						<div class="col-md-10">
							<div class="row">
								<div class="col-xs-12">
									학교공지 
									제목/작성자/작성일/조회수
									글내용
									
									<button>수정</button>
								    <button>삭제</button>
								</div>
								<div class="col-xs-12">
								조회된 글 리스트(글번호,제목, 작성자, 작성일, 조회수)
								
								</div>
								
								
							</div>


						</div>
					</div>
				</div>









			</div>
			<!-- Footer -->
			<div class="col-xs-12">(c)Copyriget Avengers</div>
		</div>
	</div>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="resources/js/jquery-3.2.1.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>