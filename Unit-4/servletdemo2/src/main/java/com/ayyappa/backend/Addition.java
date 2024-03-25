package com.ayyappa.backend;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Addition extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("tf1"));
		int num2 = Integer.parseInt(req.getParameter("tf2"));
		int sum = num1 + num2;
		PrintWriter out = res.getWriter();
		out.println("<h1>"+"Sum of Two numbers : "+sum+"</h1>");
	}
}
