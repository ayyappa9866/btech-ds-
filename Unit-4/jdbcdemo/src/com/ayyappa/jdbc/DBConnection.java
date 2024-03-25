package com.ayyappa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBConnection {
	public static void main(String[] args) {
		try {
			//1.Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Create Connection
			String DBurl = "jdbc:mysql://localhost:3306/studsdb";
			Connection con = DriverManager.getConnection(DBurl, 
					"root", "Ayyappa123");
			//3.create statement
			Statement st = con.createStatement();
			// 4.Execute Query
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("Roll No :"+rs.getInt(1)+" Name :"
						+rs.getString(2)+" Dept : "+rs.getString(3));
			}
			//5. close connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
