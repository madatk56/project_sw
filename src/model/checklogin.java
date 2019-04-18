package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class checklogin {
	
	public static  ResultSet getResultSet() {
		JDBCconnection connection = new JDBCconnection();
		String sql ="SELECT * FROM account";
		Connection conn= connection.getConnection();
		try {
			Statement stmt= conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}
	public  boolean checkuser(String user, String pass) {
		ResultSet rs=getResultSet();
		boolean res=false;
		try {
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				if(user.equals(username) && pass.equals(password)) res=true;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

}
