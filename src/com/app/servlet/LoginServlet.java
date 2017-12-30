package com.app.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
				//get the parameters from page
			String uname = request.getParameter("uname");
			String upwd = request.getParameter("upwd");
			//create the request dispatcher object
				RequestDispatcher requestDispatcher = null;
				//check the credentials are correct or not
					if(uname.equals("pratik") && upwd.equals("dimble"))
					{
						//if corrent goto succcess page and print message
							requestDispatcher = request.getRequestDispatcher("/successhome.jsp");
								requestDispatcher.forward(request, response);
					}else
					{
						//else goto failure page and print message
						requestDispatcher = request.getRequestDispatcher("/failurehome.jsp");
							requestDispatcher.forward(request, response);
					}
		}//doPost(-,-)close

	}//class close
