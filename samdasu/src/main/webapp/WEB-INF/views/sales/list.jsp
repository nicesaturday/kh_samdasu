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
    <li><a href="hpath">Main</a></li>
    <li><a href="hpath/board/list">BoardList</a></li>
  </ul>
 </nav>
</div>

</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
