package cn.itcast.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		System.out.println(request.getMethod());
		System.out.println("request.getRequestURL()  **** "+request.getRequestURL());
		System.out.println("request.getQueryString() ***** "+request.getQueryString());
		System.out.println("username    ***** ="+request.getParameter("username"));
		System.out.println("a =" + request.getParameter("a"));
		System.out.println("b =" + request.getParameter("b"));
		System.out.println("c =" + request.getParameter("c"));

		

		out.println("ajax connecton servle  get");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("执行post方法 **************************************************");
		PrintWriter out = response.getWriter();
		System.out.println(request.getMethod());
		System.out.println("request.getRequestURL() "+request.getRequestURL());
		System.out.println("request.getQueryString() "+request.getQueryString());
		System.out.println("username ="+request.getParameter("username"));
		System.out.println("a =" + request.getParameter("a"));
		System.out.println("b =" + request.getParameter("b"));
		System.out.println("c =" + request.getParameter("c"));

		out.println("ajax connecton servle  post");

	}

}
