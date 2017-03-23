使用json类库:
   * 引入json的使用的jar包  具体参看文档\
   * 在servlet使用的使用方法如下
        Province  p1=new Province(1,"吉林省");
		Province  p2=new Province(2,"辽宁省");
		Province  p3=new Province(3,"山东省");
		Province  p4=new Province(4,"海南省");
		
		List list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		//[{"id":1,"pname":"吉林省"},{"id":2,"pname":"辽宁省"},{"id":3,"pname":"山东省"},{"id":4,"pname":"海南省"}]
		//String str="[{'id':'1','pname':'吉林省'},{'id':'2','pname':'辽宁省'},{'id':'3','pname':'山东省'}]";
		
		
		//关键性代码
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON( list );
		System.out.println(jsonArray.toString());
		
		//发送的客户端
		out.println(jsonArray.toString());