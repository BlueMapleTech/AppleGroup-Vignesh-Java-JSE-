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
 * Servlet implementation class Cookie1
 */
public class Cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie1() {
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
        //request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password"); 
        
        if(name.equals("pandi")&&password.equals("admin"))
        {
        	out.print("sucess");
        	
  
             
    		Cookie ck=new Cookie("name",name);
    		response.addCookie(ck);
    		
        }
        else
        {
        out.print("false");
        RequestDispatcher rd1=request.getRequestDispatcher("login.html");
        rd1.include(request, response);
        }
       out.close();
	}

}
