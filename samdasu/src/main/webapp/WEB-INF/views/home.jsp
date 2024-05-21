<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<%@ include file="/head.jsp" %>
	<title>Home</title>
<style>
  .section {
    width: 100%;
    height: 100%;
    background-color: #F1F1F1;
  }
  .section .box {
    height: 650px;
    padding: 150px 190px;
    text-align: center;
  }
  .section .box.box1 {
    font-family: 'DM Sans', sans-serif; 
    letter-spacing: 2px;
    min-width: 700px;
  }
  #samdasoo {
    position: fixed;
    top:30%;
    right: 42%;
    z-index: 3;
  }
   .section .box.box1 p:nth-child(1) {
    color: #0066FF;
    letter-spacing: 2px;
    font-size: 50px;
    
  }
  .section .box.box1 p:nth-child(2) {
    letter-spacing: 2px;
    color: #A1A1A1;
    font-size: 35px;
  }
  .section .box.box1 p:nth-child(6) {
    color: #0066FF;
    letter-spacing: 40px;
    font-weight: 1000;
    font-size: 200px;
  }
  .section .box.box1 p:nth-child(7) {
    color: #0066FF;
    letter-spacing: 40px;
    font-weight: 1000;
    font-size: 200px;
  }
  #samdasoo img {
      width: 220px;
      height: 500px;
    }
  @media (max-width: 1500px) {
    .section .box.box1 p:nth-child(6) {
      font-size: 150px;
    }
    .section .box.box1 p:nth-child(7) {
      font-size: 150px;
    }
    #samdasoo img {
      width: 180px;
      height: 400px;
    }
  }
  
  @media (max-width: 1300px) {
    .section .box.box1 p:nth-child(6) {
      font-size: 120px;
    }
    .section .box.box1 p:nth-child(7) {
      font-size: 120px;
    }
    #samdasoo img {
      width: 150px;
      height: 400px;
    }
  }
   @media (max-width: 1130px) {
    .section .box.box1 p:nth-child(6) {
      font-size: 90px;
    }
    .section .box.box1 p:nth-child(7) {
      font-size: 90px;
    }
    #samdasoo img {
      width: 120px;
      height: 350px;
    }
  }
  @media (max-width: 1050px) {
  .section .box.box1 p:nth-child(2) {
      font-size: 0;
    }
    .section .box.box1 p:nth-child(3) {
      font-size: 0;
    }
    .section .box.box1 p:nth-child(6) {
      font-size: 60px;
    }
    .section .box.box1 p:nth-child(7) {
      font-size: 60px;
    }
    #samdasoo {
      top: 20%;
    }
    #samdasoo img {
      width: 80px;
      height: 200px;
    }
    .section .box {
      display: flex;
      flex-direction: column;
      align-items: center;
    }
    .section .box.box1 {
      min-width: 0;
    } *
  }
  //900px부터 더 줄인다.
  
</style>
</head>
<body>
<div id="content">
<%@ include file="/header.jsp" %>
  <div class="section" id="section01">
    <div class="box box1">
      <div id="samdasoo">
        <img src="${hpath}/resources/imgs/samdasoo.png " alt="samdasoo">
      </div>
      <p style="color: #0066FF;  font-weight: 1000; ">The WATER</p>
      <p style="color: #A1A1A1;  font-weight: 200; ">깨끗하고, 건강하고, 맛있는 물</p>
      <br><br>
      <p style="padding-left: 50px">BETTER</p>
      <p style="padding-left: 50px; position: relative; z-index: 10;">CHOICE</p>
    </div>    
  </div>
  <div class="section" id="section02">
    <div class="box box1">
      <p style="color: #fff;  font-weight: 1000; ">ONLY ONE</p>
      <p style="color: #fff;  font-weight: 200; ">진정한 제주다움 실현</p>
      <br><br>
      <p style="padding-left: 50px">BETTER</p>
      <p style="padding-left: 50px; position: relative; z-index: 10;">CHOICE</p>
    </div>    
  </div>
</div>
<%@ include file="/footer.jsp" %>
<script>
  
</script>
</body>
</html>
