package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.model.User;
import com.pack.service.UserService;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		// TODO Auto-generated method stub
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		hs.setAttribute("email", email);
		
		User m=new User();
		m.setPassword(password);
		m.setEmail(email);
		UserService u=new UserService();
		try {
			if(u.login(m)==3)
			{
				RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
	             rd.forward(request, response);
			}
			else if(u.login(m)==2){
				RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
	             rd.forward(request, response);
			}
			else{
				out.print("error");
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
	             rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
