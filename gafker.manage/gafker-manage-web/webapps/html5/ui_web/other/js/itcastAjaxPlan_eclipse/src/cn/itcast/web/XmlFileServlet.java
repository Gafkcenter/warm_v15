package cn.itcast.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 产生一个xml文件
 * @author Administrator
 */
@SuppressWarnings("serial")
public class XmlFileServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<china>");
		out.println("<province name='吉林省'>");
		out.println("<city>长春</city>");
		out.println("<city>吉林市</city>");
		out.println("<city>四平</city>");
		out.println("<city>松原</city>");
		out.println("<city>通化</city>");
		out.println("</province>");
		
		out.println("<province name='辽宁省'>");
		out.println("<city>沈阳</city>");
		out.println("<city>大连</city>");
		out.println("<city>鞍山</city>");
		out.println("<city>抚顺</city>");
		out.println("<city>铁岭</city>");
		out.println("</province>");
		
		out.println("<province name='山东省'>");
		out.println("<city>济南</city>");
		out.println("<city>青岛</city>");
		out.println("<city>威海</city>");
		out.println("<city>烟台</city>");
		out.println("<city>潍坊</city>");
		out.println("</province>");
		out.println("</china>");
	}

}
