package EX.login_signup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class login_authenticaition
 */
@WebServlet("/login")
public class login_authenticaition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_authenticaition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pass = request.getParameter("pwd");
		
		String checkId = "dldmstlr20419";
		String checkPass = "fpdhans1";
		String name = "이은식";
		
		//로그인 체크
		if(checkId.equals(id) && checkPass.equals(pass)) {
			//성공시
			HttpSession session = request.getSession();
			//아이디 쳤을때, 데이터를 저장한다.
			System.out.println("오니?");
			session.setAttribute("userId", id);
			session.setAttribute("username", name);
			response.sendRedirect("/example/main.jsp"); //메인페이지로 이동합니다.
		} else {
			//실패시
			response.sendRedirect("/example/login.jsp"); //로그인 페이지로 다시 이동합니다.
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
