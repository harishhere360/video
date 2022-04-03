package org.techietune;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String username,password,remember;
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.username = request.getParameter("username");	//username,password"remember
	this.password = request.getParameter("password");
	this.remember = request.getParameter("remember");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out = response.getWriter();
		out.print("username is :"+username);
	}

}
