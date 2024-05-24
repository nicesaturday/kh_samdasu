<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>Board List</title>
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
	  #table {
	    width: 100%;
	    display: flex;
	    justify-content: center;
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
<div id="table">
<table class="table" >
  <thead>
    <tr>
      <th><abbr title="Position">번호</abbr></th>
      <th>Team</th>
      <th><abbr title="Played">제목</abbr></th>
      <th><abbr title="Won">내용</abbr></th>
      <th><abbr title="Drawn">날짜</abbr></th>
      <th><abbr title="Lost">방문자</abbr></th>
    </tr>
  </thead>
  <tbody>
   <c:forEach var="item" items="${boardList }" varStatus="status">
    <tr>
      <th>${status.count }</th>
      <td>
        <a href="${hpath }/board/one?bnum=${item.bnum }">
         <strong>${item.btitle }</strong>
        </a>
      </td>
      <td>${item.btitle }</td>
      <td>${item.author }</td>
      <td>${item.resdate }</td>
      <td>${item.vcnt }</td>
    </tr>
    </c:forEach>
</tbody>
</table>
</div>
</div>

<%@ include file="/footer.jsp" %>
</body>
</html>
