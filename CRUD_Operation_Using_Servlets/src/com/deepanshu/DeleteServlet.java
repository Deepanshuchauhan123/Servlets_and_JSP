package com.deepanshu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String sid=request.getParameter("id");
		 System.out.println("Delete id   ="+sid);
	        int id=Integer.parseInt(sid);  
	        Employee_Data_Operations.delete(id);  
	        response.sendRedirect("ViewServlet");
	}

}
