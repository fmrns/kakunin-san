package jp.abacustech.kakuninSan;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class KakuninSanServlet
 */
//@WebServlet("/KakuninSanServlet")
public final class KakuninSanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KakuninSanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// http://localhost:8080/kakunin-san/KakuninSanServlet
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter w = response.getWriter();
		w.append("コンテキストパス: ").println(request.getContextPath());
		w.append("Request: ").println(request.getRequestURL());
		w.append("Request: ").println(request.getRemoteAddr());
		w.append("Request: ").println(request.getRemotePort());
		w.append("Request: ").println(request.getRemoteUser());
		for (String name: (Iterable<String>)request.getHeaderNames()::asIterator) {
			for (String val: (Iterable<String>)request.getHeaders(name)::asIterator) {
				w.append(name).append(": ").println(val);
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

// end of file
