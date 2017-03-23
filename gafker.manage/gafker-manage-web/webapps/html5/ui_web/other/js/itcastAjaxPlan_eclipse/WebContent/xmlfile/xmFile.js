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
	//获取xmlHttprequest
	var xmlHttp=ajaxFunction();
	
	//处理程序
	xmlHttp.onreadystatechange = function(){
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200 || xmlHttp.status == 304) {
			    
			  // <select id="province" name="province">
			  var provinceAddElement=document.getElementById("province");
			  
			  
			   //responseXML 表示服务器返回的是xml文件
			   var xmlDoc=xmlHttp.responseXML;
			   //alert(xmlDoc);
			  
			 
			 
			    var provinceElements=xmlDoc.getElementsByTagName("province");
				//alert(provinceElements.length);
			    for(var i=0;i<provinceElements.length;i++){
					 var provinceElement=provinceElements[i];
					 var provinceName=provinceElement.getAttribute("name");
					 
					 var optionElement=document.createElement("option");
					 optionElement.setAttribute("value",provinceName);
					 
					 var provinceTextElement=document.createTextNode(provinceName);
					 optionElement.appendChild(provinceTextElement);
					 
					 
					 //
					 provinceAddElement.appendChild(optionElement);

				}

			}
		}
	  }

	//打开连接
     xmlHttp.open("post","../xmlFileServlet?timeStamp="+new Date().getTime(),true);
     //设置响应头
	 xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	//发送请求
	 xmlHttp.send(null);
}
