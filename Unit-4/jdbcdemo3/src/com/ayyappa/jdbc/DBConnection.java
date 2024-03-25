package com.ayyappa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String DBUrl = "jdbc:mysql://localhost:3306/studsdb";
			Connection con = DriverManager.getConnection(DBUrl, "root", "Ayyappa123");
			String insert = "INSERT INTO USER VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(insert);
			st.setInt(1, 1001);
			st.setString(2,"Sunitha");
			st.setInt(3, 28);
			int r = st.executeUpdate();
			if(r >= 1) {
				System.out.println(r+" Rows Inserted");
			}else {
				System.out.println("Rows Not Inserted");
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
