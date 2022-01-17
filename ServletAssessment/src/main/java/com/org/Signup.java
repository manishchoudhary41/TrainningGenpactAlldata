package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String city =  request.getParameter("city");
		String country = request.getParameter("country");
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		System.out.println("Username : "+ username);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("connection ready");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			System.out.println(con);
			
			PreparedStatement ps = con.prepareStatement("insert into register(name,city,country,username,password) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, country);
			ps.setString(4, username);
			ps.setString(5, password);
			int row = ps.executeUpdate();
			if(row>=1) {
			out.print("Successfullly registered");
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			rd.include(request, response);
			System.out.println("Registered");
			}
			else {
				System.out.println("Not registered");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		out.close();
		
	}

}
