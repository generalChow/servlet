package com.pulook.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class FirstServlert extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2240548777631755151L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String myName = request.getParameter("myName");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=gb2312");
		response.setHeader("Pragma", "No-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-cache");
		out.println("<html>");
		out.println("<head><title>this is a simple servlet example</title></head>");
		out.println("<body>");
	    out.println("<h1>here is a simple servlet program</h1>");
	    out.println("<p>"+myName+",welcome!</p>");
	    out.println("</body>");
	    out.println("</html>");
	    out.flush();
	}

}
