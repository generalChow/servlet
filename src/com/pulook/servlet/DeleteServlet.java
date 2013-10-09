/**
 * 
 */
package com.pulook.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pulook.jdbc.Jdbc;

/**
 * @author 周大帅	
 * @email 463734522@qq.com
 * 2013年10月9日
 */
public class DeleteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		System.out.println("id:"+id);
		PrintWriter out = response.getWriter();
		try {
			Jdbc jdbc = new Jdbc();
			jdbc.deleteTest(id);;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=gb2312");
		response.setHeader("Pragma", "No-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-cache");
		out.println("<html>");
		out.println("<head><title>this is a simple servlet example</title></head>");
		out.println("<body>");
	    out.println("<h1>here is a simple servlet program</h1>");
	    out.println("<p>"+"some was deleted"+",welcome!</p>");
	    out.println("</body>");
	    out.println("</html>");
	    out.flush();
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		this.doGet(request, response);
	}

}
