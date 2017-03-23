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

//////////////////////////////////////////////////////////////////////////////////////////////////
window.onload=function(){
	  //<input type="button" name="checkusername" value="查看用户名" id="checkusername"></td>
	  var userNameElement=document.getElementById("checkusername");
	  userNameElement.onclick=function(){
	  	
		//获取<input type="text" name="username" value="" id="username">
		 var usernameValue=document.getElementById("username").value;
		
		//获取xmphttpRquest对象
		var xmlHttp=ajaxFunction();
		
		//事件处理程序
		xmlHttp.onreadystatechange=function(){
			//alert(xmlHttp.readyState);
			//alert(xmlHttp.status)
			if(xmlHttp.readyState==4){
				if(xmlHttp.status==200||xmlHttp.status==304){
					//真正处理业务
					
					//获取服务器传回的值
					var textValue=xmlHttp.responseText;
					
					//<div id="divcheck"></div>
					var divElement=document.getElementById("divcheck");
					divElement.innerHTML=textValue;

				}
			}
		}
		
		 //打开连接
		 xmlHttp.open("post","../registerServlet?timeStamp="+ new Date().getTime(),true);
		
		 //设置响应头
		 xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		 
		 //发送请求
		 xmlHttp.send("username="+usernameValue);
	  }
	
}
