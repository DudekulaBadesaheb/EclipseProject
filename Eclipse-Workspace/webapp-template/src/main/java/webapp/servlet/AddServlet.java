package webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int number1;
		int number2;
		int result;
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");
		number1 = Integer.parseInt(a);
		number2 = Integer.parseInt(b);
		result = number1 + number2;
		// System.out.println("The result is: " + result);
		PrintWriter out = response.getWriter();
		out.println("The result is: " + result);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int number1;
		int number2;
		int result;
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");
		number1 = Integer.parseInt(a);
		number2 = Integer.parseInt(b);
		result = number1 + number2;
		// System.out.println("The result is: " + result);
		PrintWriter out = response.getWriter();
		out.println("The result is: " + result);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int number1;
		int number2;
		int result;
		String a = request.getParameter("number1");
		String b = request.getParameter("number2");
		number1 = Integer.parseInt(a);
		number2 = Integer.parseInt(b);
		result = number1 + number2;
		// System.out.println("The result is: " + result);
		PrintWriter out = response.getWriter();
		out.println("The result is: " + result);
	}
}
