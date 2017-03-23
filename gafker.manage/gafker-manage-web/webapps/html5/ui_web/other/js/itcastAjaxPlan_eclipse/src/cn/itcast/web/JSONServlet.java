package cn.itcast.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class JSONServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		/*
		 * json格式
		 */
		//{"firstName":"Tom","lastName":"jack","email":"www@kengni.com"}
		String people="{\"firstName\":\"Tom\",\"lastName\":\"jack\",\"email\":\"www@kengni.com\"}";
		//String people="{\"firstName\":\"Tom\",\"lastName\":\"jack\",\"email\":\"www@kengni.com\"}";
		
		out.println(people);

	}
}
