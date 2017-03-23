<!--
   总结:
      1 基本选择器(通过id,class,标签名<div> <input> ) 
	     * id 返回的是单个元素的集合
		 * 其他的是集合
      2 层次选择器(查找父元素下的子元素或子子元素)   $("div div")
	      * 父    子子      ancestor descendant    
		  * 父  >   子      parent > child
		  * 老大 + 老二     prev + next
		  * 老大 ~ 老二  老三 ...   prev ~ siblings

      3 过滤选择器 前面加:
	      *  基础过滤选择器
		     * :first    $("div:first")
			 * ::last
			 * :not(selector)
			 * :even
			 * :odd
			 * :eq(index)
			 * :gt(index)
             * :lt(index)
         * 内容过滤选择器(体现在它所包含的子元素和文本内容上)
		     * :contains(text)   $("div:contains(’test’)”)
			 * :empty
			 * :has(selector)
             * :parent
			 
		 * 	可见度过滤选择器
		     * :hidden
			 * :visible
			 
       4 属性过滤选择器[]
	       * [attribute]     $("div[class]")
		   * [attribute=value]  $("div[class=one]")
	   	 
	   5 子元素过滤选择器(具体精确到每一个具体的子元素)
	       * :nth-child(index/even/odd/equation)   $("table:nth-child(1)")
		   * :first-child
		   * :last-child
		   * :only-child  
		   
	   6 表单对象属性过滤选择器(Form中的组建)	   
          * :enabled
		  * :disabled
		  * :checked
		  * :selected
	   7 表单选择器(Form中的组建) 单独使用
	      * :text
		  * :password 			 
			 
--> 