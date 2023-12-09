package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")		// replacement of servlet tags.
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count =0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		
		// 1st request 
//		Cookie cc  = new Cookie("name", "This my custom message");
//		response.addCookie(cc);			// in created file we added our custom information 
//		pw.print("Welcome");
		
		// 2rd request 
		//Cookie cc[] = request.getCookies();
		HttpSession hs = request.getSession();
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		}else {
			pw.println("<br/> Old Client");
		}
		pw.println("<br/> Session Id "+hs.getId());
		pw.println("<br/> Session Creation time "+hs.getCreationTime());  // milli second format 
		pw.println("<br/> Session creation time in date format "+new Date(hs.getCreationTime()));
		pw.println("<br/> Last Access time in date format "+new Date(hs.getLastAccessedTime()));  // 18000
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> AFter set Last Access time in date format "+new Date(hs.getLastAccessedTime()));  // 600 
		pw.println("<br/> Count value is "+count);
		count++;
		if(count%5==0) {
			hs.invalidate();				// destroy the session. 
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
