package com.w.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import javax.websocket.Session;

import com.w.entity.Employee;

/**
 * Servlet implementation class GetEmployee
 */
@WebServlet("/GetEmployee.do")
public class GetEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee emp1 = new Employee("1", "小王", "经理", "男", "100000", "2015-9-9");
		Employee emp2 = new Employee("2", "小李", "职员", "女", "6000", "2015-9-9");
		Employee emp3 = new Employee("3", "张三", "会计", "男", "8000", "2015-9-9");
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		HttpSession session = request.getSession();
		session.setAttribute("emp", emp);
		response.sendRedirect("table.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
