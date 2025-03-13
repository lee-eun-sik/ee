package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Enumeration;

/**
 * Servlet implementation class ExController1
 */
@WebServlet("/radio")
public class ExController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		Enumeration<String> e = request.getParameterNames();
//		while (e.hasMoreElements()) {
//			String string = (String) e.nextElement();
//			System.out.println("key:"+ string);
//		}
//		RequestDispatcher dispatcher = request.getRequestDispatcher("radiojsp.jsp");//파일 줏소 찾음 
//		dispatcher.forward(request, response); //다른걸로 넘어감.
		//쿠키 생성
		Cookie userCookie = new Cookie("username", "user123");
		
		//쿠키의 유효기간을 설정(초 단위)
		userCookie.setMaxAge(60 * 60 * 24); //1일 동안 유효
		
		//응답 객체에 쿠키 추가
		response.addCookie(userCookie);
		
		//요청 객체에서 쿠키 배열 가져오기
		Cookie[] cookies = request.getCookies();
		
		//쿠키가 있을 경우
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("username")) {
					String username = cookie.getValue();// "user123"
					System.out.println("Username: " + username);
				}
			}
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
