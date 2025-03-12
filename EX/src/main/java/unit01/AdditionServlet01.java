package unit01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AdditionServlet01 주소모듈 어노테이션
 */
@WebServlet("/AdditionServlet01") //주소 부르기 가능
public class AdditionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L; //직렬화
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/**
	 * Default constructor.
	 */
    public AdditionServlet01() {
        // TODO Auto-generated constructor stub
    }

	/**GET방식
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		PrintWriter out  = response.getWriter();
		out.println("<html><head><title>Addition</title></head>");
		out.println("<body>");
		out.println(num1 + "+"+ num2 + '=' +add);
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
