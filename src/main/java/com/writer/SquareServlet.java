package com.writer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
		int a= Integer.parseInt(req.getParameter("z"));
		 a= a*a;
		 
		 PrintWriter out=res.getWriter();
		 
		out.println("Answer is "+ a);
		
		
	}

}
