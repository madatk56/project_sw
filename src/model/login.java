package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter writer = response.getWriter();
			String user= request.getParameter("username");
			String pass= request.getParameter("password");
			checklogin check = new checklogin();
			if(check.checkuser(user, pass)==true) {
				 RequestDispatcher rq = request.getRequestDispatcher("/welcome.jsp");
				 request.setAttribute("username", user);
				 rq.forward(request, response);
				
		
		}else response.sendRedirect("/index.jsp");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
