package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ExController
 */
@WebServlet("/logout.do")
public class LogoutController extends HttpServlet {
	
	private static final long serialVersionUID = 4143507114085561790L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutController() {
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
		
		String id = request.getParameter("id");
		String checkId = "dldmstlr20419";
		System.out.println("check : "+(checkId.equals(id)));
		
		//로그아웃 체크
		if(checkId.equals(id)){
			//성공시 
			HttpSession session = request.getSession();
			//세션 삭제
			session.invalidate();
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("main.jsp");
		}
		
	}

}
