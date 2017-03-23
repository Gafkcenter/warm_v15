package cn.itcast.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharactorEncoding implements Filter {

	private String encoding;

	public void init(FilterConfig filterConfig) throws ServletException {

		/*
		 * <init-param> <param-name>encoding</param-name> <param-value>utf-8</param-value>
		 * </init-param>
		 */
		this.encoding = filterConfig.getInitParameter("encoding");

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {

		if(request.getCharacterEncoding()==null){
			if(this.encoding!=null){
				request.setCharacterEncoding(this.encoding);
			}
		}
		arg2.doFilter(request, response);

	}

	public void destroy() {

	}

}
