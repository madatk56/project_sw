package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.JDBCconnection;

/**
 * Servlet implementation class showallinfor
 */
@WebServlet("/showallinfor")
public class showallinfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showallinfor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				request.setAttribute("employeeNumber", employeeNumber);
				request.setAttribute("firstName", firstName);
				request.setAttribute("lastName", lastName);
				request.setAttribute("date", date);
				response.sendRedirect("showinfor.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
