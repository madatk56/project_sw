package controller;
import java.sql.*;

import model.JDBCconnection;
public class showinfo {
	public  showinfo() {
		Connection conn= JDBCconnection.getConnection();
		
		try {
			Statement stm = conn.createStatement();
			String sql = "SELECT * FROM employee";
			ResultSet rs= stm.executeQuery(sql);
			while(rs.next()) {
				String employeeNumber = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				Date date = rs.getDate(4);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
