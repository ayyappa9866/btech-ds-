package servletwithjdbc2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DatabaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
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

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            out.println("Error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

