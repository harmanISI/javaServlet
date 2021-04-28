package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	private String FNAME = "Roneet";
	private String LNAME = "Kumar";
	private String unmae = "student";
	private String PASS = "isi";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
HttpSession session = request.getSession();
		
		String tempEmail = request.getParameter("email");
		String tempPass = request.getParameter("pass");
		
		
		if(tempEmail.equalsIgnoreCase(unmae) && tempPass.equalsIgnoreCase(PASS)) {
			User user = new User(FNAME,LNAME,unmae,PASS);
			session.setAttribute("user", user);
			response.sendRedirect("profile1.jsp");
		}else {
			
			response.sendRedirect("Eror.jsp");
			
			//response.sendError(401, "incorrect email or password");
			
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
