<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>title!!!!!!!!!</title>
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
    <li><a href="${hpath}">Main</a></li>
    <li><a href="${hpath}/fileupload/check">FileCheck</a></li>
  </ul>
 </nav>
     <h2>파일 업로드 성공</h2>

	<div>
		<ul>
			<li>${fileRealName }</li>
			<li>${size }</li>
			<li>${uuid }</li>
			<li>${uuidName }</li>
		</ul>
	</div>
	<a href="${hpath }">홈으로</a>
</div>

</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
