package com.ayyappa.backend;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addStudent")
public class StudentDAO extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Student> stu = new ArrayList<>();
	public static Connection getDBConnection() throws 
	ClassNotFoundException, SQLException {
		// 1. Register The Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.Create The Connection
		String DBURL = "jdbc:mysql://localhost:3306/studsdb";
		Connection con = DriverManager.getConnection(DBURL,"root","Ayyappa123");
		return con;
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String dept = req.getParameter("dept");
		PrintWriter out = res.getWriter();
		try {
			Connection con = getDBConnection();
			String insert = "INSERT INTO student VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(insert);
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, dept);
			int row = st.executeUpdate();
			if(row > 0) {
				System.out.println(row+" Rows Inserted Sucessfuly");
			}else {
				System.out.println("Not Inserted");
			}
			String select = "SELECT * FROM student";
			PreparedStatement st1 = con.prepareStatement(select);
			ResultSet rs = st1.executeQuery();
			while(rs.next()) {
				Student s1 = new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				stu.add(s1);
			}
			out.println("<html> <head><title>Student</title></head><body>");
			out.println("<table align=\"center\" border=\"2\" cellpadding=\"20\">");
			out.println("<tr><th>Id No</th><th>Name</th><th>Dept</th></tr>");
			for(Student s1:stu) {
				out.println("<tr><td>"+s1.getRollNo()+"</td><td>"+s1.getName()
				+"</td><td>"+s1.getDept()+"</td></tr>");
			}
			out.println("</body></html>");
			//5. close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
