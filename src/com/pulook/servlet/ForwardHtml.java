/**
 * 
 */
package com.pulook.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 周大帅	
 * @email 463734522@qq.com
 * 2013年10月10日
 */
public class ForwardHtml extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("转发到一个html页面");
		PrintWriter out = resp.getWriter();
		RequestDispatcher requestDispatcher = this.getServletContext().getRequestDispatcher("/index.html");
		requestDispatcher.include(req, resp);
		out.write("success forward  a html page!");
		
	}
}
