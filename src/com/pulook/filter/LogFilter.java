/**
 * 
 */
package com.pulook.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 周大帅
 * @email 463734522@qq.com 2013年9月29日
 */
public class LogFilter implements Filter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */

	private FilterConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		ServletContext context = this.config.getServletContext();
		long before = System.currentTimeMillis();
		System.out.println("开始过滤。。。。。。");
		//设置request字符编码
        request.setCharacterEncoding("utf-8");
     //设置response字符编码
        response.setContentType("text/html;charset=utf-8");
		// 将请求转换成HttpServletRequest 请求
		HttpServletRequest hrequest = (HttpServletRequest) request;
		// 记录日志
		System.out.println(("Filter已经截获到用户的请求的地址: " + hrequest.getServletPath()));

		chain.doFilter(request, response);
        
		long after = System.currentTimeMillis();

		System.out.println(("过滤结束"));

		// 再次记录日志

		System.out.println((" 请求被定位到" + ((HttpServletRequest) request).getRequestURI()
				+ "所花的时间为: " + (after - before)));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

}
