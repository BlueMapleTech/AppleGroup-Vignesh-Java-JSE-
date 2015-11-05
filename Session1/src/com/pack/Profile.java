package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        RequestDispatcher rd=request.getRequestDispatcher("link.html");
        rd.include(request, response);
		Cookie ck[]=request.getCookies();  
	        if(ck!=null){  
	         String name=ck[0].getValue();  
	        if(!name.equals("")||name!=null){  
	            out.print("<b>Welcome to Profile</b>");  
	            out.print("<br>Welcome, "+name);  
	        }  
        
    }
	        else{  
	            out.print("Please login first");
	            RequestDispatcher rd1=request.getRequestDispatcher("login.html");
	            rd1.include(request, response);
	}
		
	        }
	
}
