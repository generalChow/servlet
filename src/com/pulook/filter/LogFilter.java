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
 * @author �ܴ�˧
 * @email 463734522@qq.com 2013��9��29��
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
		System.out.println("��ʼ���ˡ�����������");
		//����request�ַ�����
        request.setCharacterEncoding("utf-8");
     //����response�ַ�����
        response.setContentType("text/html;charset=utf-8");
		// ������ת����HttpServletRequest ����
		HttpServletRequest hrequest = (HttpServletRequest) request;
		// ��¼��־
		System.out.println(("Filter�Ѿ��ػ��û�������ĵ�ַ: " + hrequest.getServletPath()));

		chain.doFilter(request, response);
        
		long after = System.currentTimeMillis();

		System.out.println(("���˽���"));

		// �ٴμ�¼��־

		System.out.println((" ���󱻶�λ��" + ((HttpServletRequest) request).getRequestURI()
				+ "������ʱ��Ϊ: " + (after - before)));
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
