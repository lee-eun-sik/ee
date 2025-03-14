package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Servlet implementation class Ex2Controller
 */
@WebServlet("/Ex2Controller")
public class Ex2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex2Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map map1 = new HashMap();
		map1.put("name1", "이은식");
		map1.put("name2", "김명리");
		map1.put("name3", "최재길"); // 자바 클래스 대체 끊임없이 씀, 단점: 메모리 배열보다 많이 찬다.
		map1.put("name4", "유지호");
		map1.put("name5", "김나연");
		
		List list2 = new ArrayList();
		Map map2 = null;
		for (int i = 0; i < 10; i++) {
			map2 = new HashMap();
			map2.put("sex1", "남성");
			map2.put("sex2", "여성");
			map2.put("sex3", "남성");
			map2.put("sex4", "남성");
			map2.put("sex5", "여성");
		}
		request.setAttribute("map2", map2);
		request.getRequestDispatcher("/jstl/ex1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
