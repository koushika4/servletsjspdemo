package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Subject;
/**
 * Servlet implementation class AssignTrainerToSubject
 */
public class AssignTrainerToSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTrainerToSubjectController() {
        super();
        }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.getTransaction();
        int subid=Integer.parseInt(request.getParameter("subid"));
        int tid=Integer.parseInt(request.getParameter("tid"));
        Subject sb=session.get(Subject.class, subid);
        if(sb==null) {
        	out.println("subject not present");
        }
        else {
        	tran.begin();
        	sb.setTsubid(tid);;
        	session.update(sb);
        	tran.commit();
        	out.println("assign trainer to subject successfully");
        }
        RequestDispatcher rd=request.getRequestDispatcher("AssignTrainertoSubject.jsp");
        rd.include(request, response);
	}
}
