<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인터랙티브 타임슬라이스 시스템 연동 테스트 - CMS</title>
</head>
<!-- <body leftMargin=0 topMargin=0 marginheight="0" marginwidth="0"> -->
<body>
<jsp:include page="include.jsp" />
<h2>인터랙티브 타임슬라이스 시스템 연동 테스트 - CMS</h2>
<br>
<form name="AttchForm" method="get">
PARAM : <input type="text" name="PARAM" value="" size="20"/> &nbsp; 
</form>
<hr>
<br>
<a href="apiIndex">=== 목차 ===</a>
<br><br>
<a target="_blank" onclick="doAttach('/camera/camInfo');">* 전체 카메라 정보 조회</a>
<br><br>
<a target="_blank" onclick="doAttach('/camera/camInfo/');">* 특정 카메라 정보 조회</a>
<br><br>
<a target="_blank" onclick="doAttach('/monitoring/control/');">* 전체 시스템 동작 제어</a>
<br><br>
<a target="_blank" onclick="doAttach('/camera/camState');">* 전체 카메라 동작 상태 조회</a>
<br><br>
<a target="_blank" onclick="doAttach('/camera/camState/');">* 특정 카메라 동작 상태 조회</a>
<br><br>
<!-- <a target="_blank" onclick="doAttach('/camera/colState');">* 전체 카메라 영상 수집 상태 조회</a>
<br><br>
<a target="_blank" onclick="doAttach('/camera/colState/');">* 특정 카메라 영상 수집 상태 조회 </a>
<br><br> -->
</body>
</html>