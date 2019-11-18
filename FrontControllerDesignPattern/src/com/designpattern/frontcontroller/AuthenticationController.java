package com.designpattern.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationController
 */
@WebServlet("/AuthenticationController")

public class AuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("uName");
		String password=request.getParameter("pwd");
		request.setAttribute("userName", userName);
		
		if(userName.equalsIgnoreCase("vinod")&&password.equals("vinod123"))
			{
			   RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
			   rd.forward(request, response);
			   
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("/error.jsp");
				   rd.forward(request, response);
			}
	}

}
