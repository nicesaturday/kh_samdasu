<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>Product UP</title>
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
    <li><a href="${ hpath}">Main</a></li>
    <li><a href="${ hpath}/product/up">Product Up</a></li>
  </ul>
 </nav>
 
    <div class="control" style="width: 100%; display: flex; justify-content: center">
     <!-- 파일 업로드에서는 enctype(인코딩타입)을 multipart/form-data로 반드시 설정 -->
	<form action="${hpath}/product/up" method="post" enctype="multipart/form-data">
		<div class="select">
    		<select name="cate">
      			<option value="음료">음료</option>
     			<option value="물">물</option>
     			<option value="젤리">젤리</option>
     			<option value="스낵">스낵</option>
    		</select>
  		</div>
  		<input class="input" type="text" name="pname" placeholder="상품명">
	    <textarea class="textarea" name="pcomment" placeholder="상품 설명"></textarea>
	    <input type="number" min="0" step="100" value="500" name="pprice" id="pprice" class="input" />
	    <input class="input" type="file" name="img" placeholder="사진 업로드">
	    <input class="input" type="file" name="img2" placeholder="사진 업로드2">
	    <input class="input" type="file" name="img3" placeholder="사진 업로드3">
		<div class="buttons">
  			<button type="submit" class="button is-primary is-light">등록</button>
		</div>
	</form>
  		
	</div>
	
</div>

</div>


<%@ include file="/footer.jsp" %>
</body>
</html>
