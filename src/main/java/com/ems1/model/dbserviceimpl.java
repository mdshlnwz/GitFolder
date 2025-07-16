package com.ems1.model;
import java.sql.*;


public class dbserviceimpl implements dbservice {
	private Connection con;
	private Statement stmnt;

	@Override
	public void dbconnect() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","Harsh@123");
			System.out.println(con);
			stmnt = con.createStatement();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			 stmnt.executeUpdate("Delete from user where email='"+email+"'");
			 return result.next(); //result return.next() type is booloean
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	}

}
