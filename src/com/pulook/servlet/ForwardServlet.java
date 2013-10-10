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
public class ForwardServlet extends HttpServlet{
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html,charset=utf-8");
		System.out.println("来到了forwardServlet");
		PrintWriter out =  resp.getWriter();
		out.write("before forward");
		RequestDispatcher requestDispatcher = this.getServletContext().getRequestDispatcher("/add?myName=leslie");
	    requestDispatcher.include(req, resp);
	    out.write("after forward");
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
