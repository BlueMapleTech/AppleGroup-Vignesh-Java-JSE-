package com.pack.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.User;
import com.pack.service.UserService;

/**
 * Servlet implementation class AdminUpdate
 */
public class AdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdate() {
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
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String contactnumber=request.getParameter("contactnumber");
		User m=new User();
		m.setUsername(username);
		m.setEmail(email);
		m.setPassword(password);
		m.setFirstname(firstname);
		m.setLastname(lastname);
		m.setAddress(address);
		m.setContactnumber(contactnumber);
		
		UserService s=new UserService();
		try {
			s.adminUpdate(m);
			//if(s.adminUpdate(m)==2)
			//{
				RequestDispatcher rd = request
						.getRequestDispatcher("AdminLogin.jsp");
				rd.forward(request, response);
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
