package com.org.reqdisp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("val1");
		String userid=request.getParameter("val2");
		String passw=request.getParameter("val3");
		
		if(passw.equals("abc"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Display1");
			rd.forward(request, response);
		}
		else
		{
			pw.println("incorect userid or password");
			RequestDispatcher rd=request.getRequestDispatcher("/forward.html");
			rd.include(request,response);
			
		}	
		
	}

}
