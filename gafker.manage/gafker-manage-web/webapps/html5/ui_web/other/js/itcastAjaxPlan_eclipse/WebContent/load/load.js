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

window.onload=function(){
	  var divcheckElement=document.getElementById("divcheck");
	  
	  document.getElementById("ok").onclick=function(){
               
			   var xmlHttp=ajaxFunction();
			   xmlHttp.onreadystatechange=function(){
			   	if(xmlHttp.readyState==1){
					divcheckElement.innerHTML="<img src='loading33.gif' width=100  height=100></img>...正在加载";
					alert("xxxx");
				}else if(xmlHttp.readyState==2){
					divcheckElement.innerHTML="<img src='loading33.gif' width=100  height=100></img>...正在提交数据";
					alert("xxxx");
				}else if(xmlHttp.readyState==3){
					divcheckElement.innerHTML="<img src='loading33.gif' width=100  height=100></img>...数据传送中";
					alert("xxxx");
				}else if(xmlHttp.readyState == 4) {
					  divcheckElement.innerHTML="";  //取消加载图表
				   	  if (xmlHttp.status == 200) {
				   		  alert(xmlHttp.responseText);  //接收数据
				   	   }
				}else{
					divcheckElement.innerHTML="查询错误请检查输入是否正确";
				}
			   }
               xmlHttp.open("post","../loadServlet?timeStamp="+new Date().getTime()+"&username=zhang",true);
			   //符合url编码,该方法要加到open方法的后面
			   xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			   //使用post可以传递参数
		       xmlHttp.send("a=9&b=8");
	  }
}
      

