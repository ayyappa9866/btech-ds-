package servletwithjdbc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/")
public class ServletWithJdbc extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		  resp.setContentType("text/html");
	      PrintWriter out = resp.getWriter();

		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampleDB", "root", "Ayyappa123");
			 Statement statement = con.createStatement();

	            // Create a table
	            String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
	                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
	                    + "name VARCHAR(50),"
	                    + "email VARCHAR(50))";
	            statement.executeUpdate(createTableSQL);
	            // Insert data
	            String insertDataSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
	            statement.executeUpdate(insertDataSQL);


	            out.println("<html><body>");
	            out.println("<h2>Table created and data inserted successfully!</h2>");
	            out.println("</body></html>");

	            statement.close();
	            con.close();


		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
