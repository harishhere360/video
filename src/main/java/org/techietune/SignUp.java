package org.techietune;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{
	String email ,firstname,lastname,password,invitationcode;
	private static final long serialVersionUID = -3362835534379149291L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.email=request.getParameter("email");
		this.firstname=request.getParameter("firstname");
		this.lastname=request.getParameter("lastname");
		this.password=request.getParameter("passwd");
		this.invitationcode=request.getParameter("icode");
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out = response.getWriter();
		out.print(email+firstname+"<br>"+lastname+"<br>"+password+"<br>"+invitationcode);
	}
}
