<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>title!!!!!!!!!</title>
	<link rel="stylesheet" href="${hpath }/resources/css/bulma.min.css?after3"/>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script>
	
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
    <li><a href="${hpath }">Main</a></li>
    <li><a href="${hpath }/board/list">BoardList</a></li>
  </ul>
 </nav>
</div>
<input type="text" class="input">
<script>
  $(document).ready(function()) {
	  var ws = new WebSocket("ws://localhost:8091/socket");
	  
	  ws.onopen = function(e) {
		  console.log("info : connection success");
	  }
	  
	  ws.onmessage = function(e) {
		  console.log(e.data);
	  }
	  
	  ws.onclose = function(e) {
		  console.log("info : connection close")
	  }
	  
	  $('#btn1').click(function(e)) {
		  e.preventDefault();
		  ws.send($('msg').val());
	  }
  }
</script>
</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
