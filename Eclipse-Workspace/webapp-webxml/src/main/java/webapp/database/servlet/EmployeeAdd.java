package webapp.database.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employeeadd
 */
@WebServlet("/Employeeadd")
public class EmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeid = Integer.parseInt(request.getParameter("employeeid"));
		String employeename = request.getParameter("employeename");
		String employeeplace = request.getParameter("employeeplace");
		String employeeaddress = request.getParameter("employeeaddress");

		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/vtech";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO employee(employeeid,employeename,employeeplace,employeeaddress)VALUES(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, employeeid);
			stmt.setString(2, employeename);
			stmt.setString(3, employeeplace);
			stmt.setString(4, employeeaddress);
			int data = stmt.executeUpdate();
			PrintWriter out = response.getWriter();
			if (data > 0) {
				out.print("record added");
			} else {
				out.print("Error");
			}
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		doGet(request, response);
	}

}
