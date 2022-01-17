package com.org.cokkies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletCook
 */
@WebServlet("/MyServletCook")
public class MyServletCook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    String name=request.getParameter("val1");
	    String pass=request.getParameter("val2");
	    if(pass.equals("1234"));
	    {
	    	Cookie cok=new Cookie("name",name);
	    	response.addCookie(cok);
	    	response.sendRedirect("First");
	    }
	    
	}

}
