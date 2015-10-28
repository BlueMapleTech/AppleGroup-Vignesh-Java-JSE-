package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Config
 */
public class Config extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config() {
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
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    /*  ServletConfig config=getServletConfig();  
	    String email=config.getInitParameter("email");  
	    out.print("ur email is: "+email); */ 
	          
	    ServletConfig config=getServletConfig();
	    String user=config.getInitParameter("name");
	    String pass=config.getInitParameter("password");
	    
	    String n=request.getParameter("username");
	    String p=request.getParameter("userpassword");

	   if(user.equals(n)&& pass.equals(p))
	   {
		   out.println("sucess");
	   }
	   else
	   {
		   out.println("not sucess");
	   }
	    out.close();  
	}

}
