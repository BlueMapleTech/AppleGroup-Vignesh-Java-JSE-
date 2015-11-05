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
 * Servlet implementation class AddUserField
 */
public class AddUserField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserField() {
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
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String contactnumber=request.getParameter("contactnumber");
		 String role=request.getParameter("role");
		 int h=0;
		 if(role.equals("admin")){
			 h=1;
		 }else if(role.equals("user")){
			 h=2;
		 }
		 User z=new User();
		 z.setId(h);
		 z.setUsername(username);
		 z.setPassword(password);
		 z.setEmail(email);
		 z.setFirstname(firstname);
		 z.setLastname(lastname);
		 z.setAddress(address);
		 z.setContactnumber(contactnumber);
		 UserService t=new UserService();
		 try {
			t.adduser(z);
           // if(t.adduser(z)==1){
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
             rd.forward(request, response);
           // }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
