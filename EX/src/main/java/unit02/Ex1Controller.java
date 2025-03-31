package unit02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1Controller
 */
@WebServlet("/Ex1Controller")
public class Ex1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = "문자";
		//리스트 데이타 순차형 데이터
		List list1 = new ArrayList(); //부모형태로 받아서씀. ArrayList는 자식
		for(int i = 0; i<10; i++) {
			list1.add(i+1);		
		}
		//맵 데이타 객체형 데이터
		Map map1 = new HashMap();
		map1.put("key1", "key1Val");
		map1.put("key2", "key2Val");
		map1.put("key3", "key3Val"); // 자바 클래스 대체 끊임없이 씀, 단점 : 메모리 배열보다 많이 친다.
		map1.put("key4", "key4Val");
		map1.put("key5", "key5Val");
		//리스트 맵 형태의 데이터 표형태 데이타
		Map map2 = null;
		List list2 = new ArrayList();
		for(int i = 0; i < 10; i++) {
			map2 = new HashMap();
			map2.put("key1", "key1Val");
			map2.put("key2", "key2Val");
			map2.put("key3", "key3Val");
			map2.put("key4", "key4Val");
			map2.put("key5", "key5Val");
			list2.add(map2);
		}
		
		request.setAttribute("str1", str1);
		request.setAttribute("list1", list1);
		request.setAttribute("map1", map1);
		request.setAttribute("list2", list2);
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
