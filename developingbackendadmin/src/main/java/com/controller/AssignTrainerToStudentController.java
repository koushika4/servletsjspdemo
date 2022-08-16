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
import com.bean.Student;
/**
 * Servlet implementation class AssignTrainerToStudentController
 */
public class AssignTrainerToStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTrainerToStudentController() {
        super();
     }/**
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
        int sid=Integer.parseInt(request.getParameter("sid"));
        int tid=Integer.parseInt(request.getParameter("tid"));
        Student s=session.get(Student.class, sid);
        if(s==null) {
        	out.println("student not present");
        }
        else {
        	tran.begin();
        	s.setTsid(tid);
        	session.update(s);
        	tran.commit();
        	out.println("assign trainer to student successfully");
        }
        RequestDispatcher rd=request.getRequestDispatcher("AssignTrainertoStudent.jsp");
        rd.include(request, response);
	}
}
