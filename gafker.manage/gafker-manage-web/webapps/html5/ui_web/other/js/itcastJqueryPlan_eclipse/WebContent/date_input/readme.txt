使用JQuery事件控件
  * 引入jQuery的js库
     //JQuery的基本类库
     <script type="text/javascript" src="../js/jquery-1.3.1.js"></script>
     //时间空间自带的
     <link rel="stylesheet" href="./jquery.datepick.css" type="text/css">
     <script type="text/javascript" src="./jquery.datepick.js"></script>
      <script type="text/javascript" src="./jquery.datepick-zh-CN.js"></script>//汉化
  
  * 页面使用
        <input type="text" name="time" value="2009-2-9"  class="biuuu" />
		<input type="text" name="time" value="2009-2-9"  class="biuuu" />
		<input type="text" name="time" value="2009-2-9"  class="biuuu" />
		
		<script type="text/javascript">
			$(document).ready(function(){
				//使用class属性处理  'yy-mm-dd' 设置格式"yyyy/mm/dd"
				$('.biuuu').datepick({dateFormat: 'yy-mm-dd'}); 
			});
		</script>
   