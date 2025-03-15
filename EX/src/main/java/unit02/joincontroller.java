package unit02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joincontroller
 */
@WebServlet("/joincontroller")
public class joincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public joincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId  = request.getParameter("userId");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		Map userMap = new HashMap();
		userMap.put("userId", userId);
		userMap.put("username", username);
		userMap.put("password", password);
		userMap.put("email",  email);
		
		//ServletContext 객체 열기
		ServletContext context = getServletContext();
		//애플리케이션 스코프에 값 저장
		context.setAttribute("userInfo_"+userId,  userMap);
		
		JSONObject jsonResponse = new JSONObject(); //JSON 응답 객체 생성
		jsonResponse.put("success", true); //성공 여부
		
		PrintWriter out = response.getWriter();
		out.print(jsonResponse.toString());
		out.flush();
	}

}
