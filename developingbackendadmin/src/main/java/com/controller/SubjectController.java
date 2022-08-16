
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
import com.bean.Subject;
import com.service.ClassService;
import com.service.SubjectService;
/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
      }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SubjectService sbs = new SubjectService();
		List<Subject> listOfSubject= sbs.getAllSubjects();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfSubject", listOfSubject);
		response.setContentType("text/html");
		response.sendRedirect("ViewSubject.jsp");
	}
/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int subid=Integer.parseInt(request.getParameter("subid"));
		String subname=request.getParameter("subname");
		Subject sb=new Subject();
		sb.setSubid(subid);
		sb.setSubname(subname);
		SubjectService sbs=new SubjectService();
		String result=sbs.storeSubject(sb);
		out.println(result);
		RequestDispatcher rd=request.getRequestDispatcher("StoreSubjcet.jsp");
		rd.include(request, response);
	}
}
