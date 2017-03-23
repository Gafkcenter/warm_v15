package cn.itcast.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import cn.itcast.bean.Province;

@SuppressWarnings("serial")
public class JSONServlet02 extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
/**********************************************************************************************************/
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
		JSONArray jsonArray=JSONArray.fromObject(list);
		System.out.println("******** "+jsonArray.toString());
/**********************************************************************************************************/		
		out.println(jsonArray.toString());
		

	}
}
