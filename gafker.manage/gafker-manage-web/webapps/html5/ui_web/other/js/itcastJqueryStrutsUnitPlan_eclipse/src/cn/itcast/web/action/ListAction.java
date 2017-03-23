package cn.itcast.web.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cn.itcast.bean.City;
import cn.itcast.bean.County;
import cn.itcast.bean.Province;
import cn.itcast.dao.impl.DaoCityImpl;
import cn.itcast.dao.impl.DaoCountyImpl;
import cn.itcast.dao.impl.DaoProvinceImpl;

public class ListAction extends DispatchAction {
	
	public ActionForward listProvince(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		  response.setContentType("text/html;charset=utf-8");
          PrintWriter out=response.getWriter();
		  
		  DaoProvinceImpl daoProvince=new DaoProvinceImpl();
	 	  
		  //获取省的信息 放置到list
		  List<Province> list=daoProvince.findALLProvince();
		
          //将list转化为json格式
		  JSONArray jsonArray=JSONArray.fromObject(list);
		  System.out.println(jsonArray.toString());
		
		  //输出:out.println(json);
		  out.println(jsonArray.toString());
	
		return null;
	}
	public ActionForward listCity(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		  response.setContentType("text/html;charset=utf-8");
          PrintWriter out=response.getWriter();
		  
          String spid=request.getParameter("pid");
          System.out.println("spid  "+spid);
          Integer pid=Integer.parseInt(spid);
          
		  DaoCityImpl daoCity=new DaoCityImpl();
	 	  
//		  //获取某个省下city的信息 放置到list 
		  List<City> list=daoCity.findALLCity(pid);
//		
//          //将list转化为json格式
		  JSONArray jsonArray=JSONArray.fromObject(list);
		  System.out.println(jsonArray.toString());
//		
//		  //输出:out.println(json);
		  out.println(jsonArray.toString());
	
		return null;
	}
	
	public ActionForward listCounty(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		  response.setContentType("text/html;charset=utf-8");
          PrintWriter out=response.getWriter();
		  
          String scid=request.getParameter("cid");
          System.out.println("scid  "+scid);
          Integer cid=Integer.parseInt(scid);
          
          DaoCountyImpl daoCounty=new DaoCountyImpl();
	 	  
		  //获取某个省下city的信息 放置到list 
		  List<County> list=daoCounty.findALLCounty(cid);
		
          //将list转化为json格式
		  JSONArray jsonArray=JSONArray.fromObject(list);
		  System.out.println(jsonArray.toString());
		
		  //输出:out.println(json);
		  out.println(jsonArray.toString());
	
		return null;
	}
	
	
}
