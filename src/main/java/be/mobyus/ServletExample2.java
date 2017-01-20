package be.mobyus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example2")
public class ServletExample2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			 throws ServletException, IOException {
	        PrintWriter out = resp.getWriter();
	        out.write("POST Example servlet for "+ req.getParameter("name"));
	    }
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			 throws ServletException, IOException {
	        PrintWriter out = resp.getWriter();
	        out.write("GET Example servlet for "+ req.getParameter("name"));
	    }
}
