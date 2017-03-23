package cn.itcast.web;

import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONObject;
import cn.itcast.bean.Province;

public class TestJSON {
	
	public static void main(String[] args) {
		method1();
	}
	
	public static void  method1(){
		Province  p1=new Province(1,"吉林省");
		Province  p2=new Province(2,"辽宁省");
		Province  p3=new Province(3,"山东省");
		Province  p4=new Province(4,"海南省");
		
		List list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//转化list结合中javaBean--->json格式
//		JsonConfig jsonConfig=new JsonConfig();
////		//设置不生成json的格式的属性
//		jsonConfig.setExcludes(new  String[]{"pname"});
////		
//		JSONArray jsonArray=JSONArray.fromObject(list,jsonConfig);
//		System.out.println("list --json "+jsonArray.toString());
//		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//转换javaBean到json格式:
		JSONObject jsonObject=JSONObject.fromObject(p1);
		System.out.println(jsonObject.toString());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//转化json到javaBean
//		String jsonStr="{\"id\":1,\"pname\":\"吉林省\"}";
//		JSONObject jsonObject2=JSONObject.fromObject(jsonStr);
//		
//		Province p=(Province) JSONObject.toBean(jsonObject2, Province.class);
//		System.out.println( p.getId()+  "    " +p.getPname());		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		//转化一个数组到一个包含javaBean的集合中
//		String input="[{\"id\":1,\"pname\":\"吉林省\"},{\"id\":2,\"pname\":\"辽宁省\"},{\"id\":3,\"pname\":\"山东省\"}]";
//		
//		JSONArray jsonArray1 = (JSONArray) JSONSerializer.toJSON( input );   
//		System.out.println("output.size() "+jsonArray1.size());
//		List newList=new ArrayList();
//		
//		for(int i=0;i<jsonArray1.size();i++){
//			String str=jsonArray1.getString(i);
//			JSONObject jsonObj=JSONObject.fromObject(str);
//			Province pp=(Province) JSONObject.toBean(jsonObj,Province.class);
//			System.out.println( pp.getId()+  "    " +pp.getPname());
//			list.add(pp);
//		}	
	}
}
