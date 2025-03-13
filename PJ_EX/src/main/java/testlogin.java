

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.json.JSONObject;

/**
 * Servlet implementation class testlogin
 */
@WebServlet("/10_loginForm")
public class testlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String checkId = "dldmstlr20419";
		String checkPass = "1234";
		String name = "이은식";
		JSONObject jsonResponse = new JSONObject();
		//로그인 체크
		if(checkId.equals(id) && checkPass.equals(pwd)) {
			//성공시
			HttpSession session = request.getSession();
			request.getSession().setAttribute("userId", id);
			request.getSession().setAttribute("userName", name);
			jsonResponse.put("success", true); //성공시
		} else {
			//실패시
			jsonResponse.put("success", false); //실패시
		}
		PrintWriter out = response.getWriter();	
		out.print(jsonResponse.toString());
		out.flush();
	}

}
