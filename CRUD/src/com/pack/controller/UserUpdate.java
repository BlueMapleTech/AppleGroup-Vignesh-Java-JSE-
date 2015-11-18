package com.pack.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.service.UserService;
import com.pack.model.User;

/**
 * Servlet implementation class UserUpdate
 */
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdate() {
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
		
		
		
		HttpSession hp=request.getSession();
		String n=(String) hp.getAttribute("email");
		
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String contactnumber=request.getParameter("contactnumber");
		User m=new User();
		m.setUsername(username);
		m.setEmail(n);
		m.setPassword(password);
		m.setFirstname(firstname);
		m.setLastname(lastname);
		m.setAddress(address);
		m.setContactnumber(contactnumber);
		

		UserService s=new UserService();
	try {
		s.Update(m);
//		if(s.Update(m)==2){

			RequestDispatcher rd = request
					.getRequestDispatcher("UserLogin.jsp");
			rd.forward(request, response);
	//	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
