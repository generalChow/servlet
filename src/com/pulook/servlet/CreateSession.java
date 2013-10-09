/**
 * 
 */
package com.pulook.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pulook.model.OnlineUser;

/**
 * @author 周大帅	
 * @email 463734522@qq.com
 * 2013年10月9日
 */
public class CreateSession extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		session.setAttribute("test", "yes");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=gb2312");
		resp.setHeader("Pragma", "No-cache");
		resp.setDateHeader("Expires", 0);
		resp.setHeader("Cache-Control", "no-cache");
		out.write("您好，您是第"+OnlineUser.getCount()+"访客");
		out.flush();
		out.close();
		super.doGet(req, resp);
		
	}

}
