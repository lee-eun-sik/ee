package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ExController 어노테이션
 */
@WebServlet("/ExController")
public class ExController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			String hangle = request.getParameter("hangle");
			int sum = num1 + num2;
			int minus = num1 - num2;
			response.setContentType("text/html; charset=UTF-8");
//			out.println(hangle);
//			out.println("<html><head></head><body><h2>hello Servlet num1="+num1+" num2="+num2+" sum="+sum+" minus = "+minus+"<h2> </body></html>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("dataView.jsp");//파일 줏소 찾음 
			dispatcher.forward(request, response); //다른걸로 넘어감. 
		} catch (Exception e) {
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			String hangle = request.getParameter("hangle");
			response.setContentType("text/html; charset=UTF-8");
			RequestDispatcher dispatcher = request.getRequestDispatcher("dataView.jsp");
			dispatcher.forward(request, response);
			//out.println(hangle);
			//System.out.println("<html><head></head><body>hello Servlet num1="+num1+" num2="+num2+"</body></html>");
			
			//out.println("<html><head></head><body>java.lang.NumberFormatException</body></html>");
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
