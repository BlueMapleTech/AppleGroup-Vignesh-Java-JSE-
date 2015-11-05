package com.bluemaple.Servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet({ "/Servlet", "/Servlet1" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
PrintWriter out=response.getWriter();

String n=request.getParameter("username");
String p=request.getParameter("userpassword");

if(p.equals("password"))
{
	RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
	rd.forward(request, response);
	
}
else{
	out.print("sorry error");
	RequestDispatcher rd=request.getRequestDispatcher("Design.html");
	rd.include(request,response);
	}
}

}
