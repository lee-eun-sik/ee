package unit02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ExController
 */
@WebServlet("/loginCheck.do")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 4143507114085561790L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONObject jsonResponse = new JSONObject();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		//ServletContext 객체 열기
		ServletContext context = getServletContext();
		//애플리케이션 스코프에 값 꺼내오기
		Map userMap = (Map) context.getAttribute("userInfo_"+id);
		//애플리케이션 정보가 있는지
		if(userMap == null) {
			jsonResponse.put("success", false); //성공 여부
		} else {
			String checkId = (String) userMap.get("userId");
			String checkPass = (String) userMap.get("password");
			String name = (String) userMap.get("username");
			
			
			//로그인 체크
			if(checkId.equals(id) && checkPass.equals(pass)){
				//성공시
				HttpSession session = request.getSession();
				session.setAttribute("userId", id);
				session.setAttribute("userName", name); 
				
				jsonResponse.put("success", true); // 성공 여부
			} else {
				//실패시
				jsonResponse.put("success", false); // 성공 여부
			}
			}	
			PrintWriter out = response.getWriter();
			out.print(jsonResponse.toString());
	        out.flush();
		}

}