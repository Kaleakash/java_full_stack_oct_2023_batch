package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zumba.bean.Batch;
import com.zumba.service.BatchService;
import com.zumba.service.ParticipantsService;

/**
 * Servlet implementation class ParticipantsController
 */
@WebServlet("/ParticipantsController")
public class ParticipantsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   ParticipantsService ps = new ParticipantsService();
   BatchService bs = new BatchService();
    public ParticipantsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Batch> listOfBatc = bs.findAllBatch();
		HttpSession hs = request.getSession();
			hs.setAttribute("listOfBatch", listOfBatc);
		response.sendRedirect("addParticipants.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
