/*
 * 1 创建XMLHttpRequest对象
 * 
 * 2 与服务器建立连接
 * 
 * 3 发送请求
 * 
 * 4 如何来处理服务器返回的信息(在执行过程中，服务器返回多次的信息,最后是正确的,判断)
 * 
 */
/**
 * 创建XMLHttpRequest对象
 */
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
	
	  //输出服务器段的值 ajax connecton servle
	  //<input type="button" name="ok" id="ok">
	  document.getElementById("ok").onclick=function(){
	  	     //1 创建XMLHttpRequest对象
               var xmlHttp=ajaxFunction()
 
             //2处理服务器返回的请求(指定时间处理程序)
			 /*
			  * 每次 readyState 值的改变，都会触发 onreadystatechange 事件。
			  * 如果把 onreadystatechange 事件处理函数赋给一个函数，
			  * 那么每次 readyState 值的改变都会引发该函数的执行。
			  * 
			  * 该函数调用多次
			  */
			  xmlHttp.onreadystatechange=function(){
			   	
				//获取ajax当前的请求状态 ==4处理
				if(xmlHttp.readyState==4){
					//服务器返回状态200(成功) 304(没有被修改)
					if(xmlHttp.status==200||xmlHttp.status==304)
					alert(xmlHttp.readyState);
					alert(xmlHttp.status);
					alert(xmlHttp.responseText);	
				}
			  }
			  
              //2 与服务器建立连接
			   /*
			    * 第一个参数:请求方法
			    * 第二个参数:请求的路径
			    * 第三个参数:是否是异步 true 表示异步 false同步
			    */
               xmlHttp.open("get","../testServlet?timeStamp="+new Date().getTime()+"&username=zhang",true);
  
               //3发送请求  使用get请求方法 send方法的参数为null,即使传递参数,服务器也接受不到
		       xmlHttp.send(null);
	  }
	
}
