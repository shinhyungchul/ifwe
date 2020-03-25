<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/views/common/mainInclude.jsp">
	<jsp:param value="멤버쉽 구매" name="pageTitle"/>
</jsp:include>
<script>
$(function(){
	var cnt = 0;
	
    $(".price").on('click',function(e){
	
		$(".price").css("background-color","white")
        .css("color","#2756a6")
	
	
        $(e.target).css("background-color","#2756a6")
                .css("color","white");
        
    });
    
    $(".addbtn").on('click', function(){
    	$(".membership-third").css("display","block");
    	
    	 let checkval = $(".choice input[type=checkbox]:checked").val();
    	console.log(checkval); 
    	
    	let premiumbtncolor = $("#premiumbtn").css("background-color")
	    let goldbtncolor = 	$("#goldbtn").css("background-color");
	    let silverbtncolor = $("#siverbtn").css("background-color");
	    
	    let idx =1;
	    
    	if(goldbtncolor == 'rgb(39, 86, 166)'){
    		
    		
    		let div = $(".payment-lists");
    		
    		div.append('<div class="payment-list font-kor">'+
    	            	'<div class="name-checkbox bold">'+
                   		'<input type="checkbox" name="membership-name"'+(cnt+1)+'" id="membership-name'+(cnt+1)+'"><label for="membership-name'+(cnt+1)+'" >골드 GOLD</label>'+
               			'</div>'+
		               	'<div class="list-club bold"><p >'+checkval+'</p></div>'+
		               	'<div class="list-duration "><p>무제한</p></div>'+
		               	'<div class="list-price bold"><p >5900원</p></div>'+
		         		'</div>');
		    		
    	}
    	
		if(premiumbtncolor == 'rgb(39, 86, 166)'){
		    		
		    		
		    		let div = $(".payment-lists");
		    		
		    		div.append('<div class="payment-list font-kor">'+
		    	            	'<div class="name-checkbox bold">'+
		                   		'<input type="checkbox" name="membership-name'+(cnt+1)+'" id="membership-name'+(cnt+1)+'"><label for="membership-name'+(cnt+1)+'" >프리미엄 PREMIUM</label>'+
		               			'</div>'+
				               	'<div class="list-club bold"><p >'+checkval+'</p></div>'+
				               	'<div class="list-duration "><p>무제한</p></div>'+
				               	'<div class="list-price bold"><p >9900원</p></div>'+
				         		'</div>');
				    		
		    	}
		
		if(silverbtncolor == 'rgb(39, 86, 166)'){
			
			
			let div = $(".payment-lists");
			
			div.append('<div class="payment-list font-kor">'+
		            	'<div class="name-checkbox bold">'+
		           		'<input type="checkbox" name="membership-name3" id="membership-name3"><label for="membership-name3" >실버 SILVER</label>'+
		       			'</div>'+
		               	'<div class="list-club bold"><p >'+checkval+'</p></div>'+
		               	'<div class="list-duration "><p>무제한</p></div>'+
		               	'<div class="list-price bold"><p >3900원</p></div>'+
		               	'</div>');
		    		
		}
    	
    });
    
    $(".choice input[type=checkbox]").click(function(){
    	
    	$(".choice input[type=checkbox]").prop("checked",false);
    	$(this).prop("checked",true);
    	
    });
    
    $(".name-checkbox input[type=checkbox]").click(function(){
    	
    	
    })
    
    $(".paymentbtn").click(function(){
    	
    	
    	var membershipName = $(".name-checkbox input[type=checkbox] + label").text()=="프리미엄 PREMIUM"?"premium":$(".name-checkbox input[type=checkbox] + label").text()=="골드 GOLD"?"gold":"silver";
    	var clubCode = $(".list-club").text()=="윙스터디 모임"?"1":"";
    	var price = $(".list-price").text()=="9900원"?9000:$(".list-price").text()=="5900원"?5900:3900;
    	var memberCode= ${memberLoggedIn.memberCode};
    	
    	$.ajax({
    		url: "${pageContext.request.contextPath}/member/membershipPay.do",
    		data: {
    			membershipName : membershipName,
    			clubCode : clubCode,
    			price : price,
    			memberCode : memberCode
    		},
    		type: "POST",
    		success: function(data){
    			console.log(data);
    		},
    		error: function(x,s,e){
    			
    		}
    		
    		})
    	});
    	
    })
    
    
</script>
 <section>
   <article class="membership-first">
       <div class="title-container font-kor">
           <p class="p-title bold">멤버십 구매</p>
           <p class="membership-p-content" style="color:#606060;">멤버십 구매해서 ifwe를 더욱 풍부하게 즐겨보세요!</p>
           <input type="hidden" name="" />${memberLoggedIn.memberCode}; 
       </div>
   </article>
   <article class="membership-second">
       <div class="grade" id="premium">
           <div class="grade-icon"><i class="fas fa-crown" style="color:#c332f1;"></i></div>
           <div class="grade-content">
               <p class="p-grade-ko font-kor">프리미엄</p>
               <p class="p-grade-en bold">PREMIUM</p>
               <ul>
                       <p> <li class="font-kor" ><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>소모임 인원 추가</li></p>
                       <p> <li class="font-kor"><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>게시판 개수 추가</li></p>
               </ul>
           </div>
           <div class="grade-price"  >
				<button class="price font-kor" id="premiumbtn" >
                     9,900원 / 무제한
                </button>

           </div>
       </div>
       <div class="choice-container">
               <div class="choice">
                   <div class="choice-title bold" >적용할 소모임 선택</div>
                   <div class="choice-checkbox font-kor">
                       <input type="checkbox" name="membership-club"+${ vs}+" id="membership-club1" value="윙스터디 모임"><label for="membership-club1" >윙스터디 모임</label>
                   </div>
                   <!-- <div class="choice-checkbox font-kor">
                   		<input type="checkbox" name="membership-club2" id="membership-club2" value="댄스 모임" ><label for="membership-club2" >댄스 모임</label>
                   </div> -->
                  
               </div>
               <div class="add">
                   <button class="addbtn font-kor">담기</button>
               </div>
           </div>
       <div class="grade" id="gold">
           <div class="grade-icon"><i class="fas fa-crown" style="color:#ffc863;" ></i></div>
           <div class="grade-content" >
               <p class="p-grade-ko font-kor">골드</p>
               <p class="p-grade-en bold">GOLD</p>
               <ul >
                       <p><li class="font-kor" ><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>소모임 인원 추가</li></p>
                       <p> <li class="font-kor"><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>게시판 개수 추가</li></p>
               </ul>
           </div>
           <div class="grade-price font-kor">
               <button class="price font-kor" id="goldbtn" >
                    5,900원 / 무제한
               </button>
           </div>
       </div>
       <div class="grade" id="silver">
           <div class="grade-icon"><i class="fas fa-crown" style="color:#c7c7c7;"></i></div>
           <div class="grade-content" >
               <p class="p-grade-ko font-kor">실버</p>
               <p class="p-grade-en bold">SILVER</p>
               <ul>
                   <p><li class="font-kor" ><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>소모임 인원 추가</li></p>
                   <p> <li class="font-kor"><i class="fas fa-circle" style="color:#2756a6;font-size:0.5em; margin-right:10px;"></i>게시판 개수 추가</li></p>
                </ul>
            </div>
            <div class="grade-price font-kor">
                <button class="price font-kor" id="siverbtn" >
                     3,900원 / 무제한
                </button>
            </div>
        </div>
      
    </article>
    <article class="membership-third" style="display:none;">
        <div class="payment-container" >
            <div class="list-container">
                <div class="payment-title font-kor">
                    <div class="membership-name"><p>멤버십 명</p></div>
                    <div class="club-name "><p>소모임 명</p></div>
                    <div class="duration "><p>기간</p></div>
                    <div class="payment-price"><p>가격</p></div>
                </div>
              	<div class="payment-lists">
               
                   
                </div>
                <div class="result-container">
                    <div class="payment-border"><hr></div>
                        <div class="payment-result">
                            <p class="result-name font-kor"  >프리미엄 PREMIUM/ <span id="countMembership"></span></p><p class="result-price bold" id="totalprice" >9900</p>
                        </div>
                </div>
        
         	</div>  
        </div>
         		<div class="payment">
            <button class="paymentbtn font-kor">결제하기</button>
        		</div>
    </article>
</section>






</body>
</html>