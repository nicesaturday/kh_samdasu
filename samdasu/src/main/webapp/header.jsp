<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="header">
  <h1 style=" padding: 20px;">
   <a href="${hpath }">
    <img src="${hpath}/resources/imgs/samlogo.png " alt="samlogo">
    </a>
  </h1>
  <h2 style="padding: 20px;">
    <img src="${hpath}/resources/imgs/sammenu.png " alt="samMenu">
  </h2>
  <div id="modal_menu" style="width: 0%; 
  							  height: 100%; 
  							  background-color: #0066FF;
  							  position: fixed;
  							  overflow: hidden;
  							  right: 0;
  							  ">
    <ul>
     <li></li>
     <li></li>
     <li><a href="${hpath}/qna/list">Qna</a></li>
     <li><a href="${hpath}/board/list">Board</a></li>
     <li><a href="${hpath}/free/list">Free Board</a></li>
     <li><a href="${hpath}/product/list">Product</a></li>
    </ul>
      <p class="modal_menu_close">
        <a href="#" class="active"></a>
      </p>
  </div>
  <script>
    //물결 메뉴
    var sammenu = document.querySelector("#header h2 img");
    sammenu.addEventListener('click', function() {
    var modal_menu = document.querySelector("#modal_menu");
    var samdasoo = document.querySelector("#samdasoo");
    modal_menu.style.display = "block";
    modal_menu.style.width = "100%";
    document.body.style.height = "960px";
    document.body.style.overflow = "hidden";
    samdasoo.style.zIndex = "-1";
    console.log(11);
});

	
	//엑스 메뉴
	//화면 사라지는 거 시간 주기
    var mmc = document.querySelector(".modal_menu_close a");
	
	mmc.addEventListener('click', function() {
	    var modal_menu = document.querySelector("#modal_menu");
	    var samdasoo = document.querySelector("#samdasoo");
	    modal_menu.style.width = "0";
	    document.body.style.height = "auto";
	    document.body.style.overflow = "auto";
	    samdasoo.style.zIndex = "5"; 
	});
	
	
	
	
	
  </script>
</div>
