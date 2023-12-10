package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ems.bean.Employee;
import com.ems.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter pw = response.getWriter();
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.findAllEmployee();
//		pw.println("<table>");
//		
//		pw.println("</table>");
		HttpSession hs = request.getSession();
		hs.setAttribute("obj", listOfEmp);
		response.sendRedirect("displayEmployee.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		// receive the value from form and convert to respective data type. 
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));
		
		// convert those value to java bean class 
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		
		
		// Then we can pass those value to service layer and base upon service layer result we can move to next view page. 
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployee(emp);
		pw.println(result);
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("addEmployee.jsp");
		rd.include(request, response);
		
		
	}

}


