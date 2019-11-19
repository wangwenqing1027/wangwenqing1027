package com.datou.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Headers","User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken,username,offlineticket,Authorization");
		httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}