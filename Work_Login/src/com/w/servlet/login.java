package com.w.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class login
 */
@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean forOracle(String... strAr) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.110.106:1521:orcl", "zj", "123");
			Statement statement = con.createStatement();
			String sql = "select username from users where passwd='" + strAr[1] + "' and username='" + strAr[0] + "'";
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean a = forOracle(username, password);
		if (a) {
			request.setAttribute("state", "��¼�ɹ�");
			response.sendRedirect("main.jsp");
		} else {
			// response.getOutputStream().write(new String("��¼ʧ��"));
			
			request.setAttribute("state", "��¼ʧ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}

	}

}
