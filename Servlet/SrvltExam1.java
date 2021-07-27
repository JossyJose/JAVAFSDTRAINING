package Servlt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( name="SrvltExam1",
description="Servlet with Annotation",
urlPatterns={"/SrvltExam1","/HelloWorld"})
public class SrvltExam1 extends HttpServlet {
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        System.out.println("Get method of Welcome Servlet");
	    }
	    
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException
	    {
	        System.out.println("Post method of Welcome Servlet");
	    }
}
