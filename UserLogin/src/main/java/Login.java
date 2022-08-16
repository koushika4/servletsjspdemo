

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/UserLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("linkk.html").include(request, response);  
          
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin")){  
        out.print("Welcome, "+username);  
        HttpSession session=request.getSession();  
        session.setAttribute("username",username);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }  
        out.close(); 

	}

}
