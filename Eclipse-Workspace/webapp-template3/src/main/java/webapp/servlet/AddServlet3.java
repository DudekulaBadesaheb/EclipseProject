package webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlet3 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int number1;
		int number2;
		int number3;
		int result;
		int mulResult;
		int mulTree;
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");
		String c = request.getParameter("number3");
		number1 = Integer.parseInt(a);
		number2 = Integer.parseInt(b);
		number3 = Integer.parseInt(c);
		result = number1 + number2+number3;
		mulResult = number1*number2;
		mulTree=number1*number2*number3;
		// System.out.println("The result is: " + result);
		PrintWriter out = response.getWriter();
		out.println("The result is: " + result);
		PrintWriter out1 = response.getWriter();
		out1.println("multwo numbers :"+mulResult);
		out1.println("mulTree number :"+mulTree);
		}
	}


