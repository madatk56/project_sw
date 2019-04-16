package model;

import java.sql.*;

public class connection {
	
	public static boolean checkuser(String user, String pass) {
		boolean res=false;
		if(user==null&& pass==null) return true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myacount","root","13011999");
			Statement stm = conn.createStatement();
			String sql="SELECT * FROM acount";
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				String username = rs.getString(1);
				String password = rs.getString(2);
				if(user.equals(username) && pass.equals(password)) {
					res = true;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
		
	}
	
}
