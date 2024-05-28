<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>Board Edit</title>
	<link rel="stylesheet" href="${hpath }/resources/css/bulma.min.css?after3"/>
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
    <li><a href="hpath/board/edit">BoardEdit</a></li>
  </ul>
 </nav>
 <form action="${hpath }/board/upBoard" method="post">
 <input type="hidden" name="bnum" value="${board.bnum }"/>
 <input
  class="input is-link"
  name="btitle"
  type="text"
  placeholder="title"
  value="${board.btitle }"
/>
 <textarea class="textarea" name="bcomment" placeholder="comment">${board.bcomment }</textarea>

 <div class="buttons">
  <button type="submit" class="button is-warning">UPDATE</button>
</div>
 </form>
 
 
 
</div>

</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
