package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("*.do")
public class servlet1 extends HttpServlet {
	
	PrintWriter out = null;
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("initiated");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("destroyed");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out = response.getWriter();
		String serverName = request.getServerName();
		int portNum = request.getServerPort();
		String path = request.getServletPath();
		ServletContext pt = request.getServletContext();
		
		out.println("<html><head></head><body>");
		out.println("<h1>in do get method</h1>");
		out.println("serverused : "+serverName);
		out.println("serverPort : "+portNum);
		out.println("servletpath : "+path);
		out.println("sevletInfo :"+pt);
		
		out.println("</body></html>");
		System.out.println("In do get");
		
		switch(path) {
		
		case "/add.do":
			out.println("<html><head></head><body>");
			out.println("<h1>added the values</h1>");
			out.println("</body></html>");
			break;
			
		case "/edit.do":
			out.println("<html><head></head><body>");
			out.println("<h1>edited the values</h1>");
			out.println("</body></html>");
			break;
			
		case "/delete.do":
			out.println("<html><head></head><body>");
			out.println("<h1>deleted the values</h1>");
			out.println("</body></html>");
			break;
			
		case "/update.do":
			out.println("<html><head></head><body>");
			out.println("<h1>updated the values</h1>");
			out.println("</body></html>");
			break;
			
		default:
			break;		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
