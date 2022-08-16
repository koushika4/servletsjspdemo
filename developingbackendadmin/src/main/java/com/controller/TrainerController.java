package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.Trainer;
import com.service.TrainerService;
/**
 * Servlet implementation class TrainerController
 */
public class TrainerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
     * @see HttpServlet#HttpServlet()
     */
    public TrainerController() {
        super();
        }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    TrainerService ts = new TrainerService();
		List<Trainer> listOfTrainer = ts.getAllTrainer();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfTrainer", listOfTrainer);
		response.setContentType("text/html");
		response.sendRedirect("ViewTrainer.jsp");
	}
     /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int tid=Integer.parseInt(request.getParameter("tid"));
		String tname=request.getParameter("tname");
		String tech=request.getParameter("tech");
		Trainer t=new Trainer();
		t.setTid(tid);
		t.setTname(tname);
		t.setTech(tech);
		TrainerService ts=new TrainerService();
		String result=ts.storeTrainer(t);
		out.println(result);
		RequestDispatcher rd=request.getRequestDispatcher("StoreTrainer.jsp");
		rd.include(request, response);
		}
	}

