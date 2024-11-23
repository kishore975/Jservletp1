package com.writer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int x=Integer.parseInt(req.getParameter("number1"));
		int y=Integer.parseInt(req.getParameter("number2"));
		int z=x+y;
		
//		PrintWriter out=res.getWriter();
//		out.println("Result :"+ z);
//		
//		req.setAttribute("value",z);
//		
//		RequestDispatcher rd= req.getRequestDispatcher("/square");
//		rd.forward(req, res);
		
		res.sendRedirect("square?z="+z);
		
		
		
	}

}
