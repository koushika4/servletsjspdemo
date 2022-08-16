
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
import com.bean.Classes;
import com.bean.Trainer;
import com.service.ClassService;
import com.service.TrainerService;
/**
 * Servlet implementation class ClassController
 */
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassService cs = new ClassService();
		List<Classes> listOfClasses= cs.getAllClasses();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfClasses", listOfClasses);
		response.setContentType("text/html");
		response.sendRedirect("viewClasses.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int cid=Integer.parseInt(request.getParameter("cid"));
		String cname=request.getParameter("cname");
		Classes c=new Classes();
		c.setCid(cid);
		c.setCname(cname);
	    ClassService cs=new ClassService();
		String result=cs.storeClass(c);
		out.println(result);
		RequestDispatcher rd=request.getRequestDispatcher("storeClass.jsp");
		rd.include(request, response);
	}
}
