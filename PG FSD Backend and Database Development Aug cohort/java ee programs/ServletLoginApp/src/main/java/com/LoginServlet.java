package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest a, HttpServletResponse b) throws ServletException, IOException {
		// TODO Auto-generated method stub
		b.getWriter().append("Served at: ").append(a.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("login.html");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ my_db_info", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password =?");
	pstmt.setString(1, emailid);
	pstmt.setString(2, password);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		pw.print("Successfully login");
	}else {
		pw.println("Invalid emailid or password");
		rd1.include(request, response);
	}
		} catch (Exception e) {
		pw.println("login exception "+e.getMessage());
		rd1.include(request, response);
		}
		response.setContentType("text/html");
	}

}
