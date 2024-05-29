<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>Product List</title>
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
    <li><a href="${hpath}">Main</a></li>
    <li><a href="${hpath}/product/list">ProductList</a></li>
  </ul>
 </nav>
 </div>
     <h2>Product List</h2>
     <div class="fixed-grid has-3-cols">
	 <c:forEach var="item" items="${productList }" varStatus="status">
	  <div class="card">
  		<div class="card-image">
   		 <figure class="image is-4by3" style="width: 300px; height: 300px; overflow: hidden">
      		<img
        		src="${hpath }/resources/upload/${item.img }"
        		alt="상품 이미지"
      		/>
    	 </figure>
  	 	</div>
  		<div class="card-content">
    	 <div class="media">
      		<div class="media-content">
        		<p class="title is-4">${item.pname }</p>
        		<p class="subtitle is-6">${item.pcomment }</p>
      		</div>
    	</div>
        <div class="content">${item.pprice }</div>
    	</div>
		</div>
	</c:forEach>
	</div>
	
	<div class="buttons">
  		<button class="button is-primary"><a href="${hpath }/product/up">삼품 등록</a></button>
	</div>
	</div>
<%@ include file="/footer.jsp" %>
</body>
</html>
