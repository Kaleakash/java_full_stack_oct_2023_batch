package com;

import java.io.IOException;
import java.io.PrintWriter;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("HomeServlet");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		if(emailid.equals("akash@gmail.com") && password.equals("1234")) {
			pw.println("successfully login using get");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again using get");
			rd2.include(request, response);
		}
		response.setContentType("text/html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("HomeServlet");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		if(emailid.equals("akash@gmail.com") && password.equals("1234")) {
			pw.println("successfully login using post");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again using post");
			rd2.include(request, response);
		}
		response.setContentType("text/html");
	}

}
