function ajaxFunction(){
   var xmlHttp;
   try{ // Firefox, Opera 8.0+, Safari
        xmlHttp=new XMLHttpRequest();
    }
    catch (e){
	   try{// Internet Explorer
	         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
	      }
	    catch (e){
	      try{
	         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	      }
	      catch (e){}
	      }
    }
	return xmlHttp;
 }
 
var xmlHttp;

window.onload=function(){
	  document.getElementById("ok").onclick=function(){
               xmlHttp=ajaxFunction();
			   
			   xmlHttp.onreadystatechange=processResponse
               xmlHttp.open("post","../testServlet?timeStamp="+new Date().getTime()+"&username=zhang",true);
			   //符合url编码,该方法要加到open方法的后面
			   xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			   //使用post可以传递参数
		       xmlHttp.send("a=9&b=8");
	  }
}


function processResponse(){	
   alert(xmlHttp.readyState);
   alert(xmlHttp.status);				   	
   //获取ajax当前的请求状态 ==4处理
   if (xmlHttp.readyState == 4) {
   	  if (xmlHttp.status == 200) {
   		  alert(xmlHttp.responseText);
   	   }
   }
}
       

