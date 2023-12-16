package com.zumba.controller;

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

import com.zumba.bean.Batch;
import com.zumba.service.BatchService;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   BatchService bs = new BatchService();
    public BatchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	List<Object[]> listOfBatchAndStudentInfo = bs.findBatchAndStudentInfo();
	HttpSession hs = request.getSession();
	hs.setAttribute("listBP", listOfBatchAndStudentInfo);
	response.sendRedirect("BatchAndParticipantsInfo.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		int batchid = Integer.parseInt(request.getParameter("batchid"));
		String typeofbatch = request.getParameter("typeofbatch");
		String time = request.getParameter("time");
		
		Batch batch = new Batch(batchid, typeofbatch, time);
		
		String result  = bs.storeBatch(batch);
		
		pw.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("addBatch.jsp");
		rd.include(request, response);
		
		response.setContentType("text/html");
		
	}

}
