package com.ayyappa.backend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Add extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("t1"));
		int num2 = Integer.parseInt(req.getParameter("t2"));
		int sum = num1 + num2;
		PrintWriter out = res.getWriter();
		out.println("<h1>Sum Of Two Numbers is : "+sum+"</h1>");
	}
}
