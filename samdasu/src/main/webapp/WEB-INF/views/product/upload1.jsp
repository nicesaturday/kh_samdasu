<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>File Upload</title>
	<style>
	  #header {
	    background-color: white;
	  }
	  #breadcrumb {
	    position: relative;
		top: 10px;
		left: 20px;
	    margin-top: 100px;
	  }
	  
	</style>
</head>
<body>
<%@ include file="/header.jsp" %>
<div id="content">
<div id="breadcrumb" style="width: 100%; height: 50px;">
 <nav class="breadcrumb" aria-label="breadcrumbs">
  <ul>
    <li><a href="${ hpath}">Main</a></li>
    <li><a href="${ hpath}/fileupload/upload">FileUpload</a></li>
  </ul>
 </nav>
 
 <h2>파일 업로드</h2>

	<!-- 파일 업로드에서는 enctype(인코딩타입)을 multipart/form-data로 반드시 설정 -->
	<form action="${hpath}/fileupload/upload" method="post" enctype="multipart/form-data">
		파일 선택 : <input type="file" name="file">
		<input type="submit" value="전송">
	</form>
	
	<a href="${hpath }">홈으로</a>
</div>

</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
