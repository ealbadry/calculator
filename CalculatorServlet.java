package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	      response.setContentType("text/html");
	      
	      
	      PrintWriter out = response.getWriter();
	        out.print("<html><head><title>Result</title></head><body>");

	        String addNum1String = request.getParameter("add_num1");
	        String addNum2String = request.getParameter("add_num2");
	        String mulNum1String = request.getParameter("mul_num1");
	        String mulNum2String = request.getParameter("mul_num2");
	        if (addNum1String != "" || addNum2String != "") {
	            int addNum1 = Integer.parseInt(addNum1String);
	            int addNum2 = Integer.parseInt(addNum2String);
	            out.print("<h3>" + addNum1 + "+" + addNum2 + "=" + (addNum1 + addNum2) + "</h3>");
	        }
	        if (mulNum1String != "" || mulNum2String != "") {
	            int mulNum1 = Integer.parseInt(mulNum1String);
	            int mulNum2 = Integer.parseInt(mulNum2String);
	            out.print("<h3>" + mulNum1 + "+" + mulNum2 + "=" + (mulNum1 * mulNum2) + "</h3>");
	        }
	        out.print("</body></html>");
	     
	}
	

}
