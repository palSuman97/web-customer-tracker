package testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDBConnection
 */
@WebServlet("/TestDBConnection")
public class TestDBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jdbcUrl= "jdbc:mysql://localhost:3306/web_customer_tracker";
		String user= "udemySpringChadDardy";
		String password= "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(jdbcUrl,user,password);
			PrintWriter out=response.getWriter();
			out.print("Success!");
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
