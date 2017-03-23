--创建AJAX程序的步骤:
1 创建或获取XMLHttpRequest对象
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
2 指定事件处理函数

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

3 打开连接
		   /*
		    * 第一个参数:请求方法
		    * 第二个参数:请求的路径
		    * 第三个参数:是否是异步 true 表示异步 false同步
		    */
           xmlHttp.open("get","./testServlet",true);

4 发送请求
		       xmlHttp.send(null);
		 
