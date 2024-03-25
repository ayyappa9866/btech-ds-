package com.ayyappa.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DBConnectionCRUD {
	public static void main(String[] args) {
		try {
			String DBUrl = "jdbc:mysql://localhost:3306/studsdb";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DBUrl,"root","Ayyappa123");
			Statement st = con.createStatement();
	String create = "CREATE TABLE IF NOT EXISTS USER(id int,name varchar(20),age int)";
			st.executeUpdate(create);
			System.out.println("Table Created");
			String insert = "INSERT INTO USER VALUES(10,'Raju',30)";
			int row = st.executeUpdate(insert);
			String update = "UPDATE USER SET age=20 WHERE id=10";
			int u = st.executeUpdate(update);
			String delete = "DELETE FROM USER WHERE id=10";
			int d = st.executeUpdate(delete);
			if(row >= 1) {
				System.out.println(row+ " Row Created Sucessfully");
			}else {
				System.out.println("Not Created");
			}
			if(u >= 1) {
				System.out.println(u+ " Row Updated Sucessfully");
			}else {
				System.out.println("Not Updated");
			}
			if(d >= 1) {
				System.out.println(d+ " Row Deleted Sucessfully");
			}else {
				System.out.println("Not Deleted");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
