package cn.itcast.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
        System.out.println(request.getRequestURI());
		String username=request.getParameter("username");
		System.out.println("username "+username);
		
		System.out.println(this.getServletContext().getRealPath("/json"));
		
		if("sa".equals(username.trim())){
			out.println("用户名已存在!");
		}else{
			out.println("可以使用这个用户名!");
		}
	}
}
